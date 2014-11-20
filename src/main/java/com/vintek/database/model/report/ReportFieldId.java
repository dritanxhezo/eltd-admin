package com.vintek.database.model.report;

import java.io.Serializable;

public class ReportFieldId implements Serializable{
	private static final long serialVersionUID = 6085875703535573344L;
	
	int fieldId;
	int reportId;	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fieldId;
		result = prime * result + reportId;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReportFieldId other = (ReportFieldId) obj;
		if (fieldId != other.fieldId)
			return false;
		if (reportId != other.reportId)
			return false;
		return true;
	}
}
