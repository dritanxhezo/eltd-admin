package com.vintek.services.security;

import java.util.Map;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author Dritan Xhezo
 */
@SecuredService @Interceptor
public class SecurityInterceptor {

	@Inject
	private SecurityManager securityManager;

	@AroundInvoke
	public Object checkSecurity(InvocationContext joinPoint) throws Exception {
		System.out.println("In SecurityInterceptor");

		String className = joinPoint.getTarget().getClass().getName();
		String objectName = className.substring(0, className.indexOf("$"));
		String operationName = joinPoint.getMethod().getName();		
		Object[] parameters = joinPoint.getParameters();
		
		Map<String, Object> ctxData = joinPoint.getContextData();
		for(String key: ctxData.keySet()) {
			System.out.println(ctxData.get(key).toString());
		}
		
		System.out.println("op name: " + operationName);
		System.out.println("ob name: " + objectName);

		/* If the user is not logged in, don't let them use this method */
		/*if (!securityManager.isLoggedIn()) {
			throw new SecurityViolationException();
		}*/
		
		/*
		 * Invoke the method or next Interceptor in the list, if the current
		 * user is allowed.
		 */
		if (!securityManager.isAllowed(objectName, operationName, parameters)) {
			throw new SecurityViolationException();
		}

		return joinPoint.proceed();
	}
}