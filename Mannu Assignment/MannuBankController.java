package com.nskfdc.scgj.controller;

import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nskfdc.scgj.dto.MannuBankDTO;
import com.nskfdc.scgj.service.MannuBankService;

@RestController
public class MannuBankController {
  
	private static final Logger LOGGER = LoggerFactory.getLogger(MannuBankService.class);
	
	@Autowired
	private MannuBankService mannuBankService;
	
	@RequestMapping("/getHDFCcustomer")
	public Collection<MannuBankDTO> getBankCustomerDetails(){
	
		LOGGER.debug("Recieved request from Front End ");
    	LOGGER.debug("In Controller to get customer details. ");
    	try {
    		
    		LOGGER.debug("In try block");
    		return mannuBankService.getBankCustomerDetails();
    		
    	}catch(Exception e)
    	{
    		LOGGER.debug("In catch block");
    		System.out.println(e);
    		return null;
    	}
    	
	}
	
}
