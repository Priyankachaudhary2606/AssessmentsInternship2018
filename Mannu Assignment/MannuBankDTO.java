package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class MannuBankDTO extends BaseDto{

	private String customerId;
	private String customerName;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public MannuBankDTO(String customerId, String customerName)
	{
		super();
		this.customerId=customerId;
		this.customerName=customerName;
	}
    public MannuBankDTO() {
    	super();
    }
}
