package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class ChefService {
	public static String getBurgerMethod(String addcomment) 
	{
		return "Big Burger with " +addcomment;
	}

}
