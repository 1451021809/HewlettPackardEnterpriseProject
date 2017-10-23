package com.financialgenius.project.dao;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.UserModel;

@Repository
public interface UserDao {
	/**
	 * 用户登录
	 * 
	 * @param wallet
	 * @return
	 */
	UserModel isLogin(UserModel user);

}