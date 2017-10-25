package com.financialgenius.project.action;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.BuyServiceImpl;

@Component("BuyAction")
public class BuyAction {

	@Autowired
	private BuyServiceImpl buyServiceImpl;

	private FundModel fundModel;

	private List<FundModel> fundlists;
	// 用户登录信息
	private UserModel isLogin;
	// 用户收益
	private String profit;
	// 获取用户购买金额
	private int money;

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
		}
		return "success";
	}

	public String buyProfit() {
		DecimalFormat format = new DecimalFormat("#.00");
		String name = ServletActionContext.getRequest().getParameter("money");
		money = Integer.valueOf(name);
		for (FundModel fundModel : fundlists) {
			profit = format.format(((fundModel.getProfit() * money) / 10));
		}
		return "success";
	}

	public String pay() {
		init();
		if (isLogin == null) {
			System.out.println("用户未登录");
			return "noLogin";
		} else {
			for (FundModel fundModel : fundlists) {
				buyServiceImpl.buy(money, isLogin, fundModel.getName());
			}
		}
		return "success";
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
