package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.BuyDao;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;

@Repository
public class BuyDaoImpl implements BuyDao {

	@Autowired
	private BaseDao baseDao;

	@Override
	public List<FundModel> fundModel(FundModel fundModel) {
		String sql = "from FundModel where id=?";
		return (List<FundModel>) baseDao.getHibernateTemplate().find(sql, fundModel.getId());
	}

	@Override
	public boolean buy(UserModel model) {
		baseDao.getHibernateTemplate().saveOrUpdate(model);
		return true;
	}

}
