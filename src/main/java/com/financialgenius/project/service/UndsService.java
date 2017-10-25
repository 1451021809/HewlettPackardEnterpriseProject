package com.financialgenius.project.service;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;

@Service
public interface UndsService {
	List<FundModel> getUnds();
	List<UserModel> getMyFund(UserModel userModel);
	
}
