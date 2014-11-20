package com.vintek.services.security;

import java.util.ArrayList;
import java.util.List;

import com.vintek.database.model.user.Privilege;

public class SecurityToken {

	private String userId;
	private int currentOrg;
	private List<Privilege> privileges;

	public SecurityToken() {
	}

	public SecurityToken(String userId, int currentOrg, List<Privilege> privileges) {
		super();
		this.userId = userId;
		this.currentOrg = currentOrg;
		this.privileges = privileges;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCurrentOrg() {
		return currentOrg;
	}

	public void setCurrentOrg(int currentOrg) {
		this.currentOrg = currentOrg;
	}
	
	public List<Privilege> getPriviledges() {
		if (this.privileges == null) {
			this.privileges = new ArrayList<Privilege>();
		}
		return this.privileges;		
	}

	public void setPriviledges(List<Privilege> priviledges) {
		this.privileges = priviledges;
	}
}
