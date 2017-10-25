package com.financialgenius.project.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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

	// 根据登录的用户查询该用户的交易数据（分页查询）
	/**
	 * 使用HQL语句进行分页查询操作 pageNo :当前页码 pageSize :一页显示最多条数 id:当前用户登录id
	 * 
	 * @return 当前页的所有记录
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TransactionModel> findAllByPage(int pageNo, int pageSize, Long id) {

		List<TransactionModel> list = (List<TransactionModel>) baseDao.getHibernateTemplate()
				.execute(new HibernateCallback() {

					public Object doInHibernate(Session session) throws HibernateException {
						String hql = "from TransactionModel where user_id = ?";
						Query query = session.createQuery(hql);
						query.setLong(0, id);
						// 设定从哪一行开始，因为数据库的下标是从0开始的
						query.setFirstResult((pageNo - 1) * pageSize);
						// 设定每页显示的数据有多少
						query.setMaxResults(pageSize);
						List<TransactionModel> i = query.list();
						return i;
					}
				});
		return list;
	}

	// 获取总条数（分页查询）
	@SuppressWarnings("unchecked")
	@Override
	public int TransactionCount(Long id) {
		Long count = (Long) baseDao.getHibernateTemplate()
				.find("select count(*) from TransactionModel where user_id = ? ", id).listIterator().next();
		return count.intValue();

	}
	// 获取角色
	@Override
	public List<UserModel> getRoles(UserModel user) {
		String sql = "from UserModel where id=?";
		List<UserModel> model = (List<UserModel>) baseDao.getHibernateTemplate().find(sql, user.getId());
		return model;
	}

}