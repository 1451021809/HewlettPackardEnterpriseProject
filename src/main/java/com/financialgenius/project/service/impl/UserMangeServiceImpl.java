package com.financialgenius.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.UserMangeDaoImpl;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.UserMangeService;

@Service
public class UserMangeServiceImpl implements UserMangeService {
	@Autowired
	private UserMangeDaoImpl umdp;

	@Override
	public void alterUsernameOrPassword(UserModel userModel) {
		umdp.alterUsernameOrPassword(userModel);
	}

	@Override
	public UserModel getalterUser() {
		return umdp.getalterUser();
	}

}
