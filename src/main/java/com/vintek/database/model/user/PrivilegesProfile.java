package com.vintek.database.model.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PrivilegesProfile implements Serializable {
	private static final long serialVersionUID = 3209068839362478872L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="Name")
	private String name;

	//bi-directional many-to-one association to Organization
//	@ManyToOne
//	@JoinColumn(name="OrganizationID")
//	private Organization organization;
//
//	//bi-directional many-to-one association to PrivilegesProfilePermission
//	@OneToMany(mappedBy="privilegesProfile", fetch=FetchType.EAGER)
//	private Set<PrivilegesProfilePermission> privilegesProfilePermissions;

	public PrivilegesProfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public Organization getOrganization() {
//		return this.organization;
//	}
//
//	public void setOrganization(Organization organization) {
//		this.organization = organization;
//	}
//
//	public Set<PrivilegesProfilePermission> getPrivilegesProfilePermissions() {
//		return this.privilegesProfilePermissions;
//	}
//
//	public void setPrivilegesProfilePermissions(Set<PrivilegesProfilePermission> privilegesProfilePermissions) {
//		this.privilegesProfilePermissions = privilegesProfilePermissions;
//	}
//
//	public PrivilegesProfilePermission addPrivilegesProfilePermission(PrivilegesProfilePermission privilegesProfilePermission) {
//		getPrivilegesProfilePermissions().add(privilegesProfilePermission);
//		privilegesProfilePermission.setPrivilegesProfile(this);
//		return privilegesProfilePermission;
//	}
//
//	public PrivilegesProfilePermission removePrivilegesProfilePermission(PrivilegesProfilePermission privilegesProfilePermission) {
//		getPrivilegesProfilePermissions().remove(privilegesProfilePermission);
//		privilegesProfilePermission.setPrivilegesProfile(null);
//		return privilegesProfilePermission;
//	}

}