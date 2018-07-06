package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="AmanLearnerQuery",locations="classpath:sql/AmanLearner.yml")
public class AmanLearnerConfig {
	private String showLearnerDetails;

	public String getShowLearnerDetails() {
		
		return showLearnerDetails;
	}

	public void setShowLearnerDetails(String showLearnerDetails) {
		this.showLearnerDetails = showLearnerDetails;
	}
	
}
