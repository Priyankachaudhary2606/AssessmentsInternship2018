package com.nskfdc.scgj.service;

import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nskfdc.scgj.dao.MannuLearnerDAO;
import com.nskfdc.scgj.dto.MannuLearnerDTO;


@Service
public class MannuLearnerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MannuLearnerService.class);
	@Autowired
	private MannuLearnerDAO mannuLearnerDAO;
	
	public Collection<MannuLearnerDTO> getLearnersData(){
		
		LOGGER.debug("Request received from Controller");
		LOGGER.debug("In Mannu Learner Service to get Learners Detail");
		
		try {
			LOGGER.debug("In try block");
			return mannuLearnerDAO.getLearnersData();
		} catch (Exception e) {
		
			LOGGER.debug("An error occurred while getting the data"+ e);
			return null;
		}
	}
	
}
