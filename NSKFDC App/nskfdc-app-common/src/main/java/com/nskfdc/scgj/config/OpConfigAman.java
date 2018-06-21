package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

	@Component
	@ConfigurationProperties(prefix="AmanQuery",locations="classpath:sql/op.yml")
	public class OpConfigAman {
		
		private String showCustomerDetails;

		public String getShowCustomerDetails() {
			
			return showCustomerDetails;
		}

		public void setShowCustomerDetails(String showCustomerDetails) {
			this.showCustomerDetails = showCustomerDetails;
		}
		



}
