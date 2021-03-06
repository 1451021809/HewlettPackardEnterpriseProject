package com.financialgenius.project.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.MyWalletDaoImpl;
import com.financialgenius.project.model.BankCardModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.MyWalletService;

@Service
public class MyWalletServiceImpl implements MyWalletService {

	@Autowired
	private MyWalletDaoImpl myWalletDaoImpl;
	private UserModel user;
	// 昨日收益
	private Double profitMoney;

	// 查询金额表
	@Override
	public List<WalletModel> wallet(WalletModel wallet, UserModel userModel) {
		return myWalletDaoImpl.walletDao(wallet, userModel);
	}

	// 查询昨日收益
	@Override
	public Double profit(UserModel userModel) {
		// 获取账户收益
		user = myWalletDaoImpl.profitDao(userModel);
		Set<ProfitModel> Profit01 = user.getProfitModels();
		for (ProfitModel profitModel : Profit01) {
			profitMoney = profitModel.getProfit();
		}
		return profitMoney;
	}

	// 查询银行卡
	@SuppressWarnings("unchecked")
	@Override
	public Set<BankCardModel> bankCard(UserModel userModel) {
		user = myWalletDaoImpl.profitDao(userModel);
		return user.getBankCardModels();
	}

	// 删除银行卡
	@Override
	public boolean deleteBankCard(BankCardModel bankCardModel) {
		myWalletDaoImpl.deleteBankCard(bankCardModel);
		return true;
	}

	// 添加银行卡
	@Override
	public boolean addBankCard(BankCardModel bankCardModel, UserModel userModel) {
		myWalletDaoImpl.addBankCard(bankCardModel, userModel);
		return true;
	}

	// 充值和提现
	@Override
	public boolean Recharge(WalletModel wallet1, UserModel userModel) {
		
		myWalletDaoImpl.Recharge(wallet1, userModel);
		return true;
	}

	@Override
	public boolean transactions(WalletModel wallet, UserModel userModel) {
		userModel.getTransactionModels().add(new TransactionModel("充值", wallet.getProportion(), new Date()));
		myWalletDaoImpl.transactions(userModel);
		return false;
	}

	@Override
	public boolean transactions1(WalletModel wallet, UserModel userModel) {
		userModel.getTransactionModels().add(new TransactionModel("提现", wallet.getProportion(), new Date()));
		System.out.println(userModel.getId());
		return myWalletDaoImpl.transactions(userModel);
	}

}
