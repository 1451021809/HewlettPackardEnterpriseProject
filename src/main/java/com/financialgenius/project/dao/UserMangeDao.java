package com.financialgenius.project.dao;

import com.financialgenius.project.model.UserModel;

public interface UserMangeDao {
	void alterUsernameOrPassword(UserModel userModel);
	UserModel getalterUser();
}
