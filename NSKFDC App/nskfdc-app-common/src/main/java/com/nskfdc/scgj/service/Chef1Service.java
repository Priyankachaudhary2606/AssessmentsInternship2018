package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Chef1Service
{
	public String makeburger(String a,String b)
	{
		String c=a+b;
		return "serve the maggi "+c;
	}
	

}
