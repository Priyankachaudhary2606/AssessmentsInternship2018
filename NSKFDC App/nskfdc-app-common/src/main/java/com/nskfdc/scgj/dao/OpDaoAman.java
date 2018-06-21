package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.OpConfigAman;
import com.nskfdc.scgj.dto.OpDtoAman;



@Repository
public class OpDaoAman extends AbstractTransactionalDao{
	
	
	
	private static final OPRowmapper OP_RowMapper = new OPRowmapper();
	
	@Autowired
	private OpConfigAman opConfig;
	
	public Collection<OpDtoAman> getShowCustomerDetails(){
		
	
		
		
		try {
			
			
			return getJdbcTemplate().query(opConfig.getShowCustomerDetails(), OP_RowMapper);
			
		} catch (Exception e) {
			
			return null;
			
		}
		
	}
	
	private static class OPRowmapper implements RowMapper<OpDtoAman>{
		
		@Override
		public OpDtoAman mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			int customerId = rs.getInt("customerId");
			String customerName = rs.getString("customerName");
			String address = rs.getString("address");
				
			
			return new OpDtoAman(customerId,customerName,address);
			
		}
		
		
	}

}


