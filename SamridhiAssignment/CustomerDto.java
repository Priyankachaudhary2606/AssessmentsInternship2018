package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class CustomerDto extends BaseDto {
	
	
	private String customerName;
	private String customerId;
	private String address;
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	public CustomerDto(String customerName,String customerId,String address)
	{
		this.customerName=customerName;
		this.customerId=customerId;
		this.address=address;
	}
	
	public CustomerDto(){
		super();
	}
	
	
}
