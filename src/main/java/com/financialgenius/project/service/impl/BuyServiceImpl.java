package com.financialgenius.project.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.BuyDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	private BuyDaoImpl BuyServiceImpl;

	@Override
	public List<FundModel> fundModel(FundModel fundModel) {

		return BuyServiceImpl.fundModel(fundModel);
	}

	@Override
	public boolean buy(int money, UserModel isLogin, String name) {
		isLogin.getTransactionModels().add(new TransactionModel("购买" + name, money, new Date()));
		return BuyServiceImpl.buy(isLogin);
	}

}
