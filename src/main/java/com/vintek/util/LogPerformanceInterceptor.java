package com.vintek.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.lang.time.StopWatch;

/**
 * @author Dritan Xhezo
 */
@LogPerformance @Interceptor
public class LogPerformanceInterceptor {

	private static Logger logger = Logger.getLogger("PerformanceLog");  
    private static FileHandler fh;
        
    private static final int logSize = 5000;  // get these values from the logging.properties file
    private static final int logRotationCount = 10;

    static {
	    try {
	    	String appName = (String) new InitialContext().lookup("java:app/AppName");
	    	String logFileNamePattern = System.getProperty("jboss.server.log.dir") + File.separator + appName +  "-performance.%u.%g.log";  

	        fh = new FileHandler(logFileNamePattern, logSize, logRotationCount, true);
	        fh.setFormatter(new SimpleFormatter());
	        logger.addHandler(fh);
	        logger.setUseParentHandlers(false);
	    } catch (SecurityException | IOException | NamingException e) {  
	        e.printStackTrace();
		}
    }
    
	@AroundInvoke
	public Object logPerformance(InvocationContext joinPoint) throws Exception {
		String objectName = joinPoint.getTarget().getClass().getName();
		String className = objectName.substring(0, objectName.indexOf("$"));
		String methodName = joinPoint.getMethod().getName();		
		Object[] parameters = joinPoint.getParameters();
		
		StringBuilder invocationDetails = new StringBuilder();
		invocationDetails.append("Class: ["+className+"] ");
		invocationDetails.append("Method: ["+methodName+"] ");
		invocationDetails.append("Params: [");
		for (Object param: parameters) {
			invocationDetails.append(param.toString() + ","); //get type
		}

		StopWatch watch = new StopWatch();
		watch.start();
		try {
			return joinPoint.proceed();
		} finally {
			watch.stop();
			logger.info("Time: [" + watch.getTime() + "] " + invocationDetails.toString());
		}
	}
	
    @PreDestroy
    public void cleanup(InvocationContext ctx) {
    	fh.close();
    }	
}