package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class demoservice {
	public static String getMypaneer(String commentfromcontroller1,String commentfromcontroller2)
	{
		String FromController =(commentfromcontroller1 + commentfromcontroller2);
		return "My Momos"+FromController;
	}
}
