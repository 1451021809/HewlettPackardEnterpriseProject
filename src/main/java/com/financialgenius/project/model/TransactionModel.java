package com.financialgenius.project.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 交易明细表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_transaction")
public class TransactionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private Long id;

	@Column(name = "transaction_type")
	private String type;

	@Column(name = "transaction_money")
	private double money;

	@Column(name = "transaction_createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public TransactionModel() {
		super();
	}

	public TransactionModel(Long id) {
		super();
		this.id = id;
	}

	public TransactionModel(String type, double money, Date createDate) {
		super();
		this.type = type;
		this.money = money;
		this.createDate = createDate;
	}

	public TransactionModel(Long id, String type, double money, Date createDate) {
		super();
		this.id = id;
		this.type = type;
		this.money = money;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "TransactionModel [id=" + id + ", type=" + type + ", money=" + money + ", createDate=" + createDate
				+ "]";
	}

}
