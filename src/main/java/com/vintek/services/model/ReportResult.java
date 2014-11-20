package com.vintek.services.model;

import java.io.Serializable;
import java.util.List;

import com.vintek.database.model.report.ReportField;

public class ReportResult implements Serializable {
	private static final long serialVersionUID = 2760560592292548827L;

	private List<ReportField> fields;
	private List rows;
	
	public List<ReportField> getFields() {
		return fields;
	}
	public void setFields(List<ReportField> fields) {
		this.fields = fields;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
}
