package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.MannuLearnerDTO;
import com.nskfdc.scgj.service.MannuLearnerService;

@RestController
public class MannuLearnerController {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(MannuLearnerController.class);
	@Autowired
	private MannuLearnerService mannuLearnerService;
	
	@RequestMapping("/MannuLearnersDetail")
	public Collection<MannuLearnerDTO> getLearnersData(){
		
		LOGGER.debug("Request received from Front End");
		LOGGER.debug("In Mannu Learner Controller to get Learners Detail");
		
		try {
			LOGGER.debug("In try block to get training partner details");
			return mannuLearnerService.getLearnersData();
		} catch (Exception e) {
		
			LOGGER.debug("An error occurred while getting the data"+ e);
			return null;
		}
	}
}
