package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="bankQuery",locations="classpath:sql/BhawanaBank.yml")

public class BhawanaBankConfig {
	
	private String showCustomerDetailsOfHDFCBankUsers;
	
		public String getShowCustomerDetailsOfHDFCBankUsers() {
		return showCustomerDetailsOfHDFCBankUsers;
		}

			public void setShowCustomerDetailsOfHDFCBankUsers(String showCustomerDetailsOfHDFCBankUsers){
				this.showCustomerDetailsOfHDFCBankUsers = showCustomerDetailsOfHDFCBankUsers;
			}

	
	
	
	

}
