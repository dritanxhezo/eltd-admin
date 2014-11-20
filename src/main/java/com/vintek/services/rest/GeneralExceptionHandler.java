package com.vintek.services.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.vintek.services.security.SecurityViolationException;

@Provider
public class GeneralExceptionHandler implements ExceptionMapper<Exception> {

	@Inject
	private Logger log;
	
	@Override
	public Response toResponse(Exception e) {	
		
		if (e instanceof ServiceException) {
			log.log(Level.SEVERE, e.getMessage(), e);
			ServiceException se = (ServiceException) e;
			return Response.status(se.getResponseStatus()).entity(se.getMessage()).build();
			
		} else if (e instanceof ConstraintViolationException) {    // data input validation
			ConstraintViolationException cve = (ConstraintViolationException) e;
			Set<ConstraintViolation<?>> violations = cve.getConstraintViolations();
			log.fine("Validation completed. violations found: " + violations.size());
			Map<String, String> responseObj = new HashMap<String, String>();
			for (ConstraintViolation<?> violation : violations) {
				responseObj.put(violation.getPropertyPath().toString(), violation.getMessage());
			}
			return Response.status(Response.Status.BAD_REQUEST).entity(responseObj).build();
			
		} else if (e instanceof ValidationException) {           // unique constrain violation - duplicate entities						
			return Response.status(Response.Status.CONFLICT).entity(e.getMessage()).build();
			
		} else if (e instanceof SecurityViolationException) {
			return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
		
		} else if (e instanceof NonUniqueResultException) {
			return Response.status(Response.Status.NOT_FOUND).entity("Not Found " + e.getMessage()).build();
			
		} else if ((e instanceof EntityNotFoundException) || (e instanceof NoResultException)) {
			return Response.status(Response.Status.NOT_FOUND).entity("Not Found " + e.getMessage()).build();
			
			
		} else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("An unexpected exception occurred. " + e.getMessage()).build();
		}
	}
}
