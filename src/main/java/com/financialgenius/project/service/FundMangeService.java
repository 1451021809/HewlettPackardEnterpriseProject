package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;
@Service
public interface FundMangeService {
//	List<OrderModel> getFundDetails();
	List<UserModel> getFundUsers();
}
