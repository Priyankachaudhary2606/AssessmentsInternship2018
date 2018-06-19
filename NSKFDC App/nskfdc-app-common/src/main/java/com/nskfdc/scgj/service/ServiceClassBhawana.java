package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClassBhawana {
	
	public static String makeMomos(String optional){
		return "Have " + optional+" MOMOS ";
	}

	public static String haveMomos(String optional2,String optional3){
		return" Have " +optional2+" And "+optional3+" MOMOS";
	}
}
 