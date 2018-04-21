package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.GenerateCertificateService;

@RestController
public class GenerateCertificateController {

	private static final Logger LOGGER= LoggerFactory.getLogger(GenerateCertificateController.class);
	
	@Autowired
	private GenerateCertificateService generateCertificateService;
	
	
	
	
	@RequestMapping("/getGeneratedCertificateHistory")
	public void getGeneratedCertificateHistory() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
	
			generateCertificateService.getGeneratedCertificateHistory();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	
	
}
