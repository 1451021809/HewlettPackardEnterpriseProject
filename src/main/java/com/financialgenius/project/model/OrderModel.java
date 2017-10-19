package com.financialgenius.project.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 订单表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_order")
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long id;

	@Column(name = "order_money")
	private int money;

	@Column(name = "order_createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "fund_id")
	private FundModel fundModel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public FundModel getFundModel() {
		return fundModel;
	}

	public void setFundModel(FundModel fundModel) {
		this.fundModel = fundModel;
	}

	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", money=" + money + ", createDate=" + createDate + "]";
	}

	public OrderModel() {
		super();
	}

	public OrderModel(Long id) {
		super();
		this.id = id;
	}

	public OrderModel(Date createDate) {
		super();
		this.createDate = createDate;
	}

	public OrderModel(int money, Date createDate) {
		super();
		this.money = money;
		this.createDate = createDate;
	}

}
