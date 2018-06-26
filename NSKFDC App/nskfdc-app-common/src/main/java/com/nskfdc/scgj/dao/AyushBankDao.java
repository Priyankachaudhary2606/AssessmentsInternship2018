package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.AyushBankConfig;
import com.nskfdc.scgj.dto.AyushBankDto;


@Repository
public class AyushBankDao extends AbstractTransactionalDao{
	private static final Logger LOGGER=LoggerFactory.getLogger(AyushBankDao.class);
	private static final DAORowmapper DAO_RowMapper = new DAORowmapper();
	@Autowired
	private AyushBankConfig ayushBankConfig;   
	public Collection<AyushBankDto> getCustomerDetails(){
		LOGGER.debug("Gets Request from Service");
		try {
			
			return getJdbcTemplate().query(ayushBankConfig.getShowCustomerDetails(), DAO_RowMapper);
		}
		catch(Exception e) {
			LOGGER.debug("The exception is " + e);
			return null;
		}
	}
	private static class DAORowmapper implements RowMapper<AyushBankDto>
	{
		public AyushBankDto mapRow(ResultSet rs, int rowNum) throws SQLException 
		{	
			int customerId = rs.getInt("customerId");
			String customerName = rs.getString("customerName");
			return new AyushBankDto(customerId,customerName);
		}
	}
}
