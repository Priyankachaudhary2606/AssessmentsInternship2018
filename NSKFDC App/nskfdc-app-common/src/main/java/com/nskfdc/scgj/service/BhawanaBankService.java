package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.BhawanaBankDao;
import com.nskfdc.scgj.dto.BhawanaBankDto;

@Service
public class BhawanaBankService {
	
	@Autowired
	private BhawanaBankDao bhawanaBankDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BhawanaANOService.class);
	
	public Collection<BhawanaBankDto>getHDFCcustomerDetails() {
	try{
		
		LOGGER.debug("In the try block of Ano Service");
		return bhawanaBankDao.getHDFCCustomerInfo();
	}
	catch (Exception e) {
		
		LOGGER.debug("In The Catch Block of Ano service");
		return null;
	}
	
	
	}
}
