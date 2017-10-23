package com.financialgenius.project.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UserServiceImpl;

/**
 * 登录和注册
 * 
 * @author Huangyu
 *
 */
@Component("LoginAndRegisterAction")
public class LoginAndRegisterAction {
	@Autowired
	private UserServiceImpl impl;

	private List<UserModel> list;
	private UserModel user;
	private UserModel isLogin;

	public String Login() {
		isLogin = impl.isLogin(user);
		if (isLogin == null) {
			return "noLogin";
		} else {
			// 保存用户登录信息
			ServletActionContext.getRequest().getSession().setAttribute("isLogin", isLogin);
			return "login";
		}

	}

	public List<UserModel> getList() {
		return list;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public UserModel getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(UserModel isLogin) {
		this.isLogin = isLogin;
	}
}
