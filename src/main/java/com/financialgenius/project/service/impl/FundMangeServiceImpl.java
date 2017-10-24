package com.financialgenius.project.service.impl;

import java.util.List;
import java.util.Set;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.FundMangeDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.FundMangeService;

@Service
public class FundMangeServiceImpl implements FundMangeService {
	
	@Autowired
	private FundMangeDaoImpl fundMangeDaoImpl;
	
	@Override
	public List<UserModel> getFundUsers() {
		List<UserModel> orderModels=fundMangeDaoImpl.getUsers();
		return orderModels;
	}


}
