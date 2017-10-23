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
 * 收益表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_profit")
public class ProfitModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profit_id")
	private Long id;

	@Column(name = "profit_profit", precision = 20, scale = 2)
	private Double profit;

	@Column(name = "profit_createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "ProfitModel [id=" + id + ", profit=" + profit + ", createDate=" + createDate + "]";
	}

	public ProfitModel() {
		super();
	}

	public ProfitModel(Long id) {
		super();
		this.id = id;
	}

	public ProfitModel(Double profit, Date createDate) {
		super();
		this.profit = profit;
		this.createDate = createDate;
	}

	public ProfitModel(Long id, Double profit, Date createDate) {
		super();
		this.id = id;
		this.profit = profit;
		this.createDate = createDate;
	}

}
