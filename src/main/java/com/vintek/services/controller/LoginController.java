package com.vintek.services.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;
import com.vintek.services.rest.ServiceException;
import com.vintek.services.security.SecuredService;
import com.vintek.services.security.SecurityManager;
import com.vintek.services.security.SecurityToken;
import com.vintek.util.Encrypter;

// The @Model stereotype is a convenience mechanism to make this a request-scoped bean that has an EL name
// Read more about the @Model stereotype in this FAQ:
// http://sfwk.org/Documentation/WhatIsThePurposeOfTheModelAnnotation
//@RequestScoped
//@Model
@SecuredService //@LogPerformance
public class LoginController {

   @Inject
   private Logger log;

   @Inject
   private MojaveDB mojaveDB;
   
//	@Inject
//	private SecurityManager securityManager;
   
   private static final String SESSION_USER = "user";
   
	public void login(HttpServletRequest request) throws ServiceException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String pin = request.getParameter("pin");
		log.info("User Loging: " + userId + ", password: " + password + ", pin: " + pin);
		
		validateLogin(userId, password, pin);

    	Encrypter encrypter = new Encrypter();
    	String encPassword = encrypter.encrypt(password);
    	User loggedUser = null;
    	
	    try {
	    	List<User> users = mojaveDB.findWithNamedQuery("User.ByUserId", userId);
	    	for (User user: users) {
				if (encPassword.equals(user.getPasswordEnc()) && pin.equals(user.getPin()) && user.isEnabled()) {
					loggedUser = user;
				}
	    	}
	    } catch (Exception e) {
	    	log.log(Level.SEVERE, "Could not load the user from the database" + e.getMessage(), e);
	        throw new ServiceException(Response.Status.INTERNAL_SERVER_ERROR, "An exception occurred while servicing this request");
	    }	
	    	
    	if (loggedUser!=null) {
    		request.getSession().setAttribute(SESSION_USER, loggedUser);
    		
//    		List<UserPermission> userPermissions = loggedUser.getUserPermissions();
//    		for (UserPermission up: userPermissions) {
//    			if (up.getOrganizationID()==loggedUser.getDefaultOrgID()) {
//    				up.getPrivileges()
//    			}
//    		}
    		SecurityManager.placeSecurityToken(new SecurityToken(loggedUser.getUserID(), loggedUser.getDefaultOrgID(), null));
    	} else {
    		throw new ServiceException(Response.Status.UNAUTHORIZED, "The credentials provided are not valid.");
    	}
	}
	
	private void validateLogin(String strUser, String strPassword, String strPIN) throws ServiceException {
		if (strUser == null || strUser.trim().isEmpty() ||
			strPassword == null || strPassword.trim().isEmpty() ||
			strPIN == null || strPIN.trim().isEmpty()) {
			throw new ServiceException(Response.Status.BAD_REQUEST, "Must provide non empty credentials.");
		}		
	}
	
	public void logout(HttpServletRequest request) throws ServiceException {
		if (request.getSession()==null || request.getSession().getAttribute(SESSION_USER)==null) {
			throw new ServiceException(Response.Status.BAD_REQUEST, "Not logged in.");
		} else { 
	    	request.getSession().invalidate();
	    	SecurityManager.clearSecurityToken();
	    }
	}

	public void forgotPassword(HttpServletRequest request) throws ServiceException {
		// TODO send an email to reset the password
	}

	public void forgotUserId(HttpServletRequest request) throws ServiceException {
		// TODO send an email to remind of the user id
	}

	public void resetPassword(HttpServletRequest request) throws ServiceException {
		// TODO find the user / put the user in the forget password session key / send back an id for the change password page ???		
	}
}
