package com.financialgenius.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.UserMangeDaoImpl;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.UserMangeService;
@Service
public class UserMangeImpl implements UserMangeService {
@Autowired
private UserMangeDaoImpl umdp;
	@Override
	public void alterUsername(UserModel userModel) {
		
		umdp.alterUsername(userModel);
	}

	@Override
	public void alterPassword(UserModel userModel) {
		umdp.alterPassword(userModel);		
	}

	@Override
	public UserModel getalterUser() {
		// TODO Auto-generated method stub
		return umdp.getalterUser();
	}


}
