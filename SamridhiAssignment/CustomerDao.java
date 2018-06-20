package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.CustomerConfig;
import com.nskfdc.scgj.dto.CustomerDto;

@Repository
public class CustomerDao extends AbstractTransactionalDao{

	@Autowired
    CustomerConfig customerConfig;
	

    private static final CustomerDaoRowMapper rowMapper = new CustomerDaoRowMapper();
	
	public Collection<CustomerDto> getDetails()
	{
		
		try{
			System.out.println("Entered in Dao");
			return getJdbcTemplate().query(customerConfig.getShowCustomerDetails(), rowMapper);
		}
		
		catch (Exception e)
		{
			System.out.print("Error in Dao");
			return null;
		}
		
		
	}

private static class CustomerDaoRowMapper implements RowMapper<CustomerDto>{
	
	@Override
	public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException{
	
		String customerName = rs.getString("customerName");
		String customerId = rs.getString("customerId");
		String address = rs.getString("address");
		
		return new CustomerDto(customerName,customerId,address);
		
	}
		
	}
	

}


