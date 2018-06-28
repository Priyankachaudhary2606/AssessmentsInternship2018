package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nskfdc.scgj.dto.BhawanaLearnerDto;
import com.nskfdc.scgj.service.BhawanaLearnerService;


@RestController
public class BhawanaLearnerController {
	
	
	private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaLearnerService.class);
	
	@Autowired
	private BhawanaLearnerService bhawanaLearnerService;
	
	@RequestMapping("/getBhawanaLearnerAppDetails")
	public Collection<BhawanaLearnerDto> getLearnerAppDetails(){
		try{
		
			LOGGER.debug("I m In try block of LearnerController");
			return bhawanaLearnerService.getLearnerAppInfo();
					
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I m in controller ");
			
			LOGGER.debug("I m In Catch block of LearnerController");
			return null;
		}
	

}
}
