package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class chefservice {
	public String momos( String abc){
		return "momos with" +abc;
		}
	public String momoss( String abc, String xyz){
		return "momos with" +abc +xyz;
	}
}
