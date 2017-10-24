package com.financialgenius.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.AdminServiceImpl;
import com.financialgenius.project.service.impl.UserServiceImpl;

@Component("AdminMangeAction")
public class AdminMangeAction {
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	private List<UserModel> list;
	private UserModel userModel;
	
	public String findUsers() {
		list = adminServiceImpl.getUsers();
		return "list";
	}
	public String frostUser() {
		adminServiceImpl.frostUser(userModel.getId());
		list = adminServiceImpl.getUsers();
		return "frost";
	}
	public UserModel getUserModel() {
		return userModel;
	}
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
	public List<UserModel> getList() {
		return list;
	}
}

