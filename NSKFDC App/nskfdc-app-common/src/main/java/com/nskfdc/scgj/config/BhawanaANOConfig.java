package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="anoQuery",locations="classpath:sql/BhawanaANO.yml")
public class BhawanaANOConfig {
	
	
	private String showAirtelNetworkOpreatorDetail;//variable Declaration
	

	public String getShowAirtelNetworkOpreatorDetail() {
		return showAirtelNetworkOpreatorDetail;
	}
	

	public void setShowAirtelNetworkOpreatorDetail(String showAirtelNetworkOpreatorDetail) {
		this.showAirtelNetworkOpreatorDetail = showAirtelNetworkOpreatorDetail;
	}
	
	
	
}
