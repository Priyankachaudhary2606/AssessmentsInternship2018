package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.MannuBankDAO;
import com.nskfdc.scgj.dto.MannuBankDTO;

@Service
public class MannuBankService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MannuBankService.class);
	@Autowired
	private MannuBankDAO mannuBankDAO;
	public Collection<MannuBankDTO> getBankCustomerDetails(){
	
		LOGGER.debug("Recieved request from Controller ");
    	LOGGER.debug("In Service to get customer details. ");
    	try {
    		
    		LOGGER.debug("In try block");
    		return mannuBankDAO.getBankCustomerDetails();
    		
    	}catch(Exception e)
    	{
    		LOGGER.debug("In catch block");
    		System.out.println(e);
    		return null;
    	}
    	
	}

}
