package com.financialgenius.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.BankCardModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;

@Repository
public interface MyWalletDao {
	/**
	 * 我的钱包
	 * 
	 * @param wallet
	 * @return
	 */
	List<WalletModel> walletDao(WalletModel wallet, UserModel userModel);

	/**
	 * 查询该用户的银行卡信息，余额信息，收益信息
	 * 
	 * @param userModel
	 * @return
	 */
	UserModel profitDao(UserModel userModel);

	/**
	 * 删除银行卡
	 * 
	 * @param bankCardModel
	 * @return
	 */
	boolean deleteBankCard(BankCardModel bankCardModel);

	/**
	 * 添加银行卡
	 * 
	 * @param bankCardModel
	 * @return
	 */
	boolean addBankCard(BankCardModel bankCardModel, UserModel userModel);

	/**
	 * 充值
	 * 
	 * @param wallet
	 * @param userModel
	 * @return
	 */
	boolean Recharge(WalletModel wallet, UserModel userModel);

	/**
	 * 充值记录
	 * @param transactionModel
	 * @return
	 */
	boolean transactions(UserModel userModel);
	
	/**
	 * 提现记录
	 * @param transactionModel
	 * @return
	 */
	boolean transactions1(UserModel userModel);

}