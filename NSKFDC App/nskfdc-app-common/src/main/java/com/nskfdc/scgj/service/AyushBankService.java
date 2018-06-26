package com.nskfdc.scgj.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nskfdc.scgj.dao.AyushBankDao;
import com.nskfdc.scgj.dto.AyushBankDto;

@Service
public class AyushBankService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AyushBankService.class);
	@Autowired
	private AyushBankDao AyushBankDao;
	
	//Collection for DTO
	public Collection<AyushBankDto> getCustomerDetails()
	{
		LOGGER.debug("Service gets request from Controller");
	try {
		return AyushBankDao.getCustomerDetails();
	}
	catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
	}
	
	

}
