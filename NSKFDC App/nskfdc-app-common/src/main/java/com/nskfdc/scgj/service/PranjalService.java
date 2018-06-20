package com.nskfdc.scgj.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.PranjalDao;
import com.nskfdc.scgj.dto.PranjalDto;

@Service
public class PranjalService {
	@Autowired
	private PranjalDao pranjalDao;
	public Collection<PranjalDto> getCustomerDetails()
	{
	try {
		return pranjalDao.getCustomerDetails();
	}
	catch(Exception e)
	{
		return null;
	}
	}
	
	

}
