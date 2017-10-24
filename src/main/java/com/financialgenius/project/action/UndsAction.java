package com.financialgenius.project.action;

import java.util.List;

import javax.persistence.criteria.Order;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UndsServiceImpl;

@Component("undsAction")
public class UndsAction {

	@Autowired
	private UndsServiceImpl impl;

	private List<FundModel> list;
	private List<OrderModel> orderlist;
	private List<UserModel> userlist;
	private FundModel user;
	private OrderModel order;
	private UserModel userModel;
	private UserModel isLogin;

	
	public void init() {
		isLogin = (UserModel) ServletActionContext.getRequest().getSession().getAttribute("isLogin");
		;
	}
	//查询我的基金
	public String getMyFund(){
		init();
		if (isLogin == null){
			System.out.println("用户未登录");
			return "noLogin";
		}
		else{
			//查询我的基金
			userlist= impl.getMyFund(isLogin);
			//查询所有基金
			list = impl.getUnds();
		}
		return "getMyFund";
	}

	public List<FundModel> getList() {
		return list;
	}

	public void setList(List<FundModel> list) {
		this.list = list;
	}

	public OrderModel getOrder() {
		return order;
	}

	public FundModel getUser() {
		return user;
	}

	public void setUser(FundModel user) {
		this.user = user;
	}

	public List<OrderModel> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<OrderModel> orderlist) {
		this.orderlist = orderlist;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public UserModel getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(UserModel isLogin) {
		this.isLogin = isLogin;
	}

	public void setOrder(OrderModel order) {
		this.order = order;
	}
	public List<UserModel> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<UserModel> userlist) {
		this.userlist = userlist;
	}
}
