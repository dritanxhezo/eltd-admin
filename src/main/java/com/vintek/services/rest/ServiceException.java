package com.vintek.services.rest;

import javax.ws.rs.core.Response;

public class ServiceException extends Exception {
	private static final long serialVersionUID = 7499091772141039891L;
	private Response.Status responseStatus;

	public ServiceException() {
	}

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(Response.Status status, String msg) {
		super(msg);
		setResponseStatus(status);
	}
	
	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public ServiceException(Response.Status status, String msg, Throwable cause) {
		super(msg, cause);
		setResponseStatus(status);
	}	

	public ServiceException(String msg, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(msg, cause, enableSuppression, writableStackTrace);
	}

	public Response.Status getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(Response.Status responseStatus) {
		this.responseStatus = responseStatus;
	}
}
