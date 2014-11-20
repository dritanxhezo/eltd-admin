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
import javax.persistence.Table;

@Entity
@Table(name="Privileges")
public class Privilege implements Serializable {
	private static final long serialVersionUID = 5382404187729153237L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="Description")
	private String description;

	@Column(name="Displayed", columnDefinition="bit")
	private boolean displayed;

	@Column(name="DisplayGroup")
	private Short displayGroup;

	@Column(name="DisplayName")
	private String displayName;

	@Column(name="DisplayOrder")
	private Short displayOrder;

	@Column(name="PermissionName")
	private String permissionName;

	@Column(name="VintekOnlyDisplayed", columnDefinition="bit")
	private boolean vintekOnlyDisplayed;

	//bi-directional many-to-one association to UserPermission
//	@OneToMany(mappedBy="privilege", fetch=FetchType.EAGER)
//	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true, fetch=FetchType.EAGER) @JoinColumn(name="PrivilegeID")
//    @Column(unique=true)
//	private Set<UserPermission> userPermissions;

	//bi-directional many-to-one association to PrivilegesProfilePermission
//	@OneToMany(mappedBy="privilege", fetch=FetchType.EAGER)
//	private Set<PrivilegesProfilePermission> privilegesProfilePermissions;
	
//	@ManyToMany(mappedBy="priviledges", fetch=FetchType.EAGER)
//	private List<User> users;

	public Privilege() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getDisplayed() {
		return this.displayed;
	}

	public void setDisplayed(boolean displayed) {
		this.displayed = displayed;
	}

	public Short getDisplayGroup() {
		return this.displayGroup;
	}

	public void setDisplayGroup(Short displayGroup) {
		this.displayGroup = displayGroup;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public boolean getVintekOnlyDisplayed() {
		return this.vintekOnlyDisplayed;
	}

	public void setVintekOnlyDisplayed(boolean vintekOnlyDisplayed) {
		this.vintekOnlyDisplayed = vintekOnlyDisplayed;
	}

//	public Set<UserPermission> getUserPermissions() {
//		return this.userPermissions;
//	}
//
//	public void setUserPermissions(Set<UserPermission> userPermissions) {
//		this.userPermissions = userPermissions;
//	}
//
//	public UserPermission addUserPermission(UserPermission userPermission) {
//		getUserPermissions().add(userPermission);
//		//userPermission.setPrivilege(this);
//		return userPermission;
//	}
//
//	public UserPermission removeUserPermission(UserPermission userPermission) {
//		getUserPermissions().remove(userPermission);
//		//userPermission.setPrivilege(null);
//		return userPermission;
//	}

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

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
//		privilegesProfilePermission.setPrivilege(this);
//		return privilegesProfilePermission;
//	}
//
//	public PrivilegesProfilePermission removePrivilegesProfilePermission(PrivilegesProfilePermission privilegesProfilePermission) {
//		getPrivilegesProfilePermissions().remove(privilegesProfilePermission);
//		privilegesProfilePermission.setPrivilege(null);
//		return privilegesProfilePermission;
//	}
}