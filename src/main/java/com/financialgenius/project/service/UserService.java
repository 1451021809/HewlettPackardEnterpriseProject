package com.financialgenius.project.service;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.UserModel;

@Service
public interface UserService {
	UserModel isLogin(UserModel user);

	void deleteUser(UserModel user);
}
