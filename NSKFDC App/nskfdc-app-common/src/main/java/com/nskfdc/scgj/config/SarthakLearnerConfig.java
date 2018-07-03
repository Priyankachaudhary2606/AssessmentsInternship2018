package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="SarthakLearnerQuery",locations="classpath:sql/poc.yml")
public class SarthakLearnerConfig {
	private String showSarthakLearnerDetails;

	public String getShowSarthakLearnerDetails() {
		return showSarthakLearnerDetails;
	}

	public void setShowSarthakLearnerDetails(String showSarthakLearnerDetails) {
		this.showSarthakLearnerDetails = showSarthakLearnerDetails;
	}
	

}
