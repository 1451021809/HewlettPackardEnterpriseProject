package com.financialgenius.project.model;

import java.util.HashSet;
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
import javax.persistence.Table;

/**
 * 角色表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_roles")
public class RolesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roles_id")
	private Long id;

	@Column(name = "roles_roleName")
	private String roleName;

	@Column(name = "roles_describe")
	private String describe;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_roles", joinColumns = { @JoinColumn(name = "roles_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private Set<UserModel> users = new HashSet<UserModel>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Set<UserModel> getUsers() {
		return users;
	}

	public void setUsers(Set<UserModel> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "RolesModel [id=" + id + ", roleName=" + roleName + ", describe=" + describe + "]";
	}

	public RolesModel() {
		super();
	}

	public RolesModel(Long id) {
		super();
		this.id = id;
	}

	public RolesModel(String roleName, String describe, Set<UserModel> users) {
		super();
		this.roleName = roleName;
		this.describe = describe;
		this.users = users;
	}

	public RolesModel(Long id, String roleName, String describe, Set<UserModel> users) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.describe = describe;
		this.users = users;
	}

}
