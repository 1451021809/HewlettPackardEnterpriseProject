package com.financialgenius.project.model;

import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 基金表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_fund")
public class FundModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fund_id")
	private Long id;

	@Column(name = "fund_name")
	private String name;

	@Column(name = "fund_describe")
	private String describe;

	@Column(name = "fund_proportion", precision = 10, scale = 4)
	private BigInteger proportion;

	@Column(name = "fund_profit", precision = 10, scale = 2)
	private BigInteger profit;

	@Column(name = "fund_createDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public BigInteger getProportion() {
		return proportion;
	}

	public void setProportion(BigInteger proportion) {
		this.proportion = proportion;
	}

	public BigInteger getProfit() {
		return profit;
	}

	public void setProfit(BigInteger profit) {
		profit = profit;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "FundModel [id=" + id + ", name=" + name + ", describe=" + describe + ", proportion=" + proportion
				+ ", Profit=" + profit + ", createDate=" + createDate + "]";
	}

	public FundModel() {
		super();
	}

	public FundModel(Long id) {
		super();
		this.id = id;
	}

	public FundModel(String name, String describe, BigInteger proportion, BigInteger profit, Date createDate) {
		super();
		this.name = name;
		this.describe = describe;
		this.proportion = proportion;
		this.profit = profit;
		this.createDate = createDate;
	}

	public FundModel(Long id, String name, String describe, BigInteger proportion, BigInteger profit, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.describe = describe;
		this.proportion = proportion;
		this.profit = profit;
		this.createDate = createDate;
	}

}
