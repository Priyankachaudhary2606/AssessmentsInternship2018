package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Chef1MannuService {

	public String makeMomos()
	{
		return "Momos";
	}
	public String makeMomos(String additionalInfo)
	{
		return "Momos " + additionalInfo;
	}
	public String makeMomos(String additionalInfo1, String additionalInfo2)
	{
		return "Momos "+additionalInfo1+" "+additionalInfo2;
	}
}
