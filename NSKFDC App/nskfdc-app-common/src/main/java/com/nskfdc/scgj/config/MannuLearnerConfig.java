package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="mannuQuery",locations="classpath:sql/Mannu.yml")

public class MannuLearnerConfig {
	
	private String showLearnersData;

	public String getShowLearnersData() {
		return showLearnersData;
	}

	public void setShowLearnersData(String showLearnersData) {
		this.showLearnersData = showLearnersData;
	}

}
