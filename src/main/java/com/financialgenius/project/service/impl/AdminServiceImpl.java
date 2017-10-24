package com.financialgenius.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.AdminDaoImpl;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDaoImpl adminDaoImpl;
	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		return adminDaoImpl.getUsers();
	}
	
	@Override
	public void frostUser(long id) {
		adminDaoImpl.frostUser(id);
	}
}
