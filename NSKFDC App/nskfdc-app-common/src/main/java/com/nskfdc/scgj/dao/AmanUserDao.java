package com.nskfdc.scgj.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.AmanUserConfig;
import com.nskfdc.scgj.dto.AmanUserDto;


@Repository
public class AmanUserDao extends AbstractTransactionalDao{

	@Autowired
	private AmanUserConfig amanUserConfig;
	
	private static final AmanCustomerDetailsMap customerDetails_RowMapper = new AmanCustomerDetailsMap();
	private static final Logger LOGGER= LoggerFactory.getLogger(AmanUserDao.class);	
	public AmanUserDto getCustomerDetails(String networkOperator) {
		
	try
	{
	    LOGGER.debug("In try block of AmanUserDao to enter parameter: " + networkOperator);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("networkOperator",networkOperator);
	    LOGGER.debug("Parameters entered into the database");
	    if(amanUserConfig!=null)
	    {
		return getJdbcTemplate().queryForObject(amanUserConfig.getBringUserDetails(), parameters, customerDetails_RowMapper);
		}
	    else
	    {
	    	LOGGER.error("Object is null");
	    	return null;
	    }
	}
		catch(DataAccessException e)
		{
			LOGGER.error("A DataAccessException occured , Returning NULL" + e);
			return null;
		}
	 
	    catch(Exception e)
	{
	    	LOGGER.error("Throwing an exception at line number 45" + e);
	    	return null;
	}
	
			
		
	}
	
	private static class AmanCustomerDetailsMap implements RowMapper<AmanUserDto>{
		
		@Override
		public AmanUserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			int customerId = rs.getInt("customerId");
			String customerName = rs.getString("customerName");
			String address = rs.getString("address");		
			
			return new AmanUserDto(customerId, customerName, address);
			
		}
		
		
	}
	
}

