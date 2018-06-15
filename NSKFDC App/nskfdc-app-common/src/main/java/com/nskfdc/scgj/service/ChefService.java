package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;


	@Service
	
	public class ChefService{
		
		public static String makeBurger(String Comment1, String Comment2 )
		{
			return"Big Burgers"+Comment1+Comment2;
		}
public static String makeMomos(String Comment1)
{
	return "Yummy Momos"+Comment1;
	
}

}


