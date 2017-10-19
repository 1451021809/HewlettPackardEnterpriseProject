package com.financialgenius.project.dao;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.UserModel;

@Repository
public interface UserDao {
	UserModel isLogin(UserModel user);

	boolean deleteUser(UserModel user);
}