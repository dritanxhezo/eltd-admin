package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReportTemplateList database table.
 * 
 */
@Entity @IdClass(ReportFieldId.class)
//@Table(name="ReportTemplateList")
public class ReportField implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="FieldID")
	private int fieldId;

	@Id
	@Column(name="ReportID")
	private int reportId;

	@Column(name="DataField")
	private String dataField;

	@Column(name="ToolTip")
	private String toolTip;

	@Column(name="Sequence")
	private short sequence;

	@Column(name="DataType")
	private short dataType;

	@Column(name="FieldName")
	private String fieldName;

	@Column(name="KeyField")
	private boolean keyField;
	
//	@Column(name="CustomFieldID")
//	private int customFieldId;
//
//	@Column(name="CustomFields")
//	private boolean customFields;

	public ReportField() {
	}

//	public int getCustomFieldId() {
//		return this.customFieldId;
//	}
//
//	public void setCustomFieldId(int customFieldId) {
//		this.customFieldId = customFieldId;
//	}
//
//	public boolean getCustomFields() {
//		return this.customFields;
//	}
//
//	public void setCustomFields(boolean customFields) {
//		this.customFields = customFields;
//	}

	public String getDataField() {
		// remove this; change field nanmes in the db
		return dataField.substring(0,1).toLowerCase()+dataField.substring(1);
		//return this.dataField;
	}

	public void setDataField(String dataField) {
		this.dataField = dataField;
	}

	public short getDataType() {
		return this.dataType;
	}

	public void setDataType(short dataType) {
		this.dataType = dataType;
	}

	public int getFieldId() {
		return this.fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public boolean getKeyField() {
		return this.keyField;
	}

	public void setKeyField(boolean keyField) {
		this.keyField = keyField;
	}

	public int getReportId() {
		return this.reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public short getSequence() {
		return this.sequence;
	}

	public void setSequence(short sequence) {
		this.sequence = sequence;
	}

	public String getToolTip() {
		return this.toolTip;
	}

	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}
}