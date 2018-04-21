package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.ImportHistoryDao;

@Service
public class ImportHistoryService {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ImportHistoryService.class);
	
	@Autowired
	private ImportHistoryDao importHistoryDao;
	
/*--------------Method to get Import History----------------*/
	
	public void getImportHistory() {
		
	//write LOGGER here
		
		try {
			//write LOGGER here		
			//write your logic here & change return type
			importHistoryDao.getImportHistory();
			
		} catch (Exception e) {
			
			//write LOGGER here
			//return the default value, it can be null
		}
	}

}
