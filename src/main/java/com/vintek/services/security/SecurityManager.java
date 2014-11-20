package com.vintek.services.security;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.tree.xpath.XPathExpressionEngine;
import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.lang.StringUtils;

public class SecurityManager {
	private static ThreadLocal<SecurityToken> currentToken = new ThreadLocal<SecurityToken>();
	
	private static final String securityConfig = "com/vintek/services/security/security-config.xml";
	private HierarchicalConfiguration config = null;
	private JexlEngine jexlEngine;
	private static Pattern vars = Pattern.compile("\\#(.*)\\.");  //ex  #jfsdbfjsdk.ddjgk
	
	public static void main(String[] args) {
		System.out.println("hello");
		SecurityManager manager = new SecurityManager();
		System.out.println(manager.isAllowed("com.vintek.services.controller.UserController", "login", null));
		
	}
	
	public SecurityManager() {
		try {
			config = new XMLConfiguration(securityConfig);
			config.setExpressionEngine(new XPathExpressionEngine());
			jexlEngine = new JexlEngine();
			jexlEngine.setSilent(true);
			jexlEngine.setLenient(true);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static void placeSecurityToken(SecurityToken token) {
		currentToken.set(token);
	}

	public static void clearSecurityToken() {
		currentToken.set(null);
	}

	public boolean isAllowed(String object, String method, Object[] parameters) {
		boolean allowed = true;
		SecurityToken token = currentToken.get();
		
		
		// check if user is logged in/ if he has the right permissions and fulfills the condition in the .xml
		//List<String> conditions = config.getList("class[@name=" + object + "]/method[@name=" + method + "]/condition");
		List<Object> conditions = config.getList("class[@name='" + object + "']/method[@name='" + method + "']/condition");
		for (Object condition: conditions) {
			allowed = allowed && (evalCondition(condition.toString()));
		}
		
		return allowed; //token.isAllowed();
	}

	private boolean evalCondition(String condition) {
		System.out.println(condition);
//		Expression expression = jexlEngine.createExpression(condition); // "(a || b && (c && d))");
//		JexlContext jexlContext = new MapContext();
//
//		Matcher m = vars.matcher(condition);
//		while(m.find()) {
//			String varname = condition.substring(m.start(), m.end());// m.group(0);
//			jexlContext.set(varname, !StringUtils.isBlank(BeanUtils.getProperty(compassRequest, token)));
//		}
//		
//		
//		String[] tokens = condition.split("\\s");
//		for (int i = 0; i < tokens.length; i++) {
//			String token = tokens[i].trim();
//			if (!("and".equalsIgnoreCase(token) || "or".equalsIgnoreCase(token))) {
//				jexlContext.set(token, !StringUtils.isBlank(BeanUtils.getProperty(compassRequest, token)));
//			}
//		}
//		return (Boolean) expression.evaluate(jexlContext);
		return true;
	}

	public String getCurrentUserId() {
		SecurityToken token = currentToken.get();
		if (token != null) {
			return token.getUserId();
		} else {
			return "Unknown";
		}
	}
	
	public boolean isLoggedIn() {
		SecurityToken token = currentToken.get();
		return token != null;
	}
}
