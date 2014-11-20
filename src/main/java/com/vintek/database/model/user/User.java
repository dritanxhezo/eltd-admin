package com.vintek.database.model.user;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Users", uniqueConstraints = @UniqueConstraint(columnNames = "UserID"))
public class User implements Serializable {
	private static final long serialVersionUID = 4491341983954025916L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="ActivatedOn")
	private Timestamp activatedOn;

	@Column(name="BroadcastMessageID")
	private int broadcastMessageID;

	@Column(name="BroadcastMessageSetting")
	private String broadcastMessageSetting;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="ChangePassword", columnDefinition="bit")
	private boolean changePassword;

	@Column(name="Comment")
	private String comment;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreatedOn")
	private Timestamp createdOn;

	@Column(name="DefaultOrgID")
	private int defaultOrgID;

	@Column(name="DefaultSearchType")
	private String defaultSearchType;

	@Column(name="Deleted", columnDefinition="bit")
	private boolean deleted;

	@NotNull @NotEmpty @Email
	@Column(name="Email")
	private String email;

	@Column(name="Enabled", columnDefinition="bit")
	private boolean enabled;

	@Column(name="ExpirationDate")
	private Timestamp expirationDate;

	@Column(name="Extension")
	private String extension;

	@Column(name="FailedLogins")
	private short failedLogins;

	@Column(name="FAX")
	private String fax;

	@Column(name="GroupID")
	private int groupID;

	@Column(name="LastLogin")
	private Timestamp lastLogin;

	@Column(name="Misc")
	private String misc;

	@NotNull
	@Size(min = 1, max = 25)
	@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	@Column(name="Name")
	private String name;

	@Column(name="OrgSpecificPermissions")
	private boolean orgSpecificPermissions=false;

	@Column(name="Password")
	private String password;

	@Column(name="PasswordChangeDate")
	private Timestamp passwordChangeDate;

	@Column(name="PasswordEnc")
	private String passwordEnc;

	@Size(min = 9, max = 15)
	@Pattern(regexp = "^\\+?\\d+(-\\d+)*$", message = "invalid phone number")
	@Column(name="Phone")
	private String phone;

	@Size(min = 1, max = 4)
	@Digits(fraction = 0, integer = 4)
	@Column(name="PIN")
	private String pin;

	@Column(name="SalesAssociateID")
	private String salesAssociateID;

	@Column(name="ServiceCenter")
	private Integer serviceCenter;

	@Column(name="Theme")
	private String theme;

	@Column(name="TimeZone")
	private String timeZone;

	@Column(name="Token")
	private String token;

	@Column(name="TrainingVidExp")
	private Timestamp trainingVidExp;

	@Column(name="TrainingVidStart")
	private Timestamp trainingVidStart;

	@Column(name="TransactionID")
	private int transactionID;

	@Column(name="UserID")
	private String userID;

	//bi-directional many-to-one association to OrganizationUser
//	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
//	private Set<OrganizationUser> organizationUsers;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="OrganizationUser",
	      joinColumns={@JoinColumn(name="UserID", referencedColumnName="ID")},
	      inverseJoinColumns={@JoinColumn(name="OrganizationID", referencedColumnName="ID")})
	private Set<Organization> organizations;
	
	
	//bi-directional many-to-one association to UserPermission
//	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	//uni-directional association to UserPermission
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER) @JoinColumn(name="UserID")
    @Column(unique=true)
	private List<UserPermission> userPermissions;

//	@ManyToMany(fetch=FetchType.EAGER)
//	@JoinTable(name="UserPermissions",
//	      joinColumns={@JoinColumn(name="UserID", referencedColumnName="ID")},
//	      inverseJoinColumns={@JoinColumn(name="PrivilegeID", referencedColumnName="ID")})
//	private Set<Privilege> priviledges;
	  
	//bi-directional many-to-one association to UserRecentDocument
//	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER) @JoinColumn(name="UserID")
    @Column(unique=true)	
	private Set<UserRecentDocument> userRecentDocuments;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getActivatedOn() {
		return this.activatedOn;
	}

	public void setActivatedOn(Timestamp activatedOn) {
		this.activatedOn = activatedOn;
	}

	public int getBroadcastMessageID() {
		return this.broadcastMessageID;
	}

	public void setBroadcastMessageID(int broadcastMessageID) {
		this.broadcastMessageID = broadcastMessageID;
	}

	public String getBroadcastMessageSetting() {
		return this.broadcastMessageSetting;
	}

	public void setBroadcastMessageSetting(String broadcastMessageSetting) {
		this.broadcastMessageSetting = broadcastMessageSetting;
	}

	public Timestamp getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Timestamp changeDate) {
		this.changeDate = changeDate;
	}

	public boolean getChangePassword() {
		return this.changePassword;
	}

	public void setChangePassword(boolean changePassword) {
		this.changePassword = changePassword;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getDefaultOrgID() {
		return this.defaultOrgID;
	}

	public void setDefaultOrgID(int defaultOrgID) {
		this.defaultOrgID = defaultOrgID;
	}

	public String getDefaultSearchType() {
		return this.defaultSearchType;
	}

	public void setDefaultSearchType(String defaultSearchType) {
		this.defaultSearchType = defaultSearchType;
	}

	public boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Timestamp getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public short getFailedLogins() {
		return this.failedLogins;
	}

	public void setFailedLogins(short failedLogins) {
		this.failedLogins = failedLogins;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public int getGroupID() {
		return this.groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getMisc() {
		return this.misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getOrgSpecificPermissions() {
		return this.orgSpecificPermissions;
	}

	public void setOrgSpecificPermissions(boolean orgSpecificPermissions) {
		this.orgSpecificPermissions = orgSpecificPermissions;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getPasswordChangeDate() {
		return this.passwordChangeDate;
	}

	public void setPasswordChangeDate(Timestamp passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
	}

	public String getPasswordEnc() {
		return this.passwordEnc;
	}

	public void setPasswordEnc(String passwordEnc) {
		this.passwordEnc = passwordEnc;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getSalesAssociateID() {
		return this.salesAssociateID;
	}

	public void setSalesAssociateID(String salesAssociateID) {
		this.salesAssociateID = salesAssociateID;
	}

	public int getServiceCenter() {
		return this.serviceCenter;
	}

	public void setServiceCenter(int serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getTrainingVidExp() {
		return this.trainingVidExp;
	}

	public void setTrainingVidExp(Timestamp trainingVidExp) {
		this.trainingVidExp = trainingVidExp;
	}

	public Timestamp getTrainingVidStart() {
		return this.trainingVidStart;
	}

	public void setTrainingVidStart(Timestamp trainingVidStart) {
		this.trainingVidStart = trainingVidStart;
	}

	public int getTransactionID() {
		return this.transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

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
//		organizationUser.setUser(this);
//		return organizationUser;
//	}
//
//	public OrganizationUser removeOrganizationUser(OrganizationUser organizationUser) {
//		getOrganizationUsers().remove(organizationUser);
//		organizationUser.setUser(null);
//		return organizationUser;
//	}

	public List<UserPermission> getUserPermissions() {
		if (this.userPermissions == null) {
			this.userPermissions = new ArrayList<UserPermission>();
		}
		return this.userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

//	public UserPermission addUserPermission(UserPermission userPermission) {
//		getUserPermissions().add(userPermission);
//		//userPermission.setUser(this);
//		return userPermission;
//	}
//
//	public UserPermission removeUserPermission(UserPermission userPermission) {
//		getUserPermissions().remove(userPermission);
//		//userPermission.setUser(null);
//		return userPermission;
//	}

//	public Set<Privilege> getPriviledges() {
//		return priviledges;
//	}
//
//	public void setPriviledges(Set<Privilege> priviledges) {
//		this.priviledges = priviledges;
//	}

	public Set<UserRecentDocument> getUserRecentDocuments() {
//		if (this.userRecentDocuments == null) {
//			this.userRecentDocuments = new ArrayList<UserRecentDocument>();
//		}		
		return this.userRecentDocuments;
	}

	public void setUserRecentDocuments(Set<UserRecentDocument> userRecentDocuments) {
		this.userRecentDocuments = userRecentDocuments;
	}

	public Set<Organization> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(Set<Organization> organizations) {
		this.organizations = organizations;
	}

//	public UserRecentDocument addUserRecentDocument(UserRecentDocument userRecentDocument) {
//		getUserRecentDocuments().add(userRecentDocument);
//		userRecentDocument.setUser(this);
//		return userRecentDocument;
//	}
//
//	public UserRecentDocument removeUserRecentDocument(UserRecentDocument userRecentDocument) {
//		getUserRecentDocuments().remove(userRecentDocument);
//		userRecentDocument.setUser(null);
//		return userRecentDocument;
//	}
}