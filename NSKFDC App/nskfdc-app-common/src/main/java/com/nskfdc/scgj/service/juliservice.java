package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class juliservice
{

	public String makemomos()
	  {
		return " have momos";
	  }
	public String makemomos(String additionalcomment)
	  {
		return " have momos"+additionalcomment;
	  }
	public String makemomos(String additionalcomment1, String additionalcomment2)
	  {
		return " have momos"+additionalcomment1+additionalcomment2;
	  }
}

