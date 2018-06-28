package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="subhadraLearnerQuery",locations="classpath:sql/subhadraLearner.yml")
public class SubhadraLearnerConfig {
	
	private String learnerDetails;

	public String getLearnerDetails() {
		return learnerDetails;
	}

	public void setLearnerDetails(String learnerDetails) {
		this.learnerDetails = learnerDetails;
	}

	

}

