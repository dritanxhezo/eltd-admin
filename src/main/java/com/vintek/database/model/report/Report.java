package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Name")
	private String name;

	@Column(name="Type")
	private short type;

	@Column(name="OrganizationID")
	private short organizationId;		

	@Column(name="IncludeArchive")
	private boolean includeArchive;

	@Column(name="ReportTable")
	private String reportTable;

	@Column(name="UserID")
	private int userId;

	public Report() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public short getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(short organizationId) {
		this.organizationId = organizationId;
	}

	public boolean getIncludeArchive() {
		return this.includeArchive;
	}

	public void setIncludeArchive(boolean includeArchive) {
		this.includeArchive = includeArchive;
	}

	public String getReportTable() {
		return this.reportTable;
	}

	public void setReportTable(String reportTable) {
		this.reportTable = reportTable;
	}
	
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}