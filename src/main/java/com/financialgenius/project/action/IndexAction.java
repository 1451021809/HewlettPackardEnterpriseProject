package com.financialgenius.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.service.impl.IndexServiceImpl;
import com.financialgenius.project.service.impl.UserServiceImpl;

/**
 * 主页
 * 
 * @author Huangyu
 *
 */
@Component("IndexAction")
public class IndexAction {
	@Autowired
	private IndexServiceImpl impl;
	private List<FundModel> fundList;

	public String Index() {
		fundList = impl.fundModel();
		return "success";
	}

	public List<FundModel> getFundList() {
		return fundList;
	}

	public void setFundList(List<FundModel> fundList) {
		this.fundList = fundList;
	}

}
