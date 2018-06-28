
package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.SubhadraLearnerDao;
import com.nskfdc.scgj.dto.SubhadraLearnerDto;

@Service
public class SubhadraLearnerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SubhadraLearnerService.class);
	
	@Autowired
	private SubhadraLearnerDao subhadraLearnerDao;
	
	public Collection<SubhadraLearnerDto> getLearnerDetail(){
		
		LOGGER.debug("Request received from Control");
		LOGGER.debug("In  learner Service, to get learner details");
		
		try {
			LOGGER.debug("In try block to get learner details");
			return subhadraLearnerDao.getLearnerDetail();
		} catch (Exception e) {
		
			LOGGER.debug("An error occurred while getting the learner details"+ e);
			return null;
		}
	}

}