package com.vintek.services.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReportCriteria implements Serializable {
	private static final long serialVersionUID = -188976600020621702L;
	
	private String reportId;
	private String orgId;
	private String dateRestrictionField;
	private String dateRestrictionValue;
	private String dateRestrictionFrom;
	private String dateRestrictionTo;
	private String sortField;
	private String sortDirection;
	private String archiveStatus;

	private List<ReportFilter> filters = new ArrayList<ReportFilter>();

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getDateRestrictionField() {
		return dateRestrictionField;
	}

	public void setDateRestrictionField(String dateRestrictionField) {
		this.dateRestrictionField = dateRestrictionField;
	}

	public String getDateRestrictionValue() {
		return dateRestrictionValue;
	}

	public void setDateRestrictionValue(String dateRestrictionValue) {
		this.dateRestrictionValue = dateRestrictionValue;
	}

	public String getDateRestrictionFrom() {
		return dateRestrictionFrom;
	}

	public void setDateRestrictionFrom(String dateRestrictionFrom) {
		this.dateRestrictionFrom = dateRestrictionFrom;
	}

	public String getDateRestrictionTo() {
		return dateRestrictionTo;
	}

	public void setDateRestrictionTo(String dateRestrictionTo) {
		this.dateRestrictionTo = dateRestrictionTo;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortDirection() {
		return sortDirection;
	}

	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}

	public String getArchiveStatus() {
		return archiveStatus;
	}

	public void setArchiveStatus(String archiveStatus) {
		this.archiveStatus = archiveStatus;
	}

	public List<ReportFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<ReportFilter> filters) {
		this.filters = filters;
	}
}
