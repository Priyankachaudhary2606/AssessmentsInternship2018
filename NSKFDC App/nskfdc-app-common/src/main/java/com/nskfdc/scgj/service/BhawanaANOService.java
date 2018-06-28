package com.nskfdc.scgj.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//package com.nskfdc.scgj.dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.BhawanaANODao;
import com.nskfdc.scgj.dao.BhawanaSNODao;
import com.nskfdc.scgj.dto.BhawanaANODto;
@Service
public class BhawanaANOService {
	
	@Autowired
	private BhawanaANODao anoDao;
	@Autowired
	private BhawanaSNODao snoDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BhawanaANOService.class);
	
	public Collection<BhawanaANODto>getNetworkOpreaterDetailForAirtel() {
	try{
		
		LOGGER.debug("In the try block of Ano Service");
		return anoDao.getNetworkOpreaterInfoForAirtel();
	}
	catch (Exception e) {
		
		LOGGER.debug("In The Catch Block of Ano service");
		return null;
	}
	}
	public Collection<BhawanaANODto>getSpecifiedNetworkOpreaterDetail(String operator){
		
		
		return snoDao.getSpecifiedNetworkOpreaterInfo(operator); 
	}
	
}
	


