package com.financialgenius.project.service;

import com.financialgenius.project.model.UserModel;

public interface UserMangeService {
	void alterUsernameOrPassword(UserModel userModel);
	UserModel getalterUser();	
}
