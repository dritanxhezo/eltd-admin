package com.vintek.database.model.user;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Organization implements Serializable {
	private static final long serialVersionUID = 7019166048778678260L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="Address1")
	private String address1;

	@Column(name="Address2")
	private String address2;

	@Column(name="ArchiveOnPrint", columnDefinition="bit")
	private boolean archiveOnPrint;

	@Column(name="ArchiveOnRelease", columnDefinition="bit")
	private boolean archiveOnRelease;

	@Column(name="ArchiveReleaseError", columnDefinition="bit")
	private boolean archiveReleaseError;

	@Column(name="ArchiveUnrecognizedOnPrint", columnDefinition="bit")
	private boolean archiveUnrecognizedOnPrint;

	@Column(name="AutoNLF", columnDefinition="bit")
	private boolean autoNLF;

	@Column(name="AutoPopLoan", columnDefinition="bit")
	private boolean autoPopLoan;

	@Column(columnDefinition="bit")
	private boolean autoPrint;

	@Column(name="AutoStateToState", columnDefinition="bit")
	private boolean autoStateToState;

	@Column(name="BillingID")
	private String billingID;

	@Column(name="Calculator", columnDefinition="bit")
	private boolean calculator;

	@Column(name="City")
	private String city;

	@Column(name="ClearDTFLPStatusOnMatch", columnDefinition="bit")
	private boolean clearDTFLPStatusOnMatch;

	@Column(name="ClearREFIOnMatch", columnDefinition="bit")
	private boolean clearREFIOnMatch;

	@Column(name="ClearStatusOnMatch", columnDefinition="bit")
	private boolean clearStatusOnMatch;

	@Column(name="ConfirmRemoveMatch", columnDefinition="bit")
	private boolean confirmRemoveMatch;

	@Column(name="COSIGNERFIRSTLASTONLY", columnDefinition="bit")
	private boolean cosignerfirstlastonly;

	@Column(columnDefinition="bit")
	private boolean dealerNameDropDown;

	@Column(name="DefaultWorkflowStatus")
	private int defaultWorkflowStatus;

	@Column(name="DelayedReleaseTransaction", columnDefinition="bit")
	private boolean delayedReleaseTransaction;

	@Column(name="Deleted", columnDefinition="bit")
	private boolean deleted;

	@Column(name="Description")
	private String description;

	@Column(name="DisableAddCollateral", columnDefinition="bit")
	private boolean disableAddCollateral;

	@Column(name="Disabled", columnDefinition="bit")
	private boolean disabled;

	@Column(name="Disbursement", columnDefinition="bit")
	private boolean disbursement;

	@Column(columnDefinition="bit")
	private boolean DMVDocument;

	@Column(name="DoNotPerfectVAHeld", columnDefinition="bit")
	private boolean doNotPerfectVAHeld;

	@Column(name="EmailConfirmationOnPrint", columnDefinition="bit")
	private boolean emailConfirmationOnPrint;

	@Column(name="FIRSTLASTONLY", columnDefinition="bit")
	private boolean firstlastonly;

	@Column(name="GroupID")
	private int groupID;

	@Column(name="HideWorkflowPhone", columnDefinition="bit")
	private boolean hideWorkflowPhone;

	@Column(name="LIENHOLDER", columnDefinition="bit")
	private boolean lienholder;

	@Column(name="LIENHOLDERASOWNER", columnDefinition="bit")
	private boolean lienholderasowner;

	@Column(name="LienSearchConsumed", columnDefinition="bit")
	private Integer lienSearchConsumed;

	@Column(name="MaintenanceLetterList", columnDefinition="bit")
	private boolean maintenanceLetterList;

	@Column(name="MaintenanceStatus", columnDefinition="bit")
	private boolean maintenanceStatus;

	@Column(name="MAKE", columnDefinition="bit")
	private boolean make;

	@Column(name="MILEAGE", columnDefinition="bit")
	private boolean mileage;

	@Column(name="MileageTolerance")
	private int mileageTolerance;

	@Column(name="MODEL", columnDefinition="bit")
	private boolean model;

	@Column(name="Name")
	private String name;

	@Column(name="NewLoanNote", columnDefinition="bit")
	private boolean newLoanNote;

	@Column(name="NoMatchFlags", columnDefinition="bit")
	private boolean noMatchFlags;

	@Column(name="OrgID")
	private String orgID;

	@Column(name="OrgLimit")
	private Integer orgLimit;

	@Column(name="OWNER2", columnDefinition="bit")
	private boolean owner2;

	@Column(name="OWNER3", columnDefinition="bit")
	private boolean owner3;

	@Column(name="OWNER4", columnDefinition="bit")
	private boolean owner4;

	@Column(name="OWNERADDRESS1", columnDefinition="bit")
	private boolean owneraddress1;

	@Column(name="OWNERADDRESS2", columnDefinition="bit")
	private boolean owneraddress2;

	@Column(name="OWNERCITY", columnDefinition="bit")
	private boolean ownercity;

	@Column(name="OWNERSTATE", columnDefinition="bit")
	private boolean ownerstate;

	@Column(name="OWNERZIP", columnDefinition="bit")
	private boolean ownerzip;

	@Column(name="PaperReleaseToLoan", columnDefinition="bit")
	private boolean paperReleaseToLoan;

	@Column(name="Parent")
	private int parent;

	@Column(name="PasswordExpirationDays", columnDefinition="bit")
	private int passwordExpirationDays;

	@Column(name="PasswordNeverExpire", columnDefinition="bit")
	private boolean passwordNeverExpire;

	@Column(name="Phone")
	private String phone;

	@Column(name="PRIMARY_OWNER", columnDefinition="bit")
	private boolean primaryOwner;

	@Column(name="PRIMARYOWNERTOOWNER2", columnDefinition="bit")
	private boolean primaryownertoowner2;

	@Column(name="ReleaseUnmatchedLoan", columnDefinition="bit")
	private boolean releaseUnmatchedLoan;

	@Column(name="RetainMediaType", columnDefinition="bit")
	private boolean retainMediaType;

	@Column(name="SetStatusForVAHeld", columnDefinition="bit")
	private boolean setStatusForVAHeld;

	@Column(name="SetStatusTo160", columnDefinition="bit")
	private boolean setStatusTo160;

	@Column(name="State")
	private String state;

	@Column(name="StatusID")
	private int statusID;

	@Column(name="SyncLoantoTitle", columnDefinition="bit")
	private boolean syncLoantoTitle;

	@Column(name="SyncWorkflow", columnDefinition="bit")
	private boolean syncWorkflow;

	@Column(name="TitleMyCar", columnDefinition="bit")
	private boolean titleMyCar;

	@Column(name="TitleMyWay", columnDefinition="bit")
	private boolean titleMyWay;

	@Column(name="UseCustomCodesOnly", columnDefinition="bit")
	private boolean useCustomCodesOnly;

	@Column(name="VEHICLETYPE", columnDefinition="bit")
	private boolean vehicletype;

	@Column(name="VIN", columnDefinition="bit")
	private boolean vin;

	@Column(name="WarnOnDownload", columnDefinition="bit")
	private boolean warnOnDownload;

	@Column(name="Workflow", columnDefinition="bit")
	private boolean workflow;

	@Column(name="WorkRequest", columnDefinition="bit")
	private boolean workRequest;

//	@Column(name="YEAR", columnDefinition="bit")
//	private boolean year;

	@Column(name="Zip")
	private String zip;

	//bi-directional many-to-one association to OrganizationUser
//	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER) @JoinColumn(name="orderId")
//    @Column(unique=true)
//    private List<VRReportVehicle> vehicle;
	
	
//	@ManyToMany(mappedBy="organizations")
//	private Set<User> users;
	
	
//	@OneToMany(mappedBy="organization", fetch=FetchType.EAGER)
//	private Set<OrganizationUser> organizationUsers;
//
//	//bi-directional many-to-one association to PrivilegesProfile
////	@OneToMany(mappedBy="organization", fetch=FetchType.EAGER)
//	private Set<PrivilegesProfile> privilegesProfiles;
//
//	//bi-directional many-to-one association to UserRecentDocument
////	@OneToMany(mappedBy="organization")
//	private Set<UserRecentDocument> userRecentDocuments;
		

	public Organization() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public boolean getArchiveOnPrint() {
		return this.archiveOnPrint;
	}

	public void setArchiveOnPrint(boolean archiveOnPrint) {
		this.archiveOnPrint = archiveOnPrint;
	}

	public boolean getArchiveOnRelease() {
		return this.archiveOnRelease;
	}

	public void setArchiveOnRelease(boolean archiveOnRelease) {
		this.archiveOnRelease = archiveOnRelease;
	}

	public boolean getArchiveReleaseError() {
		return this.archiveReleaseError;
	}

	public void setArchiveReleaseError(boolean archiveReleaseError) {
		this.archiveReleaseError = archiveReleaseError;
	}

	public boolean getArchiveUnrecognizedOnPrint() {
		return this.archiveUnrecognizedOnPrint;
	}

	public void setArchiveUnrecognizedOnPrint(boolean archiveUnrecognizedOnPrint) {
		this.archiveUnrecognizedOnPrint = archiveUnrecognizedOnPrint;
	}

	public boolean getAutoNLF() {
		return this.autoNLF;
	}

	public void setAutoNLF(boolean autoNLF) {
		this.autoNLF = autoNLF;
	}

	public boolean getAutoPopLoan() {
		return this.autoPopLoan;
	}

	public void setAutoPopLoan(boolean autoPopLoan) {
		this.autoPopLoan = autoPopLoan;
	}

	public boolean getAutoPrint() {
		return this.autoPrint;
	}

	public void setAutoPrint(boolean autoPrint) {
		this.autoPrint = autoPrint;
	}

	public boolean getAutoStateToState() {
		return this.autoStateToState;
	}

	public void setAutoStateToState(boolean autoStateToState) {
		this.autoStateToState = autoStateToState;
	}

	public String getBillingID() {
		return this.billingID;
	}

	public void setBillingID(String billingID) {
		this.billingID = billingID;
	}

	public boolean getCalculator() {
		return this.calculator;
	}

	public void setCalculator(boolean calculator) {
		this.calculator = calculator;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean getClearDTFLPStatusOnMatch() {
		return this.clearDTFLPStatusOnMatch;
	}

	public void setClearDTFLPStatusOnMatch(boolean clearDTFLPStatusOnMatch) {
		this.clearDTFLPStatusOnMatch = clearDTFLPStatusOnMatch;
	}

	public boolean getClearREFIOnMatch() {
		return this.clearREFIOnMatch;
	}

	public void setClearREFIOnMatch(boolean clearREFIOnMatch) {
		this.clearREFIOnMatch = clearREFIOnMatch;
	}

	public boolean getClearStatusOnMatch() {
		return this.clearStatusOnMatch;
	}

	public void setClearStatusOnMatch(boolean clearStatusOnMatch) {
		this.clearStatusOnMatch = clearStatusOnMatch;
	}

	public boolean getConfirmRemoveMatch() {
		return this.confirmRemoveMatch;
	}

	public void setConfirmRemoveMatch(boolean confirmRemoveMatch) {
		this.confirmRemoveMatch = confirmRemoveMatch;
	}

	public boolean getCosignerfirstlastonly() {
		return this.cosignerfirstlastonly;
	}

	public void setCosignerfirstlastonly(boolean cosignerfirstlastonly) {
		this.cosignerfirstlastonly = cosignerfirstlastonly;
	}

	public boolean getDealerNameDropDown() {
		return this.dealerNameDropDown;
	}

	public void setDealerNameDropDown(boolean dealerNameDropDown) {
		this.dealerNameDropDown = dealerNameDropDown;
	}

	public int getDefaultWorkflowStatus() {
		return this.defaultWorkflowStatus;
	}

	public void setDefaultWorkflowStatus(int defaultWorkflowStatus) {
		this.defaultWorkflowStatus = defaultWorkflowStatus;
	}

	public boolean getDelayedReleaseTransaction() {
		return this.delayedReleaseTransaction;
	}

	public void setDelayedReleaseTransaction(boolean delayedReleaseTransaction) {
		this.delayedReleaseTransaction = delayedReleaseTransaction;
	}

	public boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getDisableAddCollateral() {
		return this.disableAddCollateral;
	}

	public void setDisableAddCollateral(boolean disableAddCollateral) {
		this.disableAddCollateral = disableAddCollateral;
	}

	public boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean getDisbursement() {
		return this.disbursement;
	}

	public void setDisbursement(boolean disbursement) {
		this.disbursement = disbursement;
	}

	public boolean getDMVDocument() {
		return this.DMVDocument;
	}

	public void setDMVDocument(boolean DMVDocument) {
		this.DMVDocument = DMVDocument;
	}

	public boolean getDoNotPerfectVAHeld() {
		return this.doNotPerfectVAHeld;
	}

	public void setDoNotPerfectVAHeld(boolean doNotPerfectVAHeld) {
		this.doNotPerfectVAHeld = doNotPerfectVAHeld;
	}

	public boolean getEmailConfirmationOnPrint() {
		return this.emailConfirmationOnPrint;
	}

	public void setEmailConfirmationOnPrint(boolean emailConfirmationOnPrint) {
		this.emailConfirmationOnPrint = emailConfirmationOnPrint;
	}

	public boolean getFirstlastonly() {
		return this.firstlastonly;
	}

	public void setFirstlastonly(boolean firstlastonly) {
		this.firstlastonly = firstlastonly;
	}

	public int getGroupID() {
		return this.groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public boolean getHideWorkflowPhone() {
		return this.hideWorkflowPhone;
	}

	public void setHideWorkflowPhone(boolean hideWorkflowPhone) {
		this.hideWorkflowPhone = hideWorkflowPhone;
	}

	public boolean getLienholder() {
		return this.lienholder;
	}

	public void setLienholder(boolean lienholder) {
		this.lienholder = lienholder;
	}

	public boolean getLienholderasowner() {
		return this.lienholderasowner;
	}

	public void setLienholderasowner(boolean lienholderasowner) {
		this.lienholderasowner = lienholderasowner;
	}

	public Integer getLienSearchConsumed() {
		return this.lienSearchConsumed;
	}

	public void setLienSearchConsumed(Integer lienSearchConsumed) {
		this.lienSearchConsumed = lienSearchConsumed;
	}

	public boolean getMaintenanceLetterList() {
		return this.maintenanceLetterList;
	}

	public void setMaintenanceLetterList(boolean maintenanceLetterList) {
		this.maintenanceLetterList = maintenanceLetterList;
	}

	public boolean getMaintenanceStatus() {
		return this.maintenanceStatus;
	}

	public void setMaintenanceStatus(boolean maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;
	}

	public boolean getMake() {
		return this.make;
	}

	public void setMake(boolean make) {
		this.make = make;
	}

	public boolean getMileage() {
		return this.mileage;
	}

	public void setMileage(boolean mileage) {
		this.mileage = mileage;
	}

	public int getMileageTolerance() {
		return this.mileageTolerance;
	}

	public void setMileageTolerance(int mileageTolerance) {
		this.mileageTolerance = mileageTolerance;
	}

	public boolean getModel() {
		return this.model;
	}

	public void setModel(boolean model) {
		this.model = model;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getNewLoanNote() {
		return this.newLoanNote;
	}

	public void setNewLoanNote(boolean newLoanNote) {
		this.newLoanNote = newLoanNote;
	}

	public boolean getNoMatchFlags() {
		return this.noMatchFlags;
	}

	public void setNoMatchFlags(boolean noMatchFlags) {
		this.noMatchFlags = noMatchFlags;
	}

	public String getOrgID() {
		return this.orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}

	public Integer getOrgLimit() {
		return this.orgLimit;
	}

	public void setOrgLimit(Integer orgLimit) {
		this.orgLimit = orgLimit;
	}

	public boolean getOwner2() {
		return this.owner2;
	}

	public void setOwner2(boolean owner2) {
		this.owner2 = owner2;
	}

	public boolean getOwner3() {
		return this.owner3;
	}

	public void setOwner3(boolean owner3) {
		this.owner3 = owner3;
	}

	public boolean getOwner4() {
		return this.owner4;
	}

	public void setOwner4(boolean owner4) {
		this.owner4 = owner4;
	}

	public boolean getOwneraddress1() {
		return this.owneraddress1;
	}

	public void setOwneraddress1(boolean owneraddress1) {
		this.owneraddress1 = owneraddress1;
	}

	public boolean getOwneraddress2() {
		return this.owneraddress2;
	}

	public void setOwneraddress2(boolean owneraddress2) {
		this.owneraddress2 = owneraddress2;
	}

	public boolean getOwnercity() {
		return this.ownercity;
	}

	public void setOwnercity(boolean ownercity) {
		this.ownercity = ownercity;
	}

	public boolean getOwnerstate() {
		return this.ownerstate;
	}

	public void setOwnerstate(boolean ownerstate) {
		this.ownerstate = ownerstate;
	}

	public boolean getOwnerzip() {
		return this.ownerzip;
	}

	public void setOwnerzip(boolean ownerzip) {
		this.ownerzip = ownerzip;
	}

	public boolean getPaperReleaseToLoan() {
		return this.paperReleaseToLoan;
	}

	public void setPaperReleaseToLoan(boolean paperReleaseToLoan) {
		this.paperReleaseToLoan = paperReleaseToLoan;
	}

	public int getParent() {
		return this.parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getPasswordExpirationDays() {
		return this.passwordExpirationDays;
	}

	public void setPasswordExpirationDays(int passwordExpirationDays) {
		this.passwordExpirationDays = passwordExpirationDays;
	}

	public boolean getPasswordNeverExpire() {
		return this.passwordNeverExpire;
	}

	public void setPasswordNeverExpire(boolean passwordNeverExpire) {
		this.passwordNeverExpire = passwordNeverExpire;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean getPrimaryOwner() {
		return this.primaryOwner;
	}

	public void setPrimaryOwner(boolean primaryOwner) {
		this.primaryOwner = primaryOwner;
	}

	public boolean getPrimaryownertoowner2() {
		return this.primaryownertoowner2;
	}

	public void setPrimaryownertoowner2(boolean primaryownertoowner2) {
		this.primaryownertoowner2 = primaryownertoowner2;
	}

	public boolean getReleaseUnmatchedLoan() {
		return this.releaseUnmatchedLoan;
	}

	public void setReleaseUnmatchedLoan(boolean releaseUnmatchedLoan) {
		this.releaseUnmatchedLoan = releaseUnmatchedLoan;
	}

	public boolean getRetainMediaType() {
		return this.retainMediaType;
	}

	public void setRetainMediaType(boolean retainMediaType) {
		this.retainMediaType = retainMediaType;
	}

	public boolean getSetStatusForVAHeld() {
		return this.setStatusForVAHeld;
	}

	public void setSetStatusForVAHeld(boolean setStatusForVAHeld) {
		this.setStatusForVAHeld = setStatusForVAHeld;
	}

	public boolean getSetStatusTo160() {
		return this.setStatusTo160;
	}

	public void setSetStatusTo160(boolean setStatusTo160) {
		this.setStatusTo160 = setStatusTo160;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getStatusID() {
		return this.statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public boolean getSyncLoantoTitle() {
		return this.syncLoantoTitle;
	}

	public void setSyncLoantoTitle(boolean syncLoantoTitle) {
		this.syncLoantoTitle = syncLoantoTitle;
	}

	public boolean getSyncWorkflow() {
		return this.syncWorkflow;
	}

	public void setSyncWorkflow(boolean syncWorkflow) {
		this.syncWorkflow = syncWorkflow;
	}

	public boolean getTitleMyCar() {
		return this.titleMyCar;
	}

	public void setTitleMyCar(boolean titleMyCar) {
		this.titleMyCar = titleMyCar;
	}

	public boolean getTitleMyWay() {
		return this.titleMyWay;
	}

	public void setTitleMyWay(boolean titleMyWay) {
		this.titleMyWay = titleMyWay;
	}

	public boolean getUseCustomCodesOnly() {
		return this.useCustomCodesOnly;
	}

	public void setUseCustomCodesOnly(boolean useCustomCodesOnly) {
		this.useCustomCodesOnly = useCustomCodesOnly;
	}

	public boolean getVehicletype() {
		return this.vehicletype;
	}

	public void setVehicletype(boolean vehicletype) {
		this.vehicletype = vehicletype;
	}

	public boolean getVin() {
		return this.vin;
	}

	public void setVin(boolean vin) {
		this.vin = vin;
	}

	public boolean getWarnOnDownload() {
		return this.warnOnDownload;
	}

	public void setWarnOnDownload(boolean warnOnDownload) {
		this.warnOnDownload = warnOnDownload;
	}

	public boolean getWorkflow() {
		return this.workflow;
	}

	public void setWorkflow(boolean workflow) {
		this.workflow = workflow;
	}

	public boolean getWorkRequest() {
		return this.workRequest;
	}

	public void setWorkRequest(boolean workRequest) {
		this.workRequest = workRequest;
	}

//	public boolean getYear() {
//		return this.year;
//	}
//
//	public void setYear(boolean year) {
//		this.year = year;
//	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

//	public Set<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}

	
	
//	public Set<OrganizationUser> getOrganizationUsers() {
//		return this.organizationUsers;
//	}
//
//	public void setOrganizationUsers(Set<OrganizationUser> organizationUsers) {
//		this.organizationUsers = organizationUsers;
//	}
//
//	public OrganizationUser addOrganizationUser(OrganizationUser organizationUser) {
//		getOrganizationUsers().add(organizationUser);
//		organizationUser.setOrganization(this);
//		return organizationUser;
//	}
//
//	public OrganizationUser removeOrganizationUser(OrganizationUser organizationUser) {
//		getOrganizationUsers().remove(organizationUser);
//		organizationUser.setOrganization(null);
//		return organizationUser;
//	}
//
//	public Set<PrivilegesProfile> getPrivilegesProfiles() {
//		return this.privilegesProfiles;
//	}
//
//	public void setPrivilegesProfiles(Set<PrivilegesProfile> privilegesProfiles) {
//		this.privilegesProfiles = privilegesProfiles;
//	}
//	public PrivilegesProfile addPrivilegesProfile(PrivilegesProfile privilegesProfile) {
//		getPrivilegesProfiles().add(privilegesProfile);
//		privilegesProfile.setOrganization(this);
//		return privilegesProfile;
//	}
//
//	public PrivilegesProfile removePrivilegesProfile(PrivilegesProfile privilegesProfile) {
//		getPrivilegesProfiles().remove(privilegesProfile);
//		privilegesProfile.setOrganization(null);
//		return privilegesProfile;
//	}
//
//	public Set<UserRecentDocument> getUserRecentDocuments() {
//		return this.userRecentDocuments;
//	}
//
//	public void setUserRecentDocuments(Set<UserRecentDocument> userRecentDocuments) {
//		this.userRecentDocuments = userRecentDocuments;
//	}
//
//	public UserRecentDocument addUserRecentDocument(UserRecentDocument userRecentDocument) {
//		getUserRecentDocuments().add(userRecentDocument);
//		userRecentDocument.setOrganization(this);
//		return userRecentDocument;
//	}
//
//	public UserRecentDocument removeUserRecentDocument(UserRecentDocument userRecentDocument) {
//		getUserRecentDocuments().remove(userRecentDocument);
//		userRecentDocument.setOrganization(null);
//		return userRecentDocument;
//	}
	
}