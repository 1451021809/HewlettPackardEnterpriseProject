package com.financialgenius.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.ShopmageDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.service.ShopmageService;

@Service
public class ShopmageServiceImpl implements ShopmageService {

	@Autowired
	private ShopmageDaoImpl shopmageDaoImpl;

	@Override
	public List<FundModel> getFund() {

		return shopmageDaoImpl.getFund();
	}

	@Override
	public List<OrderModel> getOrder() {

		return shopmageDaoImpl.getOrder();
	}

	/**
	 * 删除
	 */
	@Override
	public void deleteFund(FundModel fund) {
		shopmageDaoImpl.deleteFund(fund);

	}

	/**
	 * 修改
	 */
	@Override
	public void updateFund(FundModel fund) {
		shopmageDaoImpl.updateFund(fund);

	}

	@Override
	public FundModel getFunds(FundModel fund) {

		return shopmageDaoImpl.getFunds(fund);
	}

	@Override
	public void addFund(FundModel fund) {
		shopmageDaoImpl.addFund(fund);
	}

}
