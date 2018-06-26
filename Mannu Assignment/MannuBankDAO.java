package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import org.springframework.jdbc.core.RowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.MannuBankConfig;
import com.nskfdc.scgj.dto.MannuBankDTO;

@Repository
public class MannuBankDAO extends AbstractTransactionalDao {

	private static final Logger LOGGER=LoggerFactory.getLogger(MannuBankDAO.class);
	private static final MannuBankRowMapper Mannu_RowMapper=new MannuBankRowMapper();
	@Autowired
	private MannuBankConfig mannuBankConfig;
	
    public Collection<MannuBankDTO>	getBankCustomerDetails()
    {
    	LOGGER.debug("Recieved request from Service ");
    	LOGGER.debug("In DAO to get customer details. ");
    	try {
    		
    		LOGGER.debug("In try block");
    		return getJdbcTemplate().query(mannuBankConfig.getShowCustomerDetails(), Mannu_RowMapper);
    		
    	}catch(Exception e)
    	{
    		LOGGER.debug("In catch block");
    		System.out.println(e);
    		return null;
    	}
    	
    }
    
    private static class MannuBankRowMapper implements RowMapper<MannuBankDTO>{
    	
    	@Override
    	public MannuBankDTO mapRow (ResultSet rs, int rowNum) throws SQLException{
    	
    		String customerId=rs.getString("customerId");
    		String customerName=rs.getString("customerName");
    		
    		return new MannuBankDTO (customerId, customerName);
    		
    	}
    	
    }
	
}
