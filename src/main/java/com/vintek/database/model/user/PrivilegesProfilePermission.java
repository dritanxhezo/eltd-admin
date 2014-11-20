package com.vintek.database.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PrivilegesProfilePermissions")
public class PrivilegesProfilePermission implements Serializable {
	private static final long serialVersionUID = 2747743759500931416L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	//bi-directional many-to-one association to Privilege
//	@ManyToOne
//	@JoinColumn(name="PrivilegeID")
//	private Privilege privilege;

	//bi-directional many-to-one association to PrivilegesProfile
//	@ManyToOne
//	@JoinColumn(name="PrivilegesProfileID")
//	private PrivilegesProfile privilegesProfile;

	public PrivilegesProfilePermission() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Privilege getPrivilege() {
//		return this.privilege;
//	}
//
//	public void setPrivilege(Privilege privilege) {
//		this.privilege = privilege;
//	}
//
//	public PrivilegesProfile getPrivilegesProfile() {
//		return this.privilegesProfile;
//	}
//
//	public void setPrivilegesProfile(PrivilegesProfile privilegesProfile) {
//		this.privilegesProfile = privilegesProfile;
//	}

}