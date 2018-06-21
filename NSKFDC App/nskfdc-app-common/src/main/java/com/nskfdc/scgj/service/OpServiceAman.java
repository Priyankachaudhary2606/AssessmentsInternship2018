package com.nskfdc.scgj.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nskfdc.scgj.dao.OpDaoAman;
import com.nskfdc.scgj.dto.OpDtoAman;



@Service
public class OpServiceAman {
	    @Autowired
		private OpDaoAman opDao;
		
		public Collection<OpDtoAman> getShowCustomerDetails(){
			
			
			
			try {
				
				return opDao.getShowCustomerDetails();
			} catch (Exception e) {
			
				
				return null;
			}
		}

	}


