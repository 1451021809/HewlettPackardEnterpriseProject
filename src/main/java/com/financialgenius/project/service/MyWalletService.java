package com.financialgenius.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.BankCardModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;

@Service
public interface MyWalletService {
	/**
	 * 我的钱包
	 * 
	 * @param wallet
	 * @return
	 */
	List<WalletModel> wallet(WalletModel wallet, UserModel userModel);

	/**
	 * 查询收益
	 * 
	 * @param userModel
	 * @return
	 */
	Double profit(UserModel userModel);

	/**
	 * 查询银行卡
	 * 
	 * @param userModel
	 * @return
	 */
	Set<BankCardModel> bankCard(UserModel userModel);

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
	 * @param userModel
	 * @return
	 */
	boolean addBankCard(BankCardModel bankCardModel, UserModel userModel);

	/**
	 * 充值和提现
	 * 
	 * @param wallet
	 * @param userModel
	 * @return
	 */
	boolean Recharge(WalletModel wallet, UserModel userModel);

	/**
	 * 充值记录
	 * 
	 * @param wallet
	 * @param userModel
	 * @return
	 */
	boolean transactions(WalletModel wallet, UserModel userModel);

	/**
	 * 提现记录
	 * 
	 * @param wallet
	 * @param userModel
	 * @return
	 */
	boolean transactions1(WalletModel wallet, UserModel userModel);

}
