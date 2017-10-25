package com.financialgenius.project.service.impl;

import java.util.List;
import java.util.Set;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.UserDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;

import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Override
	public UserModel isLogin(UserModel user) {
		return userDaoImpl.isLogin(user);
	}

	// 获取角色
	@Override
	public int getRoles(UserModel user) {
		List<UserModel> model = userDaoImpl.getRoles(user);
		for (UserModel userModel : model) {
			Set<RolesModel> rolesModel = userModel.getRoles();
			for (RolesModel rolesModel2 : rolesModel) {
				if (rolesModel2.getId() == 1) {
					return 1;
				} else {
					return 2;
				}
			}
		}
		return 0;
	}

	// 注册 （添加）
	@Override
	public void register(UserModel userModel) {
		userDaoImpl.register(userModel);
	}

	// 注册（查询账户是否存在）
	@Override
	public boolean queryUser(UserModel userModel) {

		return userDaoImpl.queryUser(userModel);
	}

	// 注册（查询角色表中角色名为commonUser的用户，以便绑定用户表）
	@Override
	public List<RolesModel> getRole(RolesModel rolesModel) {

		return userDaoImpl.getRole(rolesModel);
	}

	// 根据登录的用户查询该用户的交易信息（分页查询）
	@Override
	public List<TransactionModel> findAllByPage(int pageNo, int pageSize, Long id) {
		return userDaoImpl.findAllByPage(pageNo, pageSize, id);
	}

	// 获取总条数（分页查询）
	@Override
	public int TransactionCount(Long id) {
		return userDaoImpl.TransactionCount(id);
	}


	public UserModel getUser(UserModel user) {
		return userDaoImpl.getUser(user);
	}

	@Override
	public List<UserModel> getUsers() {
		return userDaoImpl.getUsers();
	}

	@Override
	public void updateUsers(UserModel user) {
		userDaoImpl.updateUsers(user);
	}

	@Override
	public List<UserModel> dimGetUsers(String name) {
		return userDaoImpl.dimGetUsers(name);
	}

	@Override
	public void addUsers(UserModel user) {
		userDaoImpl.addUsers(user);
	}

	@Override
	public void deleteUser(UserModel user) {
		userDaoImpl.deleteUser(user);
	}
}
