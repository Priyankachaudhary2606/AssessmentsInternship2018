package com.nskfdc.scgj.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.DashboardConfig;

@Repository
public class DashboardPanelDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(DashboardPanelDao.class);
	
	@Autowired
	private DashboardConfig dashboardConfig;
	
	public int ongoingTrainingsPanel() {
		
		//write Logger
		
		try {
			
			//write your code here
			
			return 1;
			
		}catch(Exception e) {
			LOGGER.debug("An exception occured while getting the ongoing training info"+ e);
			return 0;
		}
	}
	
	
	
	public int candidatesTrainedPanel() {
		
		//write Logger
		
		try {
			
			//write your code here
			
			return 1;
			
		}catch(Exception e) {
			LOGGER.debug("An exception occured while getting the trained candidates info"+ e);
			return 0;
		}
	}
	
	
	
	public int trainingPartnerPanel() {
		
		//write Logger
		
		try {
			
			//write your code here
			
			return 1;
			
		}catch(Exception e) {
			LOGGER.debug("An exception occured while getting the number of training patners"+ e);
			return 0;
		}
	}
	
	
	
	public int upcomingAssessmentPanel() {
		
		//write Logger
		
		try {
			
			//write your code here
			
			return 1;
			
		}catch(Exception e) {
			LOGGER.debug("An exception occured while getting the number of upcoming assessments"+ e);
			return 0;
		}
	}
	
	
	

}
