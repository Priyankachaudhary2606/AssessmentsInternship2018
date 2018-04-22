package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.PocDto;
import com.nskfdc.scgj.service.POCService;

@RestController
public class POCController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(POCController.class);
	
	@Autowired
	private POCService pocService;
	
	@RequestMapping("/getTrainingPartnerDetailForPOC")
	public Collection<PocDto> getTrainingPartnerDetailForPOC(){
		
		LOGGER.debug("Request received from frontend");
		LOGGER.debug("In POC Controller");
		
		try {
			
			LOGGER.debug("In try block to get training partner details for POC");
			LOGGER.debug("Sending request to service");
			return pocService.getPOCTrainingPartnerDetail();
			
		}catch(Exception e) {
			
			LOGGER.debug("An error occurred while getting the training partner details for POC" + e);
			return null;
			
		}
	}

}
