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

	Double profit(UserModel userModel);

	Set<BankCardModel> bankCard(UserModel userModel);

	boolean deleteBankCard(BankCardModel bankCardModel);

	boolean addBankCard(BankCardModel bankCardModel, UserModel userModel);

	boolean Recharge(WalletModel wallet, UserModel userModel);

}
