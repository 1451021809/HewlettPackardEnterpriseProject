package com.financialgenius.project.service;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;

@Service
public interface UserService {
	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	UserModel isLogin(UserModel user);

}
