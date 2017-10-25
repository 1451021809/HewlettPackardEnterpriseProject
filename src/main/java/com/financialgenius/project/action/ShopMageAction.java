package com.financialgenius.project.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.financialgenius.project.model.FundModel;
import com.financialgenius.project.model.OrderModel;
import com.financialgenius.project.model.PersonNumber;
import com.financialgenius.project.service.impl.ShopmageServiceImpl;

@Component("shopmageAction")
public class ShopMageAction {
	@Autowired
	private ShopmageServiceImpl impl;
	
	private List<FundModel> list;
	
	private List<OrderModel> listOrder;
	
	private List<PersonNumber> personNumbers;

	private FundModel fundModel;
	
	private String fundName;
	
	/**
	 * 查询基金表
	 * @return	list
	 */
	public String queryFund(){
	list = impl.getFund();
	return "list";
	}
	
	public String queryOrder(){
		personNumbers=new ArrayList<PersonNumber>();
		Set<FundModel> fundModels=new HashSet<FundModel>();
		listOrder = impl.getOrder();
		for (OrderModel orderModel : listOrder) {
			fundModels.add(orderModel.getFundModel());
		}
		for (FundModel fundModel : fundModels) {
			PersonNumber personNumber=new PersonNumber();
			personNumber.setId(fundModel.getId());
			int number=0;
			for (OrderModel orderModel : listOrder) {
				if (fundModel.getId()==orderModel.getFundModel().getId()) {
					number++;
				}
			}
			personNumber.setNumber(number);
			System.out.println(personNumber.toString());
			personNumbers.add(personNumber);
		}
		return "listOrder";
	}
	public String queryMoney(){
		personNumbers=new ArrayList<PersonNumber>();
		Set<FundModel> fundModels=new HashSet<FundModel>();
		listOrder = impl.getOrder();
		for (OrderModel orderModel : listOrder) {
			fundModels.add(orderModel.getFundModel());
		}
		for (FundModel fundModel : fundModels) {
			PersonNumber personNumber=new PersonNumber();
			personNumber.setId(fundModel.getId());
			
			int number=0;
			for (OrderModel orderModel : listOrder) {
				if (fundModel.getId()==orderModel.getFundModel().getId()) {
					 number += orderModel.getMoney();
				}
			}
			personNumber.setNumber(number);
			System.out.println(personNumber.toString());
			personNumbers.add(personNumber);
		}
		
		return "listMoney";
	}
	
	
	
	public String queryFundName(){
		
		
		list = impl.getFundName(fundName);
		return "list";
		}
	
	
	
	/**
	 * 删除基金
	 * @return delete
	 */
	public String deleteFund() {
		impl.deleteFund(fundModel);
		list = impl.getFund();
		return "delete";
	}
	/**
	 * 修改基金
	 * @return update
	 */
	public String do_updateFund(){
		impl.updateFund(fundModel);
		list = impl.getFund();
		return "list";
	}
	/**
	 * 去修改基金页面
	 * @return update
	 */
	public String to_updateFund(){
		fundModel = impl.getFunds(fundModel);
		return "update";
	}
	/**
	 * 去添加基金页面
	 * @return
	 */
	public String  to_addFund() {
		
		return "save";
	}
	/**
	 * 添加基金
	 * @return
	 */
	public String  do_addFund() {
		impl.addFund(fundModel);
		list = impl.getFund();
		return "list";
	}
	
	public String to_count() {
		
		return "count";
	}
	
	
	
	
	
	
	public List<FundModel> getList() {
		return list;
	}
	
	public List<OrderModel> getListOrder() {
		return listOrder;
	}
	
	public FundModel getFundModel() {
		return fundModel;
	}

	public void setFundModel(FundModel fundModel) {
		this.fundModel = fundModel;
	}

	public List<PersonNumber> getPersonNumbers() {
		return personNumbers;
	}

	public void setPersonNumbers(List<PersonNumber> personNumbers) {
		this.personNumbers = personNumbers;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	
	
}
