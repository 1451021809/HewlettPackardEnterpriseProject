package com.financialgenius.project.service;

import java.util.List;

import com.financialgenius.project.model.UserModel;

public interface AdminService {
	List<UserModel> getUsers();
	 void frostUser(long id);
}
