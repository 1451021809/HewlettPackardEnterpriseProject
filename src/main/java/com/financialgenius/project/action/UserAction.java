package com.financialgenius.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UserServiceImpl;

@Component("UserAction")
public class UserAction {
	@Autowired
	private UserServiceImpl impl;
	private UserModel user;
	private List<UserModel> list;
	private int userCountAll;

	public String addUsers() {
		impl.addUsers(user);
		list = impl.getUsers();
		return "add1";
	}

	public int getUserCountAll() {
		return userCountAll;
	}

	public void setUserCountAll(int userCountAll) {
		this.userCountAll = userCountAll;
	}

	public String add() {
		return "add";
	}

	public String edit() {
		user = impl.getUser(user);
		return "updat";
	}

	public String getUsers() {
		list = impl.getUsers();
		return "add1";
	}

	public String countAll() {
		list = impl.getUsers();
		userCountAll = list.size();
		return "userCountAll";
	}

	public String deleteUsers() {
		impl.deleteUser(user);
		list = impl.getUsers();
		return "delet";
	}

	public String updateUsers() {
		impl.updateUsers(user);
		list = impl.getUsers();
		return "updat1";
	}

	String searchName;

	public String dimGetUsers() {
		list = impl.dimGetUsers(searchName);
		return "dimGet";
	}

	public UserModel getUser() {
		return user;
	}

	public List<UserModel> getList() {
		return list;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}
