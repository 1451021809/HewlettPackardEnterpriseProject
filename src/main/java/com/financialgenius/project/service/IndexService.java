package com.financialgenius.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.financialgenius.project.model.FundModel;

@Service
public interface IndexService {
	/**
	 * 主页
	 * 
	 * @param user
	 * @return
	 */
	List<FundModel> fundModel();
}
