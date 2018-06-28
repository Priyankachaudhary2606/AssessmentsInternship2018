package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;
public class BhawanaANODto extends BaseDto{
	
	private String customerName;
	private Integer customer_Id;
	private String address;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BhawanaANODto(String customerName, Integer customer_Id, String address) {
		super();
		this.customerName = customerName;
		this.customer_Id = customer_Id;
		this.address = address;
	}
	public BhawanaANODto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
