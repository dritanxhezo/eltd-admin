package com.vintek.services.model;

import java.io.Serializable;

public class UserAnnouncement implements Serializable {
	private static final long serialVersionUID = 8773233561363773853L;
	private String id;
	private String message;
	private String type;
	private boolean isRead;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isRead() {
		return isRead;
	}
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

}
