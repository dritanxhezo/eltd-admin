package com.vintek.database.model.user;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserRecentDocument implements Serializable {
	private static final long serialVersionUID = 5416857938777002954L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="AppID")
	private String appID;

	@Column(name="DocID")
	private int docID;

	@Column(name="DocType")
	private String docType;

	@Column(name="State")
	private String state;

	@Column(name="ViewDate")
	private Timestamp viewDate;

	//bi-directional many-to-one association to User
//	@ManyToOne
//	@JoinColumn(name="UserID")
//	private User user;

	//bi-directional many-to-one association to Organization
//	@ManyToOne
//	@JoinColumn(name="OrganizationID")
//	private Organization organization;
	
	@Column(name="OrganizationID")
	private int organizationId;

	public UserRecentDocument() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppID() {
		return this.appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

	public int getDocID() {
		return this.docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getViewDate() {
		return this.viewDate;
	}

	public void setViewDate(Timestamp viewDate) {
		this.viewDate = viewDate;
	}
//
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

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
}