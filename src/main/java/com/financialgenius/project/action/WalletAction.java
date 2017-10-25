package com.financialgenius.project.action;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.BankCardModel;
import com.financialgenius.project.model.ProfitModel;
import com.financialgenius.project.model.UserModel;
import com.financialgenius.project.model.WalletModel;
import com.financialgenius.project.service.impl.MyWalletServiceImpl;

/**
 * 我的钱包
 * 
 * @author Huangyu
 *
 */
@Component("WalletAction")
public class WalletAction {

	@Autowired
	private MyWalletServiceImpl walletServiceImpl;

	private List<WalletModel> walletList;
	private List<ProfitModel> profitList;
	private Set<BankCardModel> bankCardList;
	private UserModel user;
	private BankCardModel bankCard;
	private WalletModel wallet;
	private ProfitModel Profit;
	// 用户登录信息
	private UserModel isLogin;

	// 账户余额
	private Double recharge;
	private WalletModel model;
	// 昨日收益
	private Double profitMoney;

	public void init() {
		isLogin = (UserModel) ServletActionContext.getRequest().getSession().getAttribute("isLogin");
		;
	}

	public String Wallet() {
		init();
		if (isLogin == null) {
			System.out.println("用户未登录");
			return "noLogin";
		} else {
			System.out.println("用户ID=" + isLogin.getId());
			System.out.println("用户已登录");
			DecimalFormat format = new DecimalFormat("#.00");
			// 获取账户总金额和累计收益
			walletList = walletServiceImpl.wallet(wallet, isLogin);
			for (WalletModel walletModel : walletList) {
				walletModel.setProportion(Double.valueOf(format.format(walletModel.getProportion())));
			}
			// 获取昨日收益
			profitMoney = walletServiceImpl.profit(isLogin);
			// 查询账户绑定银行卡
			bankCardList = walletServiceImpl.bankCard(isLogin);

		}
		return "wallet";
	}

	public String deleteBankCard() {
		init();
		walletServiceImpl.deleteBankCard(bankCard);
		Wallet();
		return "deleteSuccess";
	}

	/**
	 * 跳转
	 * 
	 * @return
	 */

	public String addBankCard01() {
		return "add";
	}

	public String addBankCard() {
		init();
		boolean isTrue = walletServiceImpl.addBankCard(bankCard, isLogin);
		if (isTrue) {
			bankCardList = walletServiceImpl.bankCard(isLogin);
		}
		return "addSuccess";
	}

	/**
	 * 充值
	 * 
	 * @return
	 */
	public String Recharge() {
		init();
		for (WalletModel walletModel : walletList) {
			recharge = walletModel.getProportion();
			wallet.setTotalProfit(walletModel.getTotalProfit());
			wallet.setId(walletModel.getId());
		}
		walletServiceImpl.transactions(wallet, isLogin);
		wallet.setProportion(recharge + wallet.getProportion());
		wallet.setUserId(isLogin.getId());
		boolean isTrue = walletServiceImpl.Recharge(wallet, isLogin);

		if (isTrue) {
			walletList = walletServiceImpl.wallet(wallet, isLogin);
		}
		return "Success";
	}

	/**
	 * 提现
	 * 
	 * @return
	 */
	public String Withdrawals() {
		init();
		for (WalletModel walletModel : walletList) {
			recharge = walletModel.getProportion();
			wallet.setTotalProfit(walletModel.getTotalProfit());
			wallet.setId(walletModel.getId());
		}
		walletServiceImpl.transactions1(wallet, isLogin);
		wallet.setProportion(recharge - wallet.getProportion());
		wallet.setUserId(isLogin.getId());
		boolean isTrue = walletServiceImpl.Recharge(wallet, isLogin);
		if (isTrue) {
			walletList = walletServiceImpl.wallet(wallet, isLogin);
		}
		return "Success";
	}

	public Set<BankCardModel> getBankCardList() {
		return bankCardList;
	}

	public BankCardModel getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCardModel bankCard) {
		this.bankCard = bankCard;
	}

	public void setBankCardList(Set<BankCardModel> bankCardList) {
		this.bankCardList = bankCardList;
	}

	public Double getProfitMoney() {
		return profitMoney;
	}

	public void setProfitMoney(Double profitMoney) {
		this.profitMoney = profitMoney;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public List<WalletModel> getWalletList() {
		return walletList;
	}

	public void setWalletList(List<WalletModel> walletList) {
		this.walletList = walletList;
	}

	public WalletModel getWallet() {
		return wallet;
	}

	public List<ProfitModel> getProfitList() {
		return profitList;
	}

	public void setProfitList(List<ProfitModel> profitList) {
		this.profitList = profitList;
	}

	public ProfitModel getProfit() {
		return Profit;
	}

	public void setProfit(ProfitModel profit) {
		Profit = profit;
	}

	public void setWallet(WalletModel wallet) {
		this.wallet = wallet;
	}

	public UserModel getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(UserModel isLogin) {
		this.isLogin = isLogin;
	}
}
