package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="pocQuery",locations="classpath:sql/poc.yml")
public class POCConfig {
	
	private String showTrainingPartnerDetails;

	public String getShowTrainingPartnerDetails() {
		return showTrainingPartnerDetails;
	}

	public void setShowTrainingPartnerDetails(String showTrainingPartnerDetails) {
		this.showTrainingPartnerDetails = showTrainingPartnerDetails;
	}
	

}
