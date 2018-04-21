package com.nskfdc.scgj.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.FAQConfig;

@Repository
public class FAQDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(FAQDao.class);
	
	@Autowired
	private FAQConfig faqConfig;
	
	//Write methods to get answers of FAQ here
	
	

}
