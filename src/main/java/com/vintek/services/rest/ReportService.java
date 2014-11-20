package com.vintek.services.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
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

import com.vintek.database.model.report.ReportField;
import com.vintek.services.controller.ReportController;
import com.vintek.services.model.ReportCriteria;
import com.vintek.services.model.ReportResult;
import com.vintek.services.model.ReportTree;

@Path("/report")
@Stateless
public class ReportService {

    @Inject
    private Logger log;

    @Context
    UriInfo uriInfo;    
    
    @Inject
    private ReportController controller;

	@GET
	@Produces(APPLICATION_JSON)
//	@JsonView(Views.Public.class)
    public Response getReports() {
		final List<ReportTree> reportTrees = controller.getAllReports();
		return Response.ok(reportTrees).build();
    }

	@GET
	@Path("/{id:[0-9][0-9]*}")	
	@Produces(APPLICATION_JSON)
    public Response getReportById(@PathParam("id") String id) {
		final List<ReportField> reportField = controller.getReportFields(id);
		return Response.ok(reportField).build();
    }

	@POST
	@Path("/runReport")
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	public Response runReport(ReportCriteria reportCriteria) throws ConstraintViolationException, ValidationException, ServiceException, NoResultException {
		ReportResult reportResult = controller.runReport(reportCriteria);
		return Response.ok(reportResult).build();
    }
	
	@POST
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	public Response createReport(ReportTree reportTree) throws ConstraintViolationException, ValidationException, ServiceException {
		ReportTree reportCreated = controller.createReport(reportTree);
		return Response.created(uriInfo.getAbsolutePathBuilder().path(reportCreated.getLabel()).build()).build();
    }
   
    @PUT
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response updateReport(ReportTree reportTree) throws ValidationException, ServiceException {
    	ReportTree updatedReport = controller.update(reportTree);
		return Response.created(uriInfo.getAbsolutePathBuilder().path(updatedReport.getLabel()).build()).build();
    }
	
    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response deleteReport(@PathParam("id") int id) throws ServiceException {
    	controller.delete(id);
        return Response.noContent().build();
    }
}
