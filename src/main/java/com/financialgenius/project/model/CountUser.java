package com.financialgenius.project.model;

public class CountUser {

	private int count;

	public int getCount()
	{
		return ++count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
	
	
}

