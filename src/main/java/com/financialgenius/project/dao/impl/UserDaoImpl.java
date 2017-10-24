package com.financialgenius.project.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.UserDao;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private BaseDao baseDao;

	@Override
	public boolean deleteUser(UserModel user) {
		baseDao.getHibernateTemplate().delete(user);
		return true;
	}

	@SuppressWarnings("unchecked")
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

	// 注册（保存）
	@Override
	public void register(UserModel userModel) {

		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
	}

	// 注册（查询用户表判断输入账户是否存在）
	@Override
	public boolean queryUser(UserModel userModel) {
		String sql = "from UserModel where username=?";
		List<UserModel> list = (List<UserModel>) baseDao.getHibernateTemplate().find(sql, userModel.getUsername());
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	// 注册（查询角色表中角色名为commonUser的用户，以便绑定用户表）
	@SuppressWarnings("unchecked")
	@Override
	public List<RolesModel> getRole(RolesModel rolesModel) {
		String sql = "from RolesModel where roleName=?";
		List<RolesModel> role = (List<RolesModel>) baseDao.getHibernateTemplate().find(sql, "commonUser");
		return role;
	}

	@SuppressWarnings("unchecked")
	// 查询基金表
	@Override
	public List<FundModel> getFundModel(FundModel fundModel) {

		return (List<FundModel>) baseDao.getHibernateTemplate().find("from FundModel");
	}

	@SuppressWarnings("unchecked")
	// 查询收益表
	@Override
	public List<ProfitModel> getProfitModel(ProfitModel profitModel) {
		return (List<ProfitModel>) baseDao.getHibernateTemplate().find("from ProfitModel");
	}

	@SuppressWarnings("unchecked")
	// 查询交易表
	@Override
	public List<TransactionModel> getTransactionModel(TransactionModel transactionModel) {
		return (List<TransactionModel>) baseDao.getHibernateTemplate().find("from TransactionModel");
	}

	// 分页查询交易表
	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionModel> findAllByPage(int pageNo, int pageSize) {

		List<TransactionModel> list = (List<TransactionModel>) baseDao.getHibernateTemplate()
				.execute(new HibernateCallback() {

					public Object doInHibernate(Session session) throws HibernateException {
						List result = session.createQuery("from TransactionModel")
								.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();
						return result;
					}
				});
		return list;

	}

	// 获取总条数
	@SuppressWarnings("unchecked")
	@Override
	public int TransactionCount() {
		int list = (int) baseDao.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				String hql = "select count(*) from TransactionModel";
				int Count = Integer.parseInt(session.createQuery(hql).list().get(0).toString());
				return Count;
			}

		});
		return list;
	}
}