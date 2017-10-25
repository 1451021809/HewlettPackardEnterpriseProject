package com.financialgenius.project.action;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.impl.BuyServiceImpl;
import com.financialgenius.project.service.impl.MyWalletServiceImpl;

@Component("BuyAction")
public class BuyAction {

	@Autowired
	private BuyServiceImpl buyServiceImpl;
	@Autowired
	private MyWalletServiceImpl walletServiceImpl;

	private FundModel fundModel;

	private List<WalletModel> walletList;

	private List<FundModel> fundlists;
	// 用户登录信息
	private UserModel isLogin;

	private WalletModel wallet;
	
	private WalletModel model;
	// 用户收益
	private String profit;
	// 获取用户购买金额
	private int money;

	// 获取余额情况
	private String noMoney = "";

	public void init() {
		isLogin = (UserModel) ServletActionContext.getRequest().getSession().getAttribute("isLogin");
		;
	}

	public String Buy() {
		init();
		if (isLogin == null) {
			System.out.println("用户未登录");
			return "noLogin";
		} else {
			fundlists = buyServiceImpl.fundModel(fundModel);
			// 获取账户总金额和累计收益
			walletList = walletServiceImpl.wallet(wallet, isLogin);
		}
		return "success";
	}

	/**
	 * 获取预计收益
	 * 
	 * @return
	 */
	public String buyProfit() {
		DecimalFormat format = new DecimalFormat("#.00");
		String name = ServletActionContext.getRequest().getParameter("money");
		money = Integer.valueOf(name);
		for (FundModel fundModel : fundlists) {
			profit = format.format(((fundModel.getProfit() * money) / 10));
		}
		for (WalletModel walletModel : walletList) {
			if (walletModel.getProportion() < money) {
				noMoney = "余额不足";
			} else {
				noMoney = "";
			}
		}
		return "success";
	}

	/**
	 * 支付
	 * 
	 * @return
	 */
	public String pay() {
		init();
		for (WalletModel walletModel : walletList) {
			model = new WalletModel();
			model.setProportion(walletModel.getProportion() - money);
			model.setId(walletModel.getId());
			model.setTotalProfit(walletModel.getTotalProfit());
			model.setUserId(isLogin.getId());
			walletServiceImpl.Recharge(model, isLogin);
		}
		for (FundModel fundModel : fundlists) {
			buyServiceImpl.buy(money, isLogin, fundModel.getName());
		}
		return "success";

	}

	public String getNoMoney() {
		return noMoney;
	}

	public void setNoMoney(String noMoney) {
		this.noMoney = noMoney;
	}

	public FundModel getFundModel() {
		return fundModel;
	}

	public void setFundModel(FundModel fundModel) {
		this.fundModel = fundModel;
	}

	public List<FundModel> getFundlists() {
		return fundlists;
	}

	public void setFundlists(List<FundModel> fundlists) {
		this.fundlists = fundlists;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

}
