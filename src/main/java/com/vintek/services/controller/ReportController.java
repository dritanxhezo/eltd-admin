package com.vintek.services.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;

import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaClass;
import org.apache.commons.beanutils.DynaProperty;

import com.vintek.database.model.report.ReportField;
import com.vintek.database.model.report.Report;
import com.vintek.database.service.MojaveDB;
import com.vintek.services.model.ReportCriteria;
import com.vintek.services.model.ReportResult;
import com.vintek.services.model.ReportTree;
import com.vintek.services.model.SampleLoanToTitle;
import com.vintek.services.model.SampleTitleToLoan;

public class ReportController {
	@Inject
	private Logger log;
	
	@Inject
	private MojaveDB mojaveDB;	

    // Report Type Constants
    public final static byte REPORT_LOAN = 0;
    public final static byte REPORT_TITLE = 1;
    public final static byte REPORT_TRANSACTION = 2;
    public final static byte REPORT_SEARCH_LOAN = 3;
    public final static byte REPORT_SEARCH_TITLE = 4;
    public final static byte REPORT_ADMIN = 5;
    public final static byte REPORT_ORG_ADMIN = 6;
    public final static byte REPORT_LIEN_INQUIRY = 7;
   
    // Archive Search Constants
    public final static byte ALL_ACCOUNTS = 0;
    public final static byte ACTIVE_ACCOUNTS = 1;
    public final static byte ARCHIVE_ACCOUNTS = 2;
    
	public final static byte TYPE_STRING = 0;
	public final static byte TYPE_NUMBER = 1;
	public final static byte TYPE_CURRENY = 2;
	public final static byte TYPE_DATE = 3;
	public final static byte TYPE_DATETIME = 4;
	public final static byte TYPE_BOOLEAN = 5;
	public final static byte TYPE_DIRECTION = 6;
    
	public ReportController() {
	}
	
	public List<ReportTree> getAllReports() {
		List<ReportTree> reportTree = new ArrayList<ReportTree>();
		addNode(reportTree, 99999, "Organization Reports", "Reports.NonAdmin", "5143", "0");
		addNode(reportTree, 99998, "Stock Reports", "Reports.NonAdmin", "0", "0");
		addNode(reportTree, 99997, "Custom Reports", "Reports.NonAdmin", "0", "1295");
		addNode(reportTree, 99996, "Admin Reports", "Reports.Admin", "0", "0");
		return reportTree;
	}

	private void addNode(List<ReportTree> reportTree, int nodeId, String nodeName, String queryName, String orgId, String userId) {
		ReportTree rep = new ReportTree(nodeId, nodeName);
		List<Report> reports = mojaveDB.findWithNamedQuery(queryName, orgId, userId);
		for (Report report: reports) {
			rep.getChildren().add(new ReportTree(report.getId(), (nodeId==99999?report.getOrganizationId() + " - ":"") + report.getName()));
		}
		if (reports.size()>0) {
			reportTree.add(rep);
		}
	}

	public List<ReportField> getReportFields(String id) {
		List<ReportField> reportFields = mojaveDB.findWithNamedQuery("Reports.Fields", id);
		return reportFields;
	}

	public ReportResult runReport(ReportCriteria reportCriteria) throws NoResultException {
		Report report = (Report) mojaveDB.findWithNamedQuerySingleResult("Reports.ById", reportCriteria.getReportId());
		
		ReportResult result = new ReportResult();
		List<ReportField> fields = getReportFields(reportCriteria.getReportId());
		//lowerCaseFieldName(fields);
		result.setFields(fields);
		
		// get the data from the view associated with the report
		// create a dynabean to hold the data
		List data = mojaveDB.findByNativeQuery("select * from [QueryLoanToTitle]", SampleLoanToTitle.class);  //report.getReportTable();
		result.setRows(data);
//		DynaClass dynClass = createBeanFromFields(result.getFields());
//		DynaBean dynBean = (DynaBean) mojaveDB.findByNativeQuery("select * from [QueryData]", dynClass.getClass());
		
		// fill the dynabean with the data
		//result.setRows(rows)
		return result;
	}
	
	private void lowerCaseFieldName(List<ReportField> fields) {
		for (ReportField field: fields) {
			// uncapitalize
			field.setDataField(field.getDataField().substring(0,1).toLowerCase()+field.getDataField().substring(1));
		}		
	}

	private DynaClass createBeanFromFields(List<ReportField> fields) {
		List<DynaProperty> propList = new ArrayList<DynaProperty>();
		for (ReportField field: fields) {
			propList.add(new DynaProperty(field.getDataField(), getType(field.getDataType())));			
		}
	    DynaClass dynaClass = new BasicDynaClass("NameOfDataBean", null, propList.toArray(new DynaProperty[propList.size()]));
	    return dynaClass;
//		try {
//			return dynaClass.newInstance();
//		} catch (IllegalAccessException | InstantiationException e) {
//			e.printStackTrace();
//			return null;
//		}
	}

	private Class getType(short dataType) {
		switch (dataType) {
			case TYPE_STRING: return String.class;
			case TYPE_NUMBER: return Integer.class;
			case TYPE_CURRENY: return Float.class;		
			case TYPE_DATE: return Date.class;
			case TYPE_DATETIME: return Timestamp.class;		
			case TYPE_BOOLEAN: return Boolean.class;
			case TYPE_DIRECTION: return Boolean.class;
			default: return null;
		}
	}

	public ReportTree createReport(ReportTree reportTree) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReportTree update(ReportTree reportTree) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
