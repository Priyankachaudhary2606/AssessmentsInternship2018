package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.FAQDao;

@Service
public class FAQService {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(FAQService.class);
	
	@Autowired
	private FAQDao faqDao;
	
	//write methods to get answers for FAQ here
	

}
