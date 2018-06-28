package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.BhawanaLearnerDao;
import com.nskfdc.scgj.dto.BhawanaLearnerDto;

@Service
public class BhawanaLearnerService {
	
	@Autowired
	private BhawanaLearnerDao bhawanaLearnerDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BhawanaLearnerService.class);
	
	public Collection<BhawanaLearnerDto>getLearnerAppInfo(){
		try{
			
			LOGGER.debug("In the try block of BhawanalearnerService");
			return bhawanaLearnerDao.getLearnerAppInfo();
		
		}
		catch (Exception e) {
			
			LOGGER.debug("In The Catch Block of BhawanalearnerService");
			return null;
		}
		
		
	}
	
	

}
