package com.vintek.database.model.report;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ReportTemplate database table.
 * 
 */
@Entity
public class ReportTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="CustomFields")
	private boolean customFields;

	@Column(name="Description")
	private String description;

	@Column(name="GROUPID")
	private int groupId;

	@Column(name="IncludeArchive")
	private boolean includeArchive;

	@Column(name="Name")
	private String name;

	@Column(name="OrganizationID")
	private int organizationId;

	@Column(name="PercentTolerance")
	private BigDecimal percentTolerance;

	@Column(name="ReportTable")
	private String reportTable;

	@Column(name="TCRCountQuery")
	private String tcrCountQuery;

	@Column(name="TitleControlReport")
	private boolean titleControlReport;

	@Column(name="TitleControlReportParent")
	private int titleControlReportParent;

	@Column(name="Type")
	private short type;

	@Column(name="UserID")
	private int userId;

	//bi-directional many-to-one association to ReportTemplateField
	@OneToMany(mappedBy="reportTemplate")
	private List<ReportTemplateField> reportTemplateFields;

	//bi-directional many-to-one association to ReportTemplateFilter
	@OneToMany(mappedBy="reportTemplate")
	private List<ReportTemplateFilter> reportTemplateFilters;

	public ReportTemplate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(boolean customFields) {
		this.customFields = customFields;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public boolean getIncludeArchive() {
		return this.includeArchive;
	}

	public void setIncludeArchive(boolean includeArchive) {
		this.includeArchive = includeArchive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getPercentTolerance() {
		return this.percentTolerance;
	}

	public void setPercentTolerance(BigDecimal percentTolerance) {
		this.percentTolerance = percentTolerance;
	}

	public String getReportTable() {
		return this.reportTable;
	}

	public void setReportTable(String reportTable) {
		this.reportTable = reportTable;
	}

	public String getTcrCountQuery() {
		return this.tcrCountQuery;
	}

	public void setTcrCountQuery(String tcrCountQuery) {
		this.tcrCountQuery = tcrCountQuery;
	}

	public boolean getTitleControlReport() {
		return this.titleControlReport;
	}

	public void setTitleControlReport(boolean titleControlReport) {
		this.titleControlReport = titleControlReport;
	}

	public int getTitleControlReportParent() {
		return this.titleControlReportParent;
	}

	public void setTitleControlReportParent(int titleControlReportParent) {
		this.titleControlReportParent = titleControlReportParent;
	}

	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<ReportTemplateField> getReportTemplateFields() {
		return this.reportTemplateFields;
	}

	public void setReportTemplateFields(List<ReportTemplateField> reportTemplateFields) {
		this.reportTemplateFields = reportTemplateFields;
	}

	public ReportTemplateField addReportTemplateField(ReportTemplateField reportTemplateField) {
		getReportTemplateFields().add(reportTemplateField);
		reportTemplateField.setReportTemplate(this);

		return reportTemplateField;
	}

	public ReportTemplateField removeReportTemplateField(ReportTemplateField reportTemplateField) {
		getReportTemplateFields().remove(reportTemplateField);
		reportTemplateField.setReportTemplate(null);

		return reportTemplateField;
	}

	public List<ReportTemplateFilter> getReportTemplateFilters() {
		return this.reportTemplateFilters;
	}

	public void setReportTemplateFilters(List<ReportTemplateFilter> reportTemplateFilters) {
		this.reportTemplateFilters = reportTemplateFilters;
	}

	public ReportTemplateFilter addReportTemplateFilter(ReportTemplateFilter reportTemplateFilter) {
		getReportTemplateFilters().add(reportTemplateFilter);
		reportTemplateFilter.setReportTemplate(this);

		return reportTemplateFilter;
	}

	public ReportTemplateFilter removeReportTemplateFilter(ReportTemplateFilter reportTemplateFilter) {
		getReportTemplateFilters().remove(reportTemplateFilter);
		reportTemplateFilter.setReportTemplate(null);

		return reportTemplateFilter;
	}

}