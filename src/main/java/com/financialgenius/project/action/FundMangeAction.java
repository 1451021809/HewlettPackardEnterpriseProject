package com.financialgenius.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.impl.FundMangeServiceImpl;

@Component("fundMangeAction")
public class FundMangeAction {
	
	@Autowired
	private FundMangeServiceImpl fundMangeServiceImpl;

	private List<UserModel> userList;

	public String findMoneyDetails() {
		userList = fundMangeServiceImpl.getFundUsers();
		
		return "findMoneyDetails";
	}

	public List<UserModel> getUserList() {
		return userList;
	}

	public void setUserList(List<UserModel> userList) {
		this.userList = userList;
	}

}
