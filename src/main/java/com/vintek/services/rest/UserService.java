package com.vintek.services.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.vintek.database.model.user.User;
import com.vintek.services.controller.UserController;

@Path("/user")
@Stateless
public class UserService {

    @Inject
    private Logger log;

    @Context
    UriInfo uriInfo;    
    
    @Inject
    private UserController controller;

    
    
//    @Inject
//    private Validator validator;

//    @Inject
//    UserRegistration registration;
//
//    @Inject
//    MojaveDB mojaveDB;
    
	@GET	
	@Produces(APPLICATION_JSON)
//	@JsonView(Views.Public.class)
    public Response getUsers() {
		final List<User> users = controller.getAllUsers();
		return Response.ok(users).build();
    }

	@GET
	@Path("/{id:[0-9][0-9]*}")	
	@Produces(APPLICATION_JSON)
    public Response getUserById(@PathParam("id") int id) {
		User user = controller.getUser(id);
		return Response.ok(user).build();
    }

	@GET  
	@Path("/{userId}")	
	@Produces(APPLICATION_JSON)
    public Response getUserByName(@PathParam("userId") String userId) {
		User user = controller.getUser(userId);
		return Response.ok(user).build();
    }
	
	
//    @Path("/")
//    @POST
//    @Consumes(APPLICATION_FORM_URLENCODED)
//    @Produces(APPLICATION_JSON)
//    public Response create(@FormParam("capital") String capital, @FormParam("name") String name) {
//        Country country = new Country(capital, name);
//        countryRepository.create(country);
//        logger.info("created country with name {} and capital {}", country.getName(), country.getCapital());
//        return Response.created(uriInfo.getAbsolutePathBuilder().path(name).build()).build();
//
//    }
	
	@POST
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	public Response createUser(User user) throws ConstraintViolationException, ValidationException, ServiceException {
		User userCreated = controller.createUser(user);
		return Response.created(uriInfo.getAbsolutePathBuilder().path(userCreated.getUserID()).build()).build();
		
//       Response.ResponseBuilder builder = null;
//       try {
//           validateMember(user);
//           registration.register(user);
//           return Response.ok().build();
//       } catch (ConstraintViolationException ce) {   			// bean validation issues
//           builder = createViolationResponse(ce.getConstraintViolations());
//       } catch (ValidationException e) {						// unique constrain violation 
//           Map<String, String> responseObj = new HashMap<String, String>();
//           responseObj.put("email", "Email taken");
//           builder = Response.status(Response.Status.CONFLICT).entity(responseObj);
//       } catch (Exception e) {									// generic exceptions 
//           Map<String, String> responseObj = new HashMap<String, String>();
//           responseObj.put("error", e.getMessage());
//           builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//       }
//       return builder.build();
   }
   
    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response updateUser(User user) throws ValidationException, ServiceException {
		User updatedUser = controller.update(user);
		return Response.created(uriInfo.getAbsolutePathBuilder().path(updatedUser.getUserID()).build()).build();
    }
	
    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response deleteUser(@PathParam("id") int id) throws ServiceException {
    	controller.delete(id);
        return Response.noContent().build();
    }
	
	
/*	@POST
	@Path("/createUsers")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
   public Response createUsers(List<User> users) throws Exception {  //ConstraintViolationException, ValidationException {
//       Response.ResponseBuilder builder = null;
//       try {
    	   for (User user: users) {    	   
	           validateMember(user);
	           registration.register(user);
    	   }
           return Response.ok().build();
//       } catch (ConstraintViolationException ce) {				// bean validation issues 
//           builder = createViolationResponse(ce.getConstraintViolations());
//       } catch (ValidationException e) {						// unique constrain violation 
//           Map<String, String> responseObj = new HashMap<String, String>();
//           responseObj.put("userId", "User Id taken");
//           builder = Response.status(Response.Status.CONFLICT).entity(responseObj);
//       } catch (Exception e) {									// generic exceptions 
//           Map<String, String> responseObj = new HashMap<String, String>();
//           responseObj.put("error", e.getMessage());
//           builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//       }
//       return builder.build();
    }    
*/
//   /**
//    * <p>
//    * Validates the given User variable and throws validation exceptions based on the type of error. If the error is standard
//    * bean validation errors then it will throw a ConstraintValidationException with the set of the constraints violated.
//    * </p>
//    * <p>
//    * If the error is caused because an existing member with the same userId is registered it throws a regular validation
//    * exception so that it can be interpreted separately.
//    * </p>
//    * 
//    * @param user User to be validated
//    * @throws ConstraintViolationException If Bean Validation errors exist
//    * @throws ValidationException If member with the same email already exists
//    */
//   private void validateMember(User user) throws ConstraintViolationException, ValidationException {
//       Set<ConstraintViolation<User>> violations = validator.validate(user);
//       if (!violations.isEmpty()) {
//           throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
//       }
//
//       if (userIdAlreadyExists(user.getUserID())) {
//           throw new ValidationException("Unique UserId Violation");
//       }
//   }

//   /**
//    * Creates a JAX-RS "Bad Request" response including a map of all violation fields, and their message. This can then be used
//    * by clients to show violations.
//    * 
//    * @param violations A set of violations that needs to be reported
//    * @return JAX-RS response containing all violations
//    */
//   private Response.ResponseBuilder createViolationResponse(Set<ConstraintViolation<?>> violations) {
//       log.fine("Validation completed. violations found: " + violations.size());
//       Map<String, String> responseObj = new HashMap<String, String>();
//       for (ConstraintViolation<?> violation : violations) {
//           responseObj.put(violation.getPropertyPath().toString(), violation.getMessage());
//       }
//       return Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//   }

//   /**
//    * Checks if a member with the same email address is already registered. This is the only way to easily capture the
//    * "@UniqueConstraint(columnNames = "email")" constraint from the User1 class.
//    * 
//    * @param email The email to check
//    * @return True if the email already exists, and false otherwise
//    */
//   public boolean userIdAlreadyExists(String userId) {
//	   List<User> users = null;
//       try {
//    	   users = mojaveDB.findWithNamedQuery("User.ByUserId", userId);
//       } catch (NoResultException e) {
//           // ignore
//       }
//       return ((users != null) && (users.size()>0));
//   }
   
	
	/*
	CreateUser(UserSettings, SecurityGroups, Permissions) – to create a single user
	ModifyUser(UserId, UserSettings, SecurityGroups, Permissions) – to modify a single user
	ModifyUsers(UserFilter, UserSettings, SecurityGroups, Permissions) – same a single user, but discard any individual properties, such as user id, name, email, phone etc)
	DisableUser(UserId)
	FindUsers(UserFilter)
	
	UserId is the same id that is/will be used to login to Vintek Time. UserFilter consists of one or multiple criteria that will be used to search for a user or list of users – such as UserId, Name, Status, Permissions etc
	*/   
}
