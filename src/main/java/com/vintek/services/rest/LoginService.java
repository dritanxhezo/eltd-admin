package com.vintek.services.rest;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.vintek.services.controller.LoginController;
import com.vintek.services.rest.ServiceException;

@Path("/login")
public class LoginService {

	@Inject
	private Logger log;

	@Inject
	LoginController controller;

	@POST
	@Path("/login")
	public Response login(@Context HttpServletRequest request) throws ServiceException {
		controller.login(request);
		return Response.status(Response.Status.OK).entity("Logged in as " + request.getParameter("userId")).build();
	}

	@POST
	@Path("/logout")
	public Response logout(@Context HttpServletRequest request) throws ServiceException {
		controller.logout(request);
		return Response.status(Response.Status.OK).entity("Logged out").build();
	}
	
	@POST
	@Path("/forgotpass")
	public Response forgotPassword(@Context HttpServletRequest request, @Context HttpServletResponse response) throws ServiceException {
		controller.forgotPassword(request);
		return Response.status(Response.Status.OK).entity("Forgot password for " + request.getParameter("userId") + " processed.").build();
	}

	@POST
	@Path("/resetpass")
	public Response resetPassword(@Context HttpServletRequest request, @Context HttpServletResponse response) throws ServiceException {
		controller.resetPassword(request);
		return Response.status(Response.Status.OK).entity("Reset password for " + request.getParameter("userId") + " processed.").build();
	}

	@POST
	@Path("/forgotuserid")
	public Response forgotUserId(@Context HttpServletRequest request, @Context HttpServletResponse response) throws ServiceException {
		controller.forgotUserId(request);
		return Response.status(Response.Status.OK).entity("Forgot userid for " + request.getParameter("email") + " processed.").build();
	}
}
