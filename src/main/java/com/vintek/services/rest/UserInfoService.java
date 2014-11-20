package com.vintek.services.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vintek.services.controller.UserInfoController;
import com.vintek.services.model.UserAnnouncement;

@Path("/userinfo")
public class UserInfoService {

	@Inject
	private Logger log;

	@Inject
	UserInfoController controller;

	@GET
	@Path("/announcements")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserAnnouncement> getAnnouncements() throws ServiceException {
		return controller.getAnnouncements();
//		try {
//			return Response.ok().entity(controller.getAnnouncements()).build(); // status(Response.Status.OK).entity("Logged out").build();
////		} catch (ServiceException se) {
////			return Response.status(se.getErrorCode()).entity(se.getMessage()).build();
//		} catch (Exception e) {
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("An Exception occurred while trying to get the announcement.").build();
//		}
	}

	@GET
	@Path("/announcements/{id:[0-9][0-9]*}")	
	@Produces(MediaType.APPLICATION_JSON)
    public UserAnnouncement getAnnouncement(@PathParam("id") int id) throws ServiceException {
		return controller.getAnnouncement(id);
//		try {
//			return  Response.ok(controller.getAnnouncement(id)).build();
//		} catch (ServiceException se) {
//			return Response.status(se.getResponseStatus()).entity(se.getMessage()).build();
//		} catch (Exception e) {
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("An Exception occurred while trying to get the announcement by id.").build();
//		}
    }
}
