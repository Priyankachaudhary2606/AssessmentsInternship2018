
package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.SubhadraLearnerDto;
import com.nskfdc.scgj.service.SubhadraLearnerService;

@RestController
public class SubhadraLearnerController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(SubhadraLearnerController.class);
	
	@Autowired
	private SubhadraLearnerService subhadraLearnerService;
	
	@RequestMapping("/getSubhadraLearnerDetail")
	public Collection<SubhadraLearnerDto> getLearnerDetail(){
		
		LOGGER.debug("Request received from frontend");
		LOGGER.debug("In Controller");
		
		try {
			
			LOGGER.debug("In try block to get training partner details for POC");
			LOGGER.debug("Sending request to service");
			return subhadraLearnerService.getLearnerDetail();
			
		}catch(Exception e) {
			
			LOGGER.debug("An error occurred while getting the learner details" + e);
			LOGGER.error("THE error is "+ e);
			return null;
			
		}
	}

}