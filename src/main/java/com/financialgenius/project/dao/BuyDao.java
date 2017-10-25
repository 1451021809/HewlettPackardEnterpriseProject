package com.financialgenius.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;

@Repository
public interface BuyDao {

	List<FundModel> fundModel(FundModel fundModel);
	
	boolean buy(UserModel model);

}