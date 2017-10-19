package com.financialgenius.project.model;

import java.math.BigInteger;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 钱包表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_wallet")
public class WalletModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wallet_id")
	private Long id;

	@Column(name = "wallet_assets", precision = 20, scale = 2)
	private BigInteger proportion;

	@Column(name = "wallet_totalProfit", precision = 20, scale = 2)
	private BigInteger totalProfit;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private UserModel users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getProportion() {
		return proportion;
	}

	public void setProportion(BigInteger proportion) {
		this.proportion = proportion;
	}

	public BigInteger getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(BigInteger totalProfit) {
		this.totalProfit = totalProfit;
	}

	public UserModel getUsers() {
		return users;
	}

	public void setUsers(UserModel users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "WalletModel [id=" + id + ", proportion=" + proportion + ", totalProfit=" + totalProfit + "]";
	}

	public WalletModel() {
		super();
	}

	public WalletModel(Long id) {
		super();
		this.id = id;
	}

	public WalletModel(BigInteger proportion, BigInteger totalProfit) {
		super();
		this.proportion = proportion;
		this.totalProfit = totalProfit;
	}

	public WalletModel(Long id, BigInteger proportion, BigInteger totalProfit) {
		super();
		this.id = id;
		this.proportion = proportion;
		this.totalProfit = totalProfit;
	}

}
