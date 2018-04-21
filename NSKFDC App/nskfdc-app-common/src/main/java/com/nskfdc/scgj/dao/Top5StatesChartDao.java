package com.nskfdc.scgj.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.DashboardConfig;

@Repository
public class Top5StatesChartDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(Top5StatesChartDao.class);
	
	@Autowired
	private DashboardConfig dashboardConfig;
	
	public void getTop5StatesWithMaxTrainingCenters() {
		
		LOGGER.debug("Received Request from Service");
		LOGGER.debug("In Top5StatesChartDao to get the details of Top 5 states with maximum training centers");
		
		try {
			
			//Write Logger here
			
			//write your code here and change the return type
			
		}catch(Exception e) {
			
			//write Logger here
			
			//return null;
		}
		
	}
	
	//write Rowmapper class here

}
