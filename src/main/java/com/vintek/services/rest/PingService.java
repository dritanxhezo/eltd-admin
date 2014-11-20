package com.vintek.services.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingService {

	@GET
	public Response getPing(@Context HttpServletRequest request, @Context HttpServletResponse response) { 
		return Response.status(Response.Status.OK).entity("ping from " + request.getRemoteAddr()).build();
	}
}
