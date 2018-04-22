package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.POCDao;
import com.nskfdc.scgj.dto.PocDto;

@Service
public class POCService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(POCService.class);
	
	@Autowired
	private POCDao pocDao;
	
	public Collection<PocDto> getPOCTrainingPartnerDetail(){
		
		LOGGER.debug("Request received from Control");
		LOGGER.debug("In POC training Partner Service, to get training Partner details for POC");
		
		try {
			LOGGER.debug("In try block to get training partner details");
			return pocDao.getPOCTrainingPartnerDetail();
		} catch (Exception e) {
		
			LOGGER.debug("An error occurred while getting the training partner details for POC"+ e);
			return null;
		}
	}

}
