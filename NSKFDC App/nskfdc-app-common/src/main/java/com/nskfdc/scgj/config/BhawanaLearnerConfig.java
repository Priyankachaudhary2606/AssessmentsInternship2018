package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="learnerQuery",locations="classpath:sql/BhawanalearnerApp.yml")
public class BhawanaLearnerConfig {

		private String showLearnerDetails;

		public String getShowLearnerDetails() {
			return showLearnerDetails;
		}

		public void setShowLearnerDetails(String showLearnerDetails) {
			this.showLearnerDetails = showLearnerDetails;
		}

		
}