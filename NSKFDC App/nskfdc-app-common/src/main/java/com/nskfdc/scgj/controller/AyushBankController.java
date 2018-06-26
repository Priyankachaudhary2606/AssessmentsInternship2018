package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nskfdc.scgj.dto.AyushBankDto;
import com.nskfdc.scgj.service.AyushBankService;


@RestController
public class AyushBankController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AyushBankService.class);
	
	
	@Autowired
	private AyushBankService AyushBankService;
	@RequestMapping("/getHdfcCustomerDetails")

	
		public Collection<AyushBankDto> getCustomerDetails(){
	
	LOGGER.debug("Controller gets the request from Client");
		try {
			return AyushBankService.getCustomerDetails();
		}
		catch(Exception e) {
			System.out.println(e);
			return  null;
		}
	}

}
