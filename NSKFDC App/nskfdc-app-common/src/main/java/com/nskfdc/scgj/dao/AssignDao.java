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
import com.nskfdc.scgj.config.AssignConfig;
import com.nskfdc.scgj.dto.AssignDto;

@Repository
public class AssignDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(AssignDao.class);

	private static final AssignRowmapper Assign_RowMapper = new AssignRowmapper();
	
	@Autowired
	private AssignConfig assignConfig;
	
	public Collection<AssignDto> getCustomerDetail(){		
	
		LOGGER.debug("Request received from Sevice");
		LOGGER.debug("In Assign DAO");
		
			try {
				LOGGER.debug("In try block to get customer details");
				LOGGER.debug("Sending request to config"); 
				return getJdbcTemplate().query(assignConfig.getShowDetails(), Assign_RowMapper);
			} catch (DataAccessException e) {
				
				return null;
			}


		
	}
	
	private static class AssignRowmapper implements RowMapper<AssignDto>{
	
		@Override
		public AssignDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			int customerId=rs.getInt("customerId");
			String customerName = rs.getString("customerName");
			String address = rs.getString("address");
					
			return new AssignDto(customerId,customerName,address);
			
		}
		
		
	}

}
