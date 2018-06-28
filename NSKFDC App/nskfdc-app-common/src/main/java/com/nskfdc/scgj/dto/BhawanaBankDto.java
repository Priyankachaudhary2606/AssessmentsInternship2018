package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class BhawanaBankDto extends BaseDto {
		
	private String customerName;
		private Integer customerId;
		
		public String getCustomerName() {
			return customerName;
		}
		
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		
		public Integer getCustomerId() {
			return customerId;
		}
		
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		

		/*------CONSTRUCTOR-------------*/
		
			public BhawanaBankDto(String customerName, Integer customerId) {
				super();
				this.customerName = customerName;
				this.customerId = customerId;
			}

			
			/*------CONSTRUCTOR OF BASE DTO CLASS-------------*/
				public BhawanaBankDto() {
					super();
		        }
		
		
		
}

