package com.financialgenius.project.dao;

import java.util.List;

import com.financialgenius.project.model.UserModel;

public interface AdminDao {
	List<UserModel> getUsers();
	void frostUser(long id);

}
