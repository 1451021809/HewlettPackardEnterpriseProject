package com.financialgenius.project.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.Page;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;

/**
 * 登录和注册
 * 
 * @author Huangyu
 *
 */
@Component("LoginAndRegisterAction")
public class LoginAndRegisterAction {
	@Autowired
	private UserServiceImpl impl;
	private int register_false;

	private UserModel user;
	private RolesModel rolesModel;
	private ProfitModel profitModel;
	private FundModel fundModel;
	private TransactionModel transactionModel;

	private List<UserModel> list;
	private List<FundModel> fundModels;
	private List<ProfitModel> profitModels;
	private List<TransactionModel> transactionModels;
	Page page = new Page();
	private UserModel isLogin;

	// 登录
	public String Login() {
		isLogin = impl.isLogin(user);
		if (isLogin == null) {
			return "noLogin";
		} else {
			// 保存用户登录信息
			ServletActionContext.getRequest().getSession().setAttribute("isLogin", isLogin);
			return "login";
		}

	}

	// 注册（跳转）
	public String register1() {
		return "register";
	}

	// (注册)查询用户表判断输入账户是否存在
	public String queryUser() {
		// 判断输入账户和用户表中的账户是否一致
		if (impl.queryUser(user)) {
			// 若一致则：
			// 标记：为了让注册失败后的页面弹出注册失败
			register_false = 1;
			// 注册失败返回注册界面
			return "register";
		} else {
			// 否则添加新用户保存到数据库中
			user.setStatus(1);
			user.setCreateDate(new Date());
			// 绑定角色表中的普通用户角色
			user.getRoles().addAll(impl.getRole(rolesModel));
			impl.register(user);
			// 注册成功到登录页面
			return "login";
		}
	}

	// 查询基金表，收益表 交易表
	public String getTable() {
		fundModels = impl.getFundModel(fundModel);
		profitModels = impl.getProfitModel(profitModel);
		transactionModels = impl.getTransactionModel(transactionModel);
		return "bill";
	}
/*
	// 获取交易表中的信息（消息推送）
	public String getTransactionModel() {
		transactionModels = impl.getTransactionModel(transactionModel);

		return "message";

	}*/

	// 交易表分页查询（消息推送）
	public String find() {
		
		int Count = impl.TransactionCount();
		// 获得当前页码
		int pageNo = page.getPageNo();
		System.out.println("sjdkahfa");
		System.out.println(pageNo);
		page.setTotalCount(Count);
		// 总页数
		int totalpage = (int) page.getTotalpage();
		transactionModels = impl.findAllByPage(pageNo, page.getPagesize());
		ServletActionContext.getRequest().getSession().setAttribute("count", Count);
		ServletActionContext.getRequest().getSession().setAttribute("pageno", pageNo);
		ServletActionContext.getRequest().getSession().setAttribute("totalpage", totalpage);
		return "message";
	}

	public int getRegister_false() {
		return register_false;
	}

	public void setRegister_false(int register_false) {
		this.register_false = register_false;
	}

	public List<UserModel> getList() {
		return list;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public RolesModel getRolesModel() {
		return rolesModel;
	}

	public void setRolesModel(RolesModel rolesModel) {
		this.rolesModel = rolesModel;
	}

	public ProfitModel getProfitModel() {
		return profitModel;
	}

	public void setProfitModel(ProfitModel profitModel) {
		this.profitModel = profitModel;
	}

	public FundModel getFundModel() {
		return fundModel;
	}

	public void setFundModel(FundModel fundModel) {
		this.fundModel = fundModel;
	}

	public List<FundModel> getFundModels() {
		return fundModels;
	}

	public List<ProfitModel> getProfitModels() {
		return profitModels;
	}

	public List<TransactionModel> getTransactionModels() {
		return transactionModels;
	}

	public void setTransactionModel(TransactionModel transactionModel) {
		this.transactionModel = transactionModel;
	}

	public TransactionModel getTransactionModel1() {
		return transactionModel;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public UserModel getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(UserModel isLogin) {
		this.isLogin = isLogin;
	}
}
