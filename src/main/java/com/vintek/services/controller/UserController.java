package com.vintek.services.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.validation.Validator;

import com.vintek.database.model.user.User;
import com.vintek.database.service.MojaveDB;
import com.vintek.services.rest.ServiceException;
//import com.vintek.services.security.Secure;
//import com.vintek.services.security.SecurityManager;
//import com.vintek.services.security.SecurityToken;

@Model
//@Secure
public class UserController {

   @Inject
   private Logger log;

   
   @Inject @UserEventType(eventType = "register")
   private Event<User> registerUserEvent;

   @Inject @UserEventType(eventType = "unregister")
   private Event<User> unRegisterUserEvent;   
   

   @Inject
   private MojaveDB mojaveDB;
   
//	@Inject
//	private SecurityManager securityManager;
   
   @Inject
   private Validator validator;
   
   private User currentUser;  //user being edited
   
   @PostConstruct
   public void init() {
	   initNewUser();
   }
   
   public void initNewUser() {
	   setCurrentUser(new User());
   }
   
	public List<User> getAllUsers() throws NoResultException {
		final List<User> users = mojaveDB.findWithNamedQuery("User.ALL");      
		return users;
	}
   
	public User getUser(int id) throws NonUniqueResultException, EntityNotFoundException {
		return (User) mojaveDB.find(User.class, id);
	}
	
	public User getUser(String userId) throws NonUniqueResultException, EntityNotFoundException {       
		return (User) mojaveDB.findWithNamedQuerySingleResult("User.ByUserId", userId);
	}		
   
	public User createUser(User user) throws ConstraintViolationException, ValidationException, ServiceException {
//		try {
			validateUser(user);

			if (userIdAlreadyExists(user.getUserID())) {
				throw new ValidationException("Unique UserId Violation");
			}

			User newUser = null;
			try {
				newUser = mojaveDB.create(user);
				registerUserEvent.fire(newUser); // add the user in the cache
			} catch (Exception e) {
				throw new ServiceException(e);
			}
			return newUser;
//		} catch (ConstraintViolationException ce) { // bean validation issues
//			builder = createViolationResponse(ce.getConstraintViolations());
//		} catch (ValidationException e) { // unique constrain violation
//			Map<String, String> responseObj = new HashMap<String, String>();
//			responseObj.put("email", "Email taken");
//			builder = Response.status(Response.Status.CONFLICT).entity(responseObj);
//		} catch (Exception e) { // generic exceptions
//			Map<String, String> responseObj = new HashMap<String, String>();
//			responseObj.put("error", e.getMessage());
//			builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//		}
	}

   /**
	* <p>
	* Validates the given User variable and throws validation exceptions based on the type of error. If the error is standard
	* bean validation errors then it will throw a ConstraintValidationException with the set of the constraints violated.
	* </p>
	* <p>
	* If the error is caused because an existing member with the same userId is registered it throws a regular validation
	* exception so that it can be interpreted separately.
	* </p>
	* 
	* @param user User to be validated
	* @throws ConstraintViolationException If Bean Validation errors exist
	* @throws ValidationException If member with the same email already exists
	*/
	private void validateUser(User user) throws ValidationException {
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		if (!violations.isEmpty()) {
			throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
		}
	}

   /**
	* Checks if a member with the same email address is already registered. This is the only way to easily capture the
	* "@UniqueConstraint(columnNames = "email")" constraint from the User1 class.
	* 
	* @param email The email to check
	* @return True if the email already exists, and false otherwise
	*/
	public boolean userIdAlreadyExists(String userId) {
		List<User> users = null;
		try {
			users = mojaveDB.findWithNamedQuery("User.ByUserId", userId);
		} catch (NoResultException e) {
			// ignore
		}
		return ((users != null) && (users.size()>0));
	}

	public User update(User user) throws ValidationException, ServiceException {
        validateUser(user);
        User updatedUser = null;
        try {
        	updatedUser = mojaveDB.update(user);
        	registerUserEvent.fire(updatedUser); // add the user in the cache  
        } catch (Exception e) {
        	throw new ServiceException(e);
        }
        return updatedUser;
	}

	public void delete(int id) throws ServiceException{
        try {
        	User delUser = mojaveDB.find(User.class, id);
        	mojaveDB.delete(User.class, id);
        	unRegisterUserEvent.fire(delUser); // remove the user in the cache 
        } catch (Exception e) {
        	throw new ServiceException(e);
        }
	}
	
   public void selectCurrentUser(Integer user_id) {
	   setCurrentUser((User)mojaveDB.find(User.class, user_id));
   }

   public void newUser() throws Exception {
	   
   }
   public void cloneUser() throws Exception {
	   
   }
   public void changePassword() throws Exception {
	   
   }
   public void save() throws Exception {
	   registerUserEvent.fire(currentUser);
      initNewUser();
   }

   public User getCurrentUser() {
	   return currentUser;
   }

   public void setCurrentUser(User currentUser) {
	   this.currentUser = currentUser;
   }
}
