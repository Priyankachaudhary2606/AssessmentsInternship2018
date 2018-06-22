package com.nskfdc.scgj.service;

import java.util.Collection;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.AssignDao;
import com.nskfdc.scgj.dto.AssignDto;

@Service
public class AssignService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AssignService.class);
		
	@Autowired
	private AssignDao assignDao;
	
	public Collection<AssignDto> getCustomerDetail(){	
		
		LOGGER.debug("Request received from Control");
		LOGGER.debug("In Assign Service");
		
		try {
			LOGGER.debug("In try block to get customer details");
			LOGGER.debug("Sending request to DAO");
			return assignDao.getCustomerDetail();
		
		} catch (Exception e) {
			
			LOGGER.debug("An error occurred while getting customer details"+ e);
			return null;
		}
	}

}
