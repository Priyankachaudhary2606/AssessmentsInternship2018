package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.ManageAssessmentService;

@RestController
public class ManageAssessmentController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ManageAssessmentController.class);
	
	@Autowired
	private ManageAssessmentService manageAssessmentService;
	
/*---------------Method for Non-Assessed batches--------------------*/
	
	@RequestMapping("/getNonAssessedBatches")
	public void getNonAssessedBatches() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			manageAssessmentService.getNonAssessedBatches();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	
	
/*---------------Method for Assessed batches--------------------*/
	
	@RequestMapping("/getAssessedBatches")
	public void getAssessedBatches() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			manageAssessmentService.getAssessedBatches();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	

/*---------------Method for Batch info on the basis of searched Batch id--------------------*/
	
	@RequestMapping("/getBatchforsearchedBatchId")
	public void getBatchforsearchedBatchId() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			manageAssessmentService.getBatchforsearchedBatchId();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}

	

}
