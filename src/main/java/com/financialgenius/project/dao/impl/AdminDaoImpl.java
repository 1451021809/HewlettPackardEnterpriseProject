package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.AdminDao;
import com.financialgenius.project.model.UserModel;
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private BaseDao baseDao;
	@Override
	public List<UserModel> getUsers() {		
		return (List<UserModel> )baseDao.getHibernateTemplate().find("from UserModel limit 0,2");
	}
	@Override
	public void frostUser(long id) {
		
		baseDao.getHibernateTemplate().bulkUpdate("update UserModel set status=? where id=?",new Object[] {2,id});
}
}