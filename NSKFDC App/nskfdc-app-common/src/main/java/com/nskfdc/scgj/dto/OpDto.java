package com.nskfdc.scgj.dto;
import com.nskfdc.scgj.common.BaseDto;

public class OpDto extends BaseDto {
	

		
		private int customerId;
		private String customerName;
		private String address;
		//private String tpContact;
		//private String tpEmail;
		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}

		/*------CONSTRUCTOR-------------*/
		
		public OpDto(int customerId, String customerName, String address) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.address = address;
		}
					
		
		

		public OpDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

	}



