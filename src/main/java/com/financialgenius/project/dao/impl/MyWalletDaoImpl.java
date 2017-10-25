package com.financialgenius.project.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.financialgenius.project.common.BaseDao;
import com.financialgenius.project.dao.MyWalletDao;
import com.financialgenius.project.model.BankCardModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;

@Repository
public class MyWalletDaoImpl implements MyWalletDao {

	@Autowired
	private BaseDao baseDao;

	@Override
	public List<WalletModel> walletDao(WalletModel wallet, UserModel userModel) {
		String sql = "from WalletModel where userId=?";
		List<WalletModel> walletModel = (List<WalletModel>) baseDao.getHibernateTemplate().find(sql, userModel.getId());
		return walletModel;
	}

	@Override
	public UserModel profitDao(UserModel userModel) {
		UserModel userProfit = baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
		return userProfit;
	}

	@Override
	public boolean deleteBankCard(BankCardModel bankCardModel) {
		baseDao.getHibernateTemplate().delete(bankCardModel);
		return true;
	}

	@Override
	public boolean addBankCard(BankCardModel bankCardModel, UserModel userModel) {
		userModel.getBankCardModels().add(new BankCardModel(bankCardModel.getNumber()));
		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
		return true;
	}

	@Override
	public boolean Recharge(WalletModel wallet1, UserModel userModel) {
		baseDao.getHibernateTemplate().saveOrUpdate(wallet1);
		return true;
	}

	@Override
	public boolean transactions(UserModel userModel) {
		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
		return true;
	}

	@Override
	public boolean transactions1(UserModel userModel) {
		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
		return true;
	}

}
