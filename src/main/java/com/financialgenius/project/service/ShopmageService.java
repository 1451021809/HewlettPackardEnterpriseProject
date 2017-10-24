package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;

@Service
public interface ShopmageService {
	List<FundModel> getFund();
	
	List<OrderModel> getOrder();
	
	/**
	 * 删除商品
	 * @param fund
	 */
	void deleteFund(FundModel fund);
	
	FundModel getFunds(FundModel fund);
	
	/**
	 * 修改商品
	 */
	void updateFund(FundModel fund);
	
	/**
	 * 添加商品
	 */
	void addFund(FundModel fund);
}
