package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.action.LoginAndRegisterAction;
import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.UndsDao;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;

@Repository
public class UndsDaoImpl implements UndsDao{
	
	@Autowired
	private BaseDao baseDao;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FundModel> getUnds() {
		
		return (List<FundModel>) baseDao.getHibernateTemplate().find("select f.name,f.profit,o.money,o.createDate from FundModel f,OrderModel o where o.fundModel=f.id");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserModel> getMyFund(UserModel userModel) {
		Long userid =userModel.getId();
		String sql="from UserModel u where u.id='"+userid+"' ";
		List<UserModel> userModels=(List<UserModel>) baseDao.getHibernateTemplate().find(sql); 
		return userModels;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}

	
	
	



}
