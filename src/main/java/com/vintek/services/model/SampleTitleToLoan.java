package com.vintek.services.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleTitleToLoan implements Serializable {
	private static final long serialVersionUID = 5560774307692829905L;
	
	private String ApplicationID;
	private String OwnerName;
	private String VIN;
	private Timestamp LoanStart;
	private Float LoanAmount;
	private String OrgID;
	private String OwnerAddress1;
	private String OwnerAddress2;
	private String OwnerCity;
	private String OwnerState;
	private String OwnerZip;
	private String Field1;
	private String Field2;
	private String Field3;
	private String Field4;
	private String Field5;
	private String Field6;	
	private String DaysOutstanding;
	private String LoanStatus;
	private String Year;
	private String Make;
	private String Model;
	private String DealerID;
	private Float LoanBalance;
	private Timestamp EntryDate;
	private boolean Archive;
	private String OrganizationID;
	
	@Id
	private int ID;
	private String Phone;
	public String getApplicationID() {
		return ApplicationID;
	}
	public void setApplicationID(String applicationID) {
		ApplicationID = applicationID;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public Timestamp getLoanStart() {
		return LoanStart;
	}
	public void setLoanStart(Timestamp loanStart) {
		LoanStart = loanStart;
	}
	public Float getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(Float loanAmount) {
		LoanAmount = loanAmount;
	}
	public String getOrgID() {
		return OrgID;
	}
	public void setOrgID(String orgID) {
		OrgID = orgID;
	}
	public String getOwnerAddress1() {
		return OwnerAddress1;
	}
	public void setOwnerAddress1(String ownerAddress1) {
		OwnerAddress1 = ownerAddress1;
	}
	public String getOwnerAddress2() {
		return OwnerAddress2;
	}
	public void setOwnerAddress2(String ownerAddress2) {
		OwnerAddress2 = ownerAddress2;
	}
	public String getOwnerCity() {
		return OwnerCity;
	}
	public void setOwnerCity(String ownerCity) {
		OwnerCity = ownerCity;
	}
	public String getOwnerState() {
		return OwnerState;
	}
	public void setOwnerState(String ownerState) {
		OwnerState = ownerState;
	}
	public String getOwnerZip() {
		return OwnerZip;
	}
	public void setOwnerZip(String ownerZip) {
		OwnerZip = ownerZip;
	}
	public String getField1() {
		return Field1;
	}
	public void setField1(String field1) {
		Field1 = field1;
	}
	public String getField2() {
		return Field2;
	}
	public void setField2(String field2) {
		Field2 = field2;
	}
	public String getField3() {
		return Field3;
	}
	public void setField3(String field3) {
		Field3 = field3;
	}
	public String getField4() {
		return Field4;
	}
	public void setField4(String field4) {
		Field4 = field4;
	}
	public String getField5() {
		return Field5;
	}
	public void setField5(String field5) {
		Field5 = field5;
	}
	public String getField6() {
		return Field6;
	}
	public void setField6(String field6) {
		Field6 = field6;
	}
	public String getDaysOutstanding() {
		return DaysOutstanding;
	}
	public void setDaysOutstanding(String daysOutstanding) {
		DaysOutstanding = daysOutstanding;
	}
	public String getLoanStatus() {
		return LoanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		LoanStatus = loanStatus;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getDealerID() {
		return DealerID;
	}
	public void setDealerID(String dealerID) {
		DealerID = dealerID;
	}
	public Float getLoanBalance() {
		return LoanBalance;
	}
	public void setLoanBalance(Float loanBalance) {
		LoanBalance = loanBalance;
	}
	public Timestamp getEntryDate() {
		return EntryDate;
	}
	public void setEntryDate(Timestamp entryDate) {
		EntryDate = entryDate;
	}
	public boolean isArchive() {
		return Archive;
	}
	public void setArchive(boolean archive) {
		Archive = archive;
	}
	public String getOrganizationID() {
		return OrganizationID;
	}
	public void setOrganizationID(String organizationID) {
		OrganizationID = organizationID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
}
