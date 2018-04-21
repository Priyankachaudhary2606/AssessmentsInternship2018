package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.ImportHistoryService;

@RestController
public class ImportHistoryController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(ImportHistoryController.class);

	
	@Autowired
	private ImportHistoryService importHistoryService;
	
	
	@RequestMapping("/getImportHistory")
	public void getImportHistory() {
		
		//write LOGGER here
			
			try {
				//write LOGGER here		
				//write your logic here & change return type
				importHistoryService.getImportHistory();
				
			} catch (Exception e) {
				
				//write LOGGER here
				//return the default value, it can be null
			}
		}

}
