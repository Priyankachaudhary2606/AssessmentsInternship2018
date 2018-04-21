package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.DashboardService;

@RestController
public class DashboardController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(DashboardController.class);

	
	@Autowired
	private DashboardService dashboardService;
	
	
	/*---------------- Controller for Panels on Dashboard --------------------------*/
	
	@RequestMapping("/getOngoingTrainings")
	public int getOngoingTrainings() {
		
		//Write LOGGER here
		
		try {
			
			//Write LOGGER here
			return dashboardService.getOngoingTrainings();
			
		}catch(Exception e) {
			
			LOGGER.debug("An Error occurred while getting the number of ongoing trainings ");			
			return -1;
		}
	}
	
	
	@RequestMapping("/getCandidatesTrained")
	public int getCandidatesTrained() {
		
		//Write LOGGER here
		
		try {
			
			//Write LOGGER here
			return dashboardService.getCandidatesTrained();
			
		}catch(Exception e) {
			
			LOGGER.debug("An Error occurred while getting the number of candidates trained ");			
			return -1;
		}
	}
	
	@RequestMapping("/getNumberOftrainingPartner")
	public int getNumberOftrainingPartner() {
		
		//Write LOGGER here
		
		try {
			
			//Write LOGGER here
			return dashboardService.getNumberOftrainingPartner();
			
		}catch(Exception e) {
			
			LOGGER.debug("An Error occurred while getting the number of training partner ");			
			return -1;
		}
	}
	
	
	@RequestMapping("/getUpcomingAssessment")
	public int getUpcomingAssessment() {
		
		//Write LOGGER here
		
		try {
			
			//Write LOGGER here
			return dashboardService.getUpcomingAssessment();
			
		}catch(Exception e) {
			
			LOGGER.debug("An Error occurred while getting the number of upcoming assessments ");			
			return -1;
		}
	}
	
	
	/*---------------- Controller for Charts on Dashboard --------------------------*/
	
	
	public void getTop5StatesWithMaxTrainingCenters() {
		
		//write LOGGER here
		
		try {
			
			//write LOGGER here
			//write your code here and change return type
			
			dashboardService.getTop5StatesWithMaxTrainingCenters();
			
		} catch (Exception e) {
			
			// write LOGGER here
			
			//return default value, it can be null
			
		}
		
	}
	
	public void getCandidatesTrainedinLastSixMonths() {
		
		//write LOGGER here
		
		try {
			
			//write LOGGER here
			//write your code here and change return type
			
			dashboardService.getCandidatesTrainedinLastSixMonths();
			
		} catch (Exception e) {
			
			// write LOGGER here
			
			//return default value, it can be null
			
		}
		
	}
	
	
	public void getTrainingPartnerInEachState() {
		
		//write LOGGER here
		
		try {
			
			//write LOGGER here
			//write your code here and change return type
			
			dashboardService.getTrainingPartnerInEachState();
			
		} catch (Exception e) {
			
			// write LOGGER here
			
			//return default value, it can be null
			
		}
		
	}

}
