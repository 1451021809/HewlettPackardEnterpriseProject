package com.financialgenius.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.UserDao;
import com.financialgenius.project.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private BaseDao baseDao;

	@Override
	public UserModel isLogin(UserModel user) {
		String sql = "from UserModel where username=? and password=? and status=?";
		List<UserModel> list = (List<UserModel>) baseDao.getHibernateTemplate().find(sql, user.getUsername(),
				user.getPassword(), 1);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
