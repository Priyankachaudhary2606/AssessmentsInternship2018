package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.FAQService;

@RestController
public class FAQController {
	
private static final Logger LOGGER = LoggerFactory.getLogger(FAQController.class);
	
	@Autowired
	private FAQService faqService;
	
	//Write your code here 

}
