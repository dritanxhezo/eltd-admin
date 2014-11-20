package com.vintek.database.model.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserPermissions")
public class UserPermission implements Serializable {
	private static final long serialVersionUID = -4174895725107419980L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="OrganizationID")
	private int organizationID;

//	//bi-directional many-to-one association to Privilege
//	@ManyToOne
//	@JoinColumn(name="PrivilegeID")
//	private Privilege privilege;
	
	@ManyToOne(fetch=FetchType.EAGER) @JoinColumn(name="PrivilegeID")
    //@Column(unique=true)
	private Privilege privilege;
	
	//bi-directional one-to-one association to UserPermission
//	@OneToOne
//	@JoinColumn(name="ID")
//	private UserPermission userPermission1;
//
//	//bi-directional one-to-one association to UserPermission
//	@OneToOne(mappedBy="userPermission1")
//	private UserPermission userPermission2;

//	//bi-directional many-to-one association to User
//	@ManyToOne
//	@JoinColumn(name="UserID")
//	private User user;

	public UserPermission() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public Privilege getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

//	public UserPermission getUserPermission1() {
//		return this.userPermission1;
//	}
//
//	public void setUserPermission1(UserPermission userPermission1) {
//		this.userPermission1 = userPermission1;
//	}
//
//	public UserPermission getUserPermission2() {
//		return this.userPermission2;
//	}
//
//	public void setUserPermission2(UserPermission userPermission2) {
//		this.userPermission2 = userPermission2;
//	}

//	public User getUser() {
//		return this.user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

}