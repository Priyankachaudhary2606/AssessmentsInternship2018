package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.apache.tomcat.jdbc.pool.DataSource;

@Component
@ConfigurationProperties(prefix="banksQuery", locations = "classpath:sql/banks.yml")
public class AyushBankConfig {
	private String showCustomerDetails;
 	public String getShowCustomerDetails()
 	{
 		return showCustomerDetails;
 	}
	public void setShowCustomerDetails(String showCustomerDetails)
	{
		this.showCustomerDetails = showCustomerDetails;

}
}