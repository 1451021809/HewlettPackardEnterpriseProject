package com.financialgenius.project.action;

import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.Page;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.RolesModel;
import com.financialgenius.project.model.TransactionModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.service.impl.UserServiceImpl;

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

	private List<UserModel> list;
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
			return "noLogin";
		}
	}

	// 根据登录的用户查询该用户的交易信息（消息推送）
	public String getMessage() {
		// 获取当前用户登录的Id
		Long id = isLogin.getId();
		// 获取总条数
		Long Count = (long) impl.TransactionCount(id);
		// 获得当前页码
		int pageNo = page.getPageNo();
		// 获取最多显示多少条
		int pagesize = page.getPagesize();
		page.setTotalCount(Count);
		// 获取总页数
		int totalpage = (int) page.getTotalpage();
		// 调用service层的分页查询方法
		transactionModels = impl.findAllByPage(pageNo, pagesize, id);
		ServletActionContext.getRequest().getSession().setAttribute("count", Count);
		ServletActionContext.getRequest().getSession().setAttribute("pageno", pageNo);
		ServletActionContext.getRequest().getSession().setAttribute("totalpage", totalpage);
		return "message";
	}

	public String getBill() {
		// 获取当前用户登录的Id
		Long id = isLogin.getId();
		// 获取总条数
		Long Count = (long) impl.TransactionCount(id);
		// 获得当前页码
		int pageNo = page.getPageNo();
		// 获取最多显示多少条
		int pagesize = page.getPagesize();
		page.setTotalCount(Count);
		// 获取总页数
		int totalpage = (int) page.getTotalpage();
		// 调用service层的分页查询方法
		transactionModels = impl.findAllByPage(pageNo, pagesize, id);
		ServletActionContext.getRequest().getSession().setAttribute("count", Count);
		ServletActionContext.getRequest().getSession().setAttribute("pageno", pageNo);
		ServletActionContext.getRequest().getSession().setAttribute("totalpage", totalpage);
		return "bill";
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

	public List<TransactionModel> getTransactionModels() {
		return transactionModels;
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
