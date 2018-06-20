package com.nskfdc.scgj.service;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nskfdc.scgj.dao.OpDao;
import com.nskfdc.scgj.dto.OpDto;

@Service
public class OpService {
	
	
	
		
		
		
		@Autowired
		private OpDao opDao;
		
		public Collection<OpDto> getShowCustomerDetails(){
			
			
			
			try {
				
				return opDao.getShowCustomerDetails();
			} catch (Exception e) {
			
				
				return null;
			}
		}

	}


