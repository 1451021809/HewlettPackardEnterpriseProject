package com.financialgenius.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.UserDaoImpl;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Override
	public UserModel isLogin(UserModel user) {
		return userDaoImpl.isLogin(user);
	}

}
