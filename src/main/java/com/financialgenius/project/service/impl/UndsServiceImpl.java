package com.financialgenius.project.service.impl;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.UndsDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.UndsService;

@Service
public class UndsServiceImpl implements UndsService{
	
	@Autowired
	private UndsDaoImpl undsDaoImpl;

	@Override
	public List<FundModel> getUnds() {
		
		return undsDaoImpl.getUnds();
	}

	@Override
	public List<UserModel> getMyFund(UserModel userModel) {
		List<UserModel> uList=undsDaoImpl.getMyFund(userModel);
		return uList;
	}

	
}
