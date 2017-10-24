package com.financialgenius.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;

@Repository
public interface ShopmageDao {
	List<FundModel> getFund();
	
	List<OrderModel> getOrder();
	
	//删除基金方法
	void deleteFund(FundModel fund);
	
	FundModel getFunds(FundModel fund);
	
	//修改基金
	void updateFund(FundModel fund);
	
	//添加基金
	void addFund(FundModel fund);
	
	
}
