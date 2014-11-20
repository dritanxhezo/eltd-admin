package com.vintek.services.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleLoanToTitle implements Serializable {

	private static final long serialVersionUID = -8830270713407192486L;

	@Id
	private String ID;
	private String OrganizationID;
	private String EntryDate;
	private String EntryUser;
	private String ApplicationID;
	private String LoanAmount;
	private String OwnerType;
	private String OwnerName;
	private String CoOwnerName1;
	private String CoOwnerName2;
	private String CoOwnerName3;
	private String OwnerAddress1;
	private String OwnerAddress2;
	private String OwnerCity;
	private String OwnerState;
	private String OwnerZip;
	private String Archive;
	private String LoanStart;
	private String LoanEnd;
	private String LoanBalance;
	private String LoanType;
	private String DealerID;
	private String PaperTitleDataPending;
	private String LoanStatus;
	private String Year;
	private String Make;
	private String Model;
	private String Mileage;
	private String CollateralType;
	private String VIN;
	private String NewOrUsed;
	private String OrgID;
	private String Field1;
	private String Field2;
	private String Field3;
	private String Field4;
	private String Field5;
	private String Field6;
	private String VINError;
	private String CheckDigitOnly;
	private String CollateralVINErrorID;
	private String CollateralID;
	private String ChangeDate;
	private String ChangeUser;
	private String MatchDate;
	private String CollateralStartDate;
	private String CollateralEntryDate;
	private String TitleID;
	private String TitleNumber;
	private String TitleState;
	private String ImageID;
	private String ReleaseDate;
	private String TitleOwnerName;
	private String TitleOwnerName2;
	private String TitleOwnerAddress1;
	private String TitleOwnerAddress2;
	private String TitleOwnerCity;
	private String TitleOwnerState;
	private String TitleOwnerZip;
	private String TitleStatus;
	private String DaysOutstanding;
	private String MediaType;
	private String TitleStatusCodeChangeDate;
	private String LoanStatusCodeChangeDate;
	private String ReceiveDate;
	private String TitleArchive;
	private String PrintDate;
	private String LienPriorityCode;
	private String IssueDate;
	private String LienHolder;
	private String TitleChangeDate;
	private String DocType;
	private String ReverseVIN;
	private String StatusCodeChangeUser;
	private String TitleStatusCodeChangeUser;
	private String TitleVIN;
	private String DaysOS;
	private String PerfectedDate;
	private String ImagePath;
	private String TitleOwnerDesignation;
	private String TitleOwner2Designation;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getOrganizationID() {
		return OrganizationID;
	}
	public void setOrganizationID(String organizationID) {
		OrganizationID = organizationID;
	}
	public String getEntryDate() {
		return EntryDate;
	}
	public void setEntryDate(String entryDate) {
		EntryDate = entryDate;
	}
	public String getEntryUser() {
		return EntryUser;
	}
	public void setEntryUser(String entryUser) {
		EntryUser = entryUser;
	}
	public String getApplicationID() {
		return ApplicationID;
	}
	public void setApplicationID(String applicationID) {
		ApplicationID = applicationID;
	}
	public String getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		LoanAmount = loanAmount;
	}
	public String getOwnerType() {
		return OwnerType;
	}
	public void setOwnerType(String ownerType) {
		OwnerType = ownerType;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public String getCoOwnerName1() {
		return CoOwnerName1;
	}
	public void setCoOwnerName1(String coOwnerName1) {
		CoOwnerName1 = coOwnerName1;
	}
	public String getCoOwnerName2() {
		return CoOwnerName2;
	}
	public void setCoOwnerName2(String coOwnerName2) {
		CoOwnerName2 = coOwnerName2;
	}
	public String getCoOwnerName3() {
		return CoOwnerName3;
	}
	public void setCoOwnerName3(String coOwnerName3) {
		CoOwnerName3 = coOwnerName3;
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
	public String getArchive() {
		return Archive;
	}
	public void setArchive(String archive) {
		Archive = archive;
	}
	public String getLoanStart() {
		return LoanStart;
	}
	public void setLoanStart(String loanStart) {
		LoanStart = loanStart;
	}
	public String getLoanEnd() {
		return LoanEnd;
	}
	public void setLoanEnd(String loanEnd) {
		LoanEnd = loanEnd;
	}
	public String getLoanBalance() {
		return LoanBalance;
	}
	public void setLoanBalance(String loanBalance) {
		LoanBalance = loanBalance;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getDealerID() {
		return DealerID;
	}
	public void setDealerID(String dealerID) {
		DealerID = dealerID;
	}
	public String getPaperTitleDataPending() {
		return PaperTitleDataPending;
	}
	public void setPaperTitleDataPending(String paperTitleDataPending) {
		PaperTitleDataPending = paperTitleDataPending;
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
	public String getMileage() {
		return Mileage;
	}
	public void setMileage(String mileage) {
		Mileage = mileage;
	}
	public String getCollateralType() {
		return CollateralType;
	}
	public void setCollateralType(String collateralType) {
		CollateralType = collateralType;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getNewOrUsed() {
		return NewOrUsed;
	}
	public void setNewOrUsed(String newOrUsed) {
		NewOrUsed = newOrUsed;
	}
	public String getOrgID() {
		return OrgID;
	}
	public void setOrgID(String orgID) {
		OrgID = orgID;
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
	public String getVINError() {
		return VINError;
	}
	public void setVINError(String vINError) {
		VINError = vINError;
	}
	public String getCheckDigitOnly() {
		return CheckDigitOnly;
	}
	public void setCheckDigitOnly(String checkDigitOnly) {
		CheckDigitOnly = checkDigitOnly;
	}
	public String getCollateralVINErrorID() {
		return CollateralVINErrorID;
	}
	public void setCollateralVINErrorID(String collateralVINErrorID) {
		CollateralVINErrorID = collateralVINErrorID;
	}
	public String getCollateralID() {
		return CollateralID;
	}
	public void setCollateralID(String collateralID) {
		CollateralID = collateralID;
	}
	public String getChangeDate() {
		return ChangeDate;
	}
	public void setChangeDate(String changeDate) {
		ChangeDate = changeDate;
	}
	public String getChangeUser() {
		return ChangeUser;
	}
	public void setChangeUser(String changeUser) {
		ChangeUser = changeUser;
	}
	public String getMatchDate() {
		return MatchDate;
	}
	public void setMatchDate(String matchDate) {
		MatchDate = matchDate;
	}
	public String getCollateralStartDate() {
		return CollateralStartDate;
	}
	public void setCollateralStartDate(String collateralStartDate) {
		CollateralStartDate = collateralStartDate;
	}
	public String getCollateralEntryDate() {
		return CollateralEntryDate;
	}
	public void setCollateralEntryDate(String collateralEntryDate) {
		CollateralEntryDate = collateralEntryDate;
	}
	public String getTitleID() {
		return TitleID;
	}
	public void setTitleID(String titleID) {
		TitleID = titleID;
	}
	public String getTitleNumber() {
		return TitleNumber;
	}
	public void setTitleNumber(String titleNumber) {
		TitleNumber = titleNumber;
	}
	public String getTitleState() {
		return TitleState;
	}
	public void setTitleState(String titleState) {
		TitleState = titleState;
	}
	public String getImageID() {
		return ImageID;
	}
	public void setImageID(String imageID) {
		ImageID = imageID;
	}
	public String getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	public String getTitleOwnerName() {
		return TitleOwnerName;
	}
	public void setTitleOwnerName(String titleOwnerName) {
		TitleOwnerName = titleOwnerName;
	}
	public String getTitleOwnerName2() {
		return TitleOwnerName2;
	}
	public void setTitleOwnerName2(String titleOwnerName2) {
		TitleOwnerName2 = titleOwnerName2;
	}
	public String getTitleOwnerAddress1() {
		return TitleOwnerAddress1;
	}
	public void setTitleOwnerAddress1(String titleOwnerAddress1) {
		TitleOwnerAddress1 = titleOwnerAddress1;
	}
	public String getTitleOwnerAddress2() {
		return TitleOwnerAddress2;
	}
	public void setTitleOwnerAddress2(String titleOwnerAddress2) {
		TitleOwnerAddress2 = titleOwnerAddress2;
	}
	public String getTitleOwnerCity() {
		return TitleOwnerCity;
	}
	public void setTitleOwnerCity(String titleOwnerCity) {
		TitleOwnerCity = titleOwnerCity;
	}
	public String getTitleOwnerState() {
		return TitleOwnerState;
	}
	public void setTitleOwnerState(String titleOwnerState) {
		TitleOwnerState = titleOwnerState;
	}
	public String getTitleOwnerZip() {
		return TitleOwnerZip;
	}
	public void setTitleOwnerZip(String titleOwnerZip) {
		TitleOwnerZip = titleOwnerZip;
	}
	public String getTitleStatus() {
		return TitleStatus;
	}
	public void setTitleStatus(String titleStatus) {
		TitleStatus = titleStatus;
	}
	public String getDaysOutstanding() {
		return DaysOutstanding;
	}
	public void setDaysOutstanding(String daysOutstanding) {
		DaysOutstanding = daysOutstanding;
	}
	public String getMediaType() {
		return MediaType;
	}
	public void setMediaType(String mediaType) {
		MediaType = mediaType;
	}
	public String getTitleStatusCodeChangeDate() {
		return TitleStatusCodeChangeDate;
	}
	public void setTitleStatusCodeChangeDate(String titleStatusCodeChangeDate) {
		TitleStatusCodeChangeDate = titleStatusCodeChangeDate;
	}
	public String getLoanStatusCodeChangeDate() {
		return LoanStatusCodeChangeDate;
	}
	public void setLoanStatusCodeChangeDate(String loanStatusCodeChangeDate) {
		LoanStatusCodeChangeDate = loanStatusCodeChangeDate;
	}
	public String getReceiveDate() {
		return ReceiveDate;
	}
	public void setReceiveDate(String receiveDate) {
		ReceiveDate = receiveDate;
	}
	public String getTitleArchive() {
		return TitleArchive;
	}
	public void setTitleArchive(String titleArchive) {
		TitleArchive = titleArchive;
	}
	public String getPrintDate() {
		return PrintDate;
	}
	public void setPrintDate(String printDate) {
		PrintDate = printDate;
	}
	public String getLienPriorityCode() {
		return LienPriorityCode;
	}
	public void setLienPriorityCode(String lienPriorityCode) {
		LienPriorityCode = lienPriorityCode;
	}
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}
	public String getLienHolder() {
		return LienHolder;
	}
	public void setLienHolder(String lienHolder) {
		LienHolder = lienHolder;
	}
	public String getTitleChangeDate() {
		return TitleChangeDate;
	}
	public void setTitleChangeDate(String titleChangeDate) {
		TitleChangeDate = titleChangeDate;
	}
	public String getDocType() {
		return DocType;
	}
	public void setDocType(String docType) {
		DocType = docType;
	}
	public String getReverseVIN() {
		return ReverseVIN;
	}
	public void setReverseVIN(String reverseVIN) {
		ReverseVIN = reverseVIN;
	}
	public String getStatusCodeChangeUser() {
		return StatusCodeChangeUser;
	}
	public void setStatusCodeChangeUser(String statusCodeChangeUser) {
		StatusCodeChangeUser = statusCodeChangeUser;
	}
	public String getTitleStatusCodeChangeUser() {
		return TitleStatusCodeChangeUser;
	}
	public void setTitleStatusCodeChangeUser(String titleStatusCodeChangeUser) {
		TitleStatusCodeChangeUser = titleStatusCodeChangeUser;
	}
	public String getTitleVIN() {
		return TitleVIN;
	}
	public void setTitleVIN(String titleVIN) {
		TitleVIN = titleVIN;
	}
	public String getDaysOS() {
		return DaysOS;
	}
	public void setDaysOS(String daysOS) {
		DaysOS = daysOS;
	}
	public String getPerfectedDate() {
		return PerfectedDate;
	}
	public void setPerfectedDate(String perfectedDate) {
		PerfectedDate = perfectedDate;
	}
	public String getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}
	public String getTitleOwnerDesignation() {
		return TitleOwnerDesignation;
	}
	public void setTitleOwnerDesignation(String titleOwnerDesignation) {
		TitleOwnerDesignation = titleOwnerDesignation;
	}
	public String getTitleOwner2Designation() {
		return TitleOwner2Designation;
	}
	public void setTitleOwner2Designation(String titleOwner2Designation) {
		TitleOwner2Designation = titleOwner2Designation;
	}	
}
