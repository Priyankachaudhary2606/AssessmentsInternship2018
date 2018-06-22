package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.AssignDto;
import com.nskfdc.scgj.service.AssignService;

@RestController
public class AssignController {
	private static final Logger LOGGER= LoggerFactory.getLogger(AssignController.class);

	@Autowired
	private AssignService assignService;
	
	@RequestMapping("/getAssignedCustomerDetail")
	public Collection<AssignDto> getCustomerDetail(){
		
		LOGGER.debug("Request received from Front End");
		LOGGER.debug("In Assign Controller");
     try {
			
			LOGGER.debug("In try block to get customer details");
			LOGGER.debug("Sending request to service"); 
		   
			return assignService.getCustomerDetail();
     
     }catch(Exception e) {
    	   LOGGER.debug("An error occurred while getting the customer details" + e);
			return null;
			
		}
		
			
		
	}
	

}
