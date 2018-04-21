package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.BatchForManageAssessmentDao;
import com.nskfdc.scgj.dao.ImportHistoryDao;

@Service
public class ManageAssessmentService {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ManageAssessmentService.class);
	
	@Autowired
	private BatchForManageAssessmentDao batchForManageAssessmentDao;
	
/*---------------Method for Non-Assessed batches--------------------*/
	
	public void getNonAssessedBatches() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			batchForManageAssessmentDao.getNonAssessedBatches();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	

/*---------------Method for Assessed batches--------------------*/
	
	
	public void getAssessedBatches() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			batchForManageAssessmentDao.getAssessedBatches();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	
	
/*---------------Method for Batch info on the basis of searched Batch id--------------------*/
	
	
	public void getBatchforsearchedBatchId() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			batchForManageAssessmentDao.getBatchforsearchedBatchId();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}

}
