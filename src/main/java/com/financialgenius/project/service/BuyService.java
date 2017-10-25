package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.UserModel;

@Service
public interface BuyService {
	List<FundModel> fundModel(FundModel fundModel);

	boolean buy(int money, UserModel isLogin, String name);
}
