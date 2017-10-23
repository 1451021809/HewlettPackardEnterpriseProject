package com.financialgenius.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 银行卡表
 * 
 * @author Huangyu
 *
 */
@Entity
@Table(name = "t_bankcard")
public class BankCardModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bankcard_id")
	private Long id;

	@Column(name = "bankcard_number")
	private String number;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BankCardModel [id=" + id + ", number=" + number + "]";
	}

	public BankCardModel() {
		super();
	}

	public BankCardModel(Long id) {
		super();
		this.id = id;
	}

	public BankCardModel(String number) {
		super();
		this.number = number;
	}

	public BankCardModel(Long id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

}
