package com.financialgenius.project.model;

public class PersonNumber {
	private long id;
	private int number;
	private int money;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "PersonNumber [id=" + id + ", number=" + number + "]";
	}
	
}
