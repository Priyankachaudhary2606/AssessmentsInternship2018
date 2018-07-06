package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.AmanLearnerDto;
import com.nskfdc.scgj.service.AmanLearnerService;

@RestController
public class AmanLearnerController {
	private static final Logger LOGGER= LoggerFactory.getLogger(AmanLearnerController.class);
@Autowired
private AmanLearnerService amanService;
@RequestMapping("/getLearnerDetails")
public Collection<AmanLearnerDto> getdetails(){
	LOGGER.debug("Request received from frontend");
	LOGGER.debug("In Learner Controller");

	
	try {
		LOGGER.debug("In try block to get learner details");
		LOGGER.debug("Sending request to service");
		return amanService.getShowLearnerDetails();
		
	}catch(Exception e) {
		return null;
		
	}
}
}
