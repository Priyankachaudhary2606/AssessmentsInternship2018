package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.BhawanaBankConfig;
import com.nskfdc.scgj.dto.BhawanaBankDto;

@Repository

public class BhawanaBankDao extends AbstractTransactionalDao{
			
	private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaBankDao.class);	
	
	private static final BankRowmapper Bank_RowMapper = new BankRowmapper();

		@Autowired
		private BhawanaBankConfig bhawanaBankConfig ;
		
		public Collection<BhawanaBankDto> getHDFCCustomerInfo() {
			
			try
			{
				LOGGER.debug("I m In try block of BhawanaBhankDaO");
				if(bhawanaBankConfig!=null){
					
				 
				return getJdbcTemplate().query(bhawanaBankConfig.getShowCustomerDetailsOfHDFCBankUsers(),Bank_RowMapper); 
					
			        }
				else{
					LOGGER.error("The bhawanaBhankConfig is  set to NULL");
					return null;
				    }
			}
			catch (DataAccessException e) {
				// TODO: handle exception
				
				LOGGER.error("I m In catch block of BhawanaBankDao" + e);
				return null;
			}
			
			catch(Exception e)
			{
				LOGGER.error("Throwing exception while fetching values from the database" + e);
				LOGGER.error("ERROR! Returning null");
				return null;
			}
		}

		private static  class  BankRowmapper implements RowMapper<BhawanaBankDto>{

	     		@Override
			public BhawanaBankDto mapRow(ResultSet rs, int rowNum)throws SQLException {
			
				Integer customerId = rs.getInt("customerId");
				String customerName = rs.getString("customerName");
							
			return new BhawanaBankDto(customerName,customerId);
			
		}

					
				
	}
			
			
			
			
}