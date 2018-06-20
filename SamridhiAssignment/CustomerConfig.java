package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="customerQuery",locations="classpath:sql/getdetails.yml")
public class CustomerConfig {
	private String showCustomerDetails;

	public String getShowCustomerDetails() {
		return showCustomerDetails;
	}

	public void setShowCustomerDetails(String showCustomerDetails) {
		this.showCustomerDetails = showCustomerDetails;
	}

	

}
