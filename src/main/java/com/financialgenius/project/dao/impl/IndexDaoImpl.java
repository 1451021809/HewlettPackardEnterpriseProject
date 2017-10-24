package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.IndexDao;
import com.financialgenius.project.model.FundModel;

@Repository
public class IndexDaoImpl implements IndexDao {

	@Autowired
	private BaseDao baseDao;

	@Override
	public List<FundModel> fundDao() {
		String sql = "from FundModel";
		return (List<FundModel>) baseDao.getHibernateTemplate().find(sql);
	}

}
