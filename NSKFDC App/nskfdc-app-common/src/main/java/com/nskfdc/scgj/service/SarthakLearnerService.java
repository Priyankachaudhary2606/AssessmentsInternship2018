package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nskfdc.scgj.dao.SarthakLearnerDAO;
import com.nskfdc.scgj.dto.SarthakLearnerDTO;

public class SarthakLearnerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SarthakLearnerService.class);
	
	@Autowired
	private SarthakLearnerDAO SarthakLearnerDAO;
	
	public Collection<SarthakLearnerDTO> getSarthakLearnerDetail(){
		
		LOGGER.debug("Request received from Control");
		LOGGER.debug("In SarthakLearner Service, to get  details for Learner");
		
		try {
			LOGGER.debug("In try block to get Learner details");
			return SarthakLearnerDAO.getSarthakLearnerLearnerDetail();
		} catch (Exception e) {
		
			LOGGER.debug("An error occurred while getting the learner details for SarthakLearner"+ e);
			return null;
		}
	}

}
