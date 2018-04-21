package com.nskfdc.scgj.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.DashboardConfig;

@Repository
public class CandidatesTrainedInLastSixMonthsChartDao extends AbstractTransactionalDao{
	
private static final Logger LOGGER= LoggerFactory.getLogger(CandidatesTrainedInLastSixMonthsChartDao.class);
	
	@Autowired
	private DashboardConfig dashboardConfig;
	
	public void getCandidatesTrainedinLastSixMonths() {
		
		//write Logger here
		
		try {
			
			//write Logger here 
			//write code here and change the return type
		}catch(Exception e) {
			
			// write Logger
			// return null;
		}
		
		
	}

	
	//write Rowmapper class here
}
