package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="facebook",locations="classpath:sql/facebook.yml")
public class FacebookUserConfiguration {
	
	private String bringUserDetails;

	public String getBringUserDetails() {
		return bringUserDetails;
	}

	public void setBringUserDetails(String bringUserDetails) {
		this.bringUserDetails = bringUserDetails;
	}

	

}
