package com.vintek.services.model;

import java.io.Serializable;

import com.vintek.database.model.report.ReportField;

public class ReportFilter implements Serializable{
	private static final long serialVersionUID = -8622376931623782512L;
	
	private ReportField reportField;
	private String filterOperator;
	private String filterValue;
	
	public ReportField getReportField() {
		return reportField;
	}
	public void setReportField(ReportField reportField) {
		this.reportField = reportField;
	}
	public String getFilterOperator() {
		return filterOperator;
	}
	public void setFilterOperator(String filterOperator) {
		this.filterOperator = filterOperator;
	}
	public String getFilterValue() {
		return filterValue;
	}
	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

}
