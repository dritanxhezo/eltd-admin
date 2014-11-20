package com.vintek.database.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class OrganizationUser implements Serializable {
	private static final long serialVersionUID = -1798190217627168906L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID")
//	private int id;
//
//	@Column(name="IsDefault", columnDefinition="bit")
//	private boolean isDefault;

//	//bi-directional many-to-one association to User
//	@ManyToOne
//	@JoinColumn(name="UserID")
//	private User user;
//
//	//bi-directional many-to-one association to Organization
//	@ManyToOne
//	@JoinColumn(name="OrganizationID")
//	private Organization organization;

	public OrganizationUser() {
	}

//	public int getId() {
//		return this.id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public boolean getIsDefault() {
//		return this.isDefault;
//	}
//
//	public void setIsDefault(boolean isDefault) {
//		this.isDefault = isDefault;
//	}

//	public User getUser() {
//		return this.user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Organization getOrganization() {
//		return this.organization;
//	}
//
//	public void setOrganization(Organization organization) {
//		this.organization = organization;
//	}

}