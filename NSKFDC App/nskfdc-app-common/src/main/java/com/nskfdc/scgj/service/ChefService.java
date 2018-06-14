package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class ChefService {
	
	public static String Momos(){
		return "We serve you the best momos,Enjoy your meal sir!";
	}
	public static String FriedMomos(String comments){
		return "These are the fried momos and are "+comments;
	}
	public static String PaneerMomos(String comment1,String comment2){
		return "Paneer momos are our speciality and these momos are "+comment1+comment2;
	}
}
