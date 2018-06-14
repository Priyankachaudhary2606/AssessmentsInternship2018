package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Shivanshu {
	public String getFolksMethod(String additionalcomment,String additionalcomments)
	{
		return "folks are"+" "+additionalcomment+" "+additionalcomments;
	}
	public String getChaiMethod(String addcomment)
	{
		return "chai is"+" "+addcomment;
	}

}
