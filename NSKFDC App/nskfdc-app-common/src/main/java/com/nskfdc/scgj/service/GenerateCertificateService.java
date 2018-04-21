package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.GenerateCertificateDao;

@Service
public class GenerateCertificateService {
	
	
	private static final Logger LOGGER= LoggerFactory.getLogger(GenerateCertificateService.class);
	
	@Autowired
	private GenerateCertificateDao generateCertificateDao;
	
	public void getGeneratedCertificateHistory() {
		
		//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
	
			generateCertificateDao.getCertificateGenerationHistory();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
		
	}
	

}
