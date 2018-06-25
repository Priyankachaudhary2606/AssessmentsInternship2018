package com.nskfdc.scgj.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="userInput",locations="classpath:sql/userinputquery.yml")
public class AmanUserConfig {
	
	private String bringUserDetails;

	public String getBringUserDetails() {
		return bringUserDetails;
	}

	public void setBringUserDetails(String bringUserDetails) {
		this.bringUserDetails = bringUserDetails;
	}

	

}
