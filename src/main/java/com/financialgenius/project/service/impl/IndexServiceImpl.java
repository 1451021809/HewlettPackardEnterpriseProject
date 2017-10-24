package com.financialgenius.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialgenius.project.dao.impl.IndexDaoImpl;
import com.financialgenius.project.dao.impl.UserDaoImpl;
import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexDaoImpl indexDaoImpl;

	@Override
	public List<FundModel> fundModel() {
		return indexDaoImpl.fundDao();
	}

}
