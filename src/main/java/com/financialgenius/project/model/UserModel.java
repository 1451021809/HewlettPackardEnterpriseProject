package com.financialgenius.project.model;

import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 * 用户表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_user")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "user_name")
	private String name;

	@Column(name = "user_username")
	private String username;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_status")
	private int status;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	// 用户与角色多对多关系
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_roles", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "roles_id") })
	private Set<RolesModel> roles = new HashSet<RolesModel>();

	// 用户与订单一对多关系
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER) // 直接加载，可进行增，查改操作
	@JoinColumn(name = "user_id")
	private Set<OrderModel> orders = new HashSet<OrderModel>();

	// 用户与钱包一对一关系
	@OneToOne(mappedBy = "users", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private WalletModel walletModel;

	// 用户与收益一对多关系
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER) // 直接加载，可进行增，查改操作
	@JoinColumn(name = "user_id")
	private Set<ProfitModel> profitModels = new HashSet<ProfitModel>();

	// 用户与交易明细一对多关系
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER) // 直接加载，可进行增，查改操作
	@JoinColumn(name = "user_id")
	private Set<TransactionModel> transactionModels = new HashSet<TransactionModel>();

	// 用户与银行卡一对多关系
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER) // 直接加载，可进行增，查改操作
	@JoinColumn(name = "user_id")
	private Set<BankCardModel> bankCardModels = new HashSet<BankCardModel>();

	public Set<OrderModel> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderModel> orders) {
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<RolesModel> getRoles() {
		return roles;
	}

	public void setRoles(Set<RolesModel> roles) {
		this.roles = roles;
	}

	public WalletModel getWalletModel() {
		return walletModel;
	}

	public void setWalletModel(WalletModel walletModel) {
		this.walletModel = walletModel;
	}

	public Set<ProfitModel> getProfitModels() {
		return profitModels;
	}

	public void setProfitModels(Set<ProfitModel> profitModels) {
		this.profitModels = profitModels;
	}

	public Set<TransactionModel> getTransactionModels() {
		return transactionModels;
	}

	public void setTransactionModels(Set<TransactionModel> transactionModels) {
		this.transactionModels = transactionModels;
	}

	public Set<BankCardModel> getBankCardModels() {
		return bankCardModels;
	}

	public void setBankCardModels(Set<BankCardModel> bankCardModels) {
		this.bankCardModels = bankCardModels;
	}

	
	
	public UserModel() {
		super();
	}

	public UserModel(Long id) {
		super();
		this.id = id;
	}

	public UserModel(String name, String username, String password, int status, String email, Date createDate) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.status = status;
		this.email = email;
		this.createDate = createDate;
	}

	public UserModel(Long id, String name, String username, String password, int status, String email,
			Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.status = status;
		this.email = email;
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", status=" + status + ", email=" + email + ", createDate=" + createDate + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		System.out.println("equals========");
		if(!(arg0 instanceof UserModel)){
			return false;
		}else {
			UserModel compareObject = (UserModel)arg0;
			if(compareObject.id==this.id){
				return true;
			}else{
				return false;
			}
		}
	}
	
	
}
