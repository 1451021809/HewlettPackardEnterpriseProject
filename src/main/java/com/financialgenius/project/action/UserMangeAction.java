package com.financialgenius.project.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UserMangeServiceImpl;

@Component("UserMangeAction")
public class UserMangeAction {
	@Autowired
	private UserMangeServiceImpl userMangeServiceImpl;
	private UserModel userModel;

	public void getUser() {
		userModel = userMangeServiceImpl.getalterUser();
	}

	public String to_alterUsername() {
		userModel = userMangeServiceImpl.getalterUser();
		return "succesAlterUsername";
	}

	public String to_alterPassword() {
		userModel = userMangeServiceImpl.getalterUser();
		return "succesAlterPassword";
	}

	public String alterUsername() {
		userMangeServiceImpl.alterUsernameOrPassword(userModel);
		return "alterUsername";
	}
	
	public String alterPassword() {
		userMangeServiceImpl.alterUsernameOrPassword(userModel);
		ServletActionContext.getRequest().getSession().invalidate();
		return "alterPassword";
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
