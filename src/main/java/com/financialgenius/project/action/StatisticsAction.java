package com.financialgenius.project.action;

import org.springframework.stereotype.Component;

@Component("statisticsAction")
public class StatisticsAction {
	public String findStatistics(){
		return "findStatistics";
	}
}
