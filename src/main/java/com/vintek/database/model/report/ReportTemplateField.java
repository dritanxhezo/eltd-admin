package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReportTemplateFields database table.
 * 
 */
@Entity
@Table(name="ReportTemplateFields")
public class ReportTemplateField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="CustomFieldID")
	private int customFieldId;

	@Column(name="DataField")
	private String dataField;

	@Column(name="DataType")
	private short dataType;

	@Column(name="KeyField")
	private boolean keyField;

	@Column(name="Name")
	private String name;

	@Column(name="Sequence")
	private short sequence;

	@Column(name="ToolTip")
	private String toolTip;

	@Column(name="Width")
	private int width;

	//bi-directional many-to-one association to ReportTemplate
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ReportID")
	private ReportTemplate reportTemplate;

	public ReportTemplateField() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(int customFieldId) {
		this.customFieldId = customFieldId;
	}

	public String getDataField() {
		return this.dataField;
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

	public boolean getKeyField() {
		return this.keyField;
	}

	public void setKeyField(boolean keyField) {
		this.keyField = keyField;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public ReportTemplate getReportTemplate() {
		return this.reportTemplate;
	}

	public void setReportTemplate(ReportTemplate reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

}