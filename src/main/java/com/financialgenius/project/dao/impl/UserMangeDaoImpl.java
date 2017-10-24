package com.financialgenius.project.dao.impl;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.UserMangeDao;
import com.financialgenius.project.model.UserModel;

@Repository
public class UserMangeDaoImpl implements UserMangeDao{

	@Autowired
	private BaseDao baseDao;
	@Override
	public void alterUsernameOrPassword(UserModel userModel) {
		baseDao.getHibernateTemplate().update(userModel);
		
	}

	@Override
	public UserModel getalterUser() {		
		return (UserModel)ServletActionContext.getRequest().getSession().getAttribute("isLogin");
		
	}

}
