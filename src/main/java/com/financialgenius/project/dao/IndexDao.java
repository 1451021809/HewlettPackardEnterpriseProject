package com.financialgenius.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.financialgenius.project.model.FundModel;

@Repository
public interface IndexDao {
	/**
	 * 用户登录
	 * 
	 * @param wallet
	 * @return
	 */
	List<FundModel> fundDao();
}