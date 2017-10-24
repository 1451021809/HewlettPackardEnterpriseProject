package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.ShopmageDao;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;

@Repository
public class ShopmageDaoImpl implements ShopmageDao {

	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<FundModel> getFund() {

		return (List<FundModel>) baseDao.getHibernateTemplate().find("from FundModel");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderModel> getOrder() {

		return (List<OrderModel>) baseDao.getHibernateTemplate().find("from OrderModel");
	}

	@Override
	public void deleteFund(FundModel fund) {

		baseDao.getHibernateTemplate().delete(fund);

	}

	@Override
	public void updateFund(FundModel fund) {

		baseDao.getHibernateTemplate().saveOrUpdate(fund);

	}

	@Override
	public FundModel getFunds(FundModel fund) {

		return baseDao.getHibernateTemplate().get(FundModel.class, fund.getId());
	}

	@Override
	public void addFund(FundModel fund) {
		baseDao.getHibernateTemplate().save(fund);
	}

}
