package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;

@Service
public interface UserService {
	/**
	 * 用户登录
	 * 
	 * @param user
	 * @return
	 */
	UserModel isLogin(UserModel user);

	// 注册（保存）
	void register(UserModel userModel);

	// 注册（查询用户表判断输入账户是否存在）
	boolean queryUser(UserModel userModel);

	// 注册（查询角色表中角色名为commonUser，以便绑定用户表）
	List<RolesModel> getRole(RolesModel rolesModel);

	// 根据登录的用户查询该用户的交易信息（分页查询）
	List<TransactionModel> findAllByPage(int pageNo, int pageSize, Long id);

	// 获取总条数（分页查询）
	int TransactionCount(Long id);

	List<UserModel> getUsers();

	void updateUsers(UserModel user);

	List<UserModel> dimGetUsers(String name);

	void addUsers(UserModel user);

	void deleteUser(UserModel user);

	// 获取用户角色
	int getRoles(UserModel user);

}
