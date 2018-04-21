package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.CandidatesTrainedInLastSixMonthsChartDao;
import com.nskfdc.scgj.dao.DashboardPanelDao;
import com.nskfdc.scgj.dao.Top5StatesChartDao;
import com.nskfdc.scgj.dao.TrainingPartnerInEachStateChartDao;

@Service
public class DashboardService {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(DashboardService.class);
	
	@Autowired
	private DashboardPanelDao dashboardPanelDao;
	
	@Autowired
	private Top5StatesChartDao top5StatesChartDao;
	
	@Autowired
	private CandidatesTrainedInLastSixMonthsChartDao candidatesTrainedInLastSixMonthsChartDao;
	
	@Autowired
	private TrainingPartnerInEachStateChartDao trainingPartnerInEachStateChartDao;
	

	
/*--------------------- Methods for the Panels on Dashboard--------------------------*/	
	
	public int getOngoingTrainings() {
		
		//write LOGGER here
		
				try {
					
					//write LOGGER here
					//write your code here  
					
					dashboardPanelDao.ongoingTrainingsPanel();
					
					//change return value
					return 1;
					
				} catch (Exception e) {
					
					// write LOGGER here
					
					//return default value
					return 0;
					
				}
	}
	
	
	
	public int getCandidatesTrained() {
			
			//write LOGGER here
			
					try {
						
						//write LOGGER here
						//write your code here  
						
						dashboardPanelDao.candidatesTrainedPanel();
						
						//change return value
						return 1;
						
					} catch (Exception e) {
						
						// write LOGGER here
						
						//return default value
						return 0;
						
					}
		}
	
	
	public int getNumberOftrainingPartner() {
		
		//write LOGGER here
		
				try {
					
					//write LOGGER here
					//write your code here  
					
					dashboardPanelDao.trainingPartnerPanel();
					
					//change return value
					return 1;
					
				} catch (Exception e) {
					
					// write LOGGER here
					
					//return default value
					return 0;
					
				}
	}
	
	public int getUpcomingAssessment() {
		
		//write LOGGER here
		
				try {
					
					//write LOGGER here
					//write your code here  
					
					dashboardPanelDao.upcomingAssessmentPanel();
					
					//change return value
					return 1;
					
				} catch (Exception e) {
					
					// write LOGGER here
					
					//return default value
					return 0;
					
				}
	}

	
	
/*--------------------- Methods for the Charts on Dashboard--------------------------*/
	
	
	public void getTop5StatesWithMaxTrainingCenters() {
		
		//write LOGGER here
		
		try {
			
			//write LOGGER here
			//write your code here and change return type
			
			top5StatesChartDao.getTop5StatesWithMaxTrainingCenters();
			
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
				
				candidatesTrainedInLastSixMonthsChartDao.getCandidatesTrainedinLastSixMonths();
				
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
			
			trainingPartnerInEachStateChartDao.getTrainingPartnerInEachState();
			
		} catch (Exception e) {
			
			// write LOGGER here
			
			//return default value, it can be null
			
		}
		
	}
	
}
