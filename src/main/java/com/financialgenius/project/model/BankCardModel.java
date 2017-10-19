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
	private int number;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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

	public BankCardModel(int number) {
		super();
		this.number = number;
	}

	public BankCardModel(Long id, int number) {
		super();
		this.id = id;
		this.number = number;
	}

}
