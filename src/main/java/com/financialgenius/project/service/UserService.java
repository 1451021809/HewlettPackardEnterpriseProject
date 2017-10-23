package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;

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

	// 查询基金表
	List<FundModel> getFundModel(FundModel fundModel);

	// 查询收益表
	List<ProfitModel> getProfitModel(ProfitModel profitModel);

	// 查询交易表
	List<TransactionModel> getTransactionModel(TransactionModel transactionModel);

	// 分页查询
	List<TransactionModel> findAllByPage(int pageNo, int pageSize);

	// 获取总数
	int TransactionCount();
}
