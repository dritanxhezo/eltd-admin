package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReportTemplateFilters database table.
 * 
 */
@Entity
@Table(name="ReportTemplateFilters")
public class ReportTemplateFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="DataField")
	private String dataField;

	@Column(name="DataField2")
	private String dataField2;

	@Column(name="Operator")
	private String operator;

	@Column(name="Operator2")
	private String operator2;

	@Column(name="Value")
	private String value;

	//bi-directional many-to-one association to ReportTemplate
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ReportID")
	private ReportTemplate reportTemplate;

	public ReportTemplateFilter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataField() {
		return this.dataField;
	}

	public void setDataField(String dataField) {
		this.dataField = dataField;
	}

	public String getDataField2() {
		return this.dataField2;
	}

	public void setDataField2(String dataField2) {
		this.dataField2 = dataField2;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator2() {
		return this.operator2;
	}

	public void setOperator2(String operator2) {
		this.operator2 = operator2;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ReportTemplate getReportTemplate() {
		return this.reportTemplate;
	}

	public void setReportTemplate(ReportTemplate reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

}