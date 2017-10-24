package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.FundMangeDao;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;

@Repository
public class FundMangeDaoImpl implements FundMangeDao {
	
	@Autowired
	private	BaseDao basedao;
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderModel> getFundDetails() {
	
		
		return (List<OrderModel>)basedao.getHibernateTemplate().find("from OrderModel  ");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserModel> getUsers() {
		return (List<UserModel>)basedao.getHibernateTemplate().find("from UserModel");
	}

}
