package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class AyushBankDto extends BaseDto {
	private int customerId;
	private String customerName;
	
	//Getting & Setting the Customer ID & Customer Name
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
public AyushBankDto(int customerId,String customerName)
	{
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		
	}
public AyushBankDto()
	{
		super();
	}
}
