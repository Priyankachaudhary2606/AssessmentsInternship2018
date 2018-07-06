package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.AmanLearnerDao;
import com.nskfdc.scgj.dto.AmanLearnerDto;


@Service
public class AmanLearnerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AmanLearnerService.class);
@Autowired
private AmanLearnerDao amanDao;
public Collection<AmanLearnerDto> getShowLearnerDetails(){
	LOGGER.debug("Request received from Control");
	LOGGER.debug("In Aman Learner Service, to get learner details");
	
	
	try {
		LOGGER.debug("In try block to get learner details");
		return amanDao.getShowLearnerDetails();
	} catch (Exception e) {
	
		LOGGER.debug("An error occurred while getting the learner details"+ e);
		return null;
	}
}
}
