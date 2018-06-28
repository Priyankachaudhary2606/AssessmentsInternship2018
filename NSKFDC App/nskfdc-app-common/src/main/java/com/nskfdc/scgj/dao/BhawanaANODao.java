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
import com.nskfdc.scgj.config.BhawanaANOConfig;
import com.nskfdc.scgj.dto.BhawanaANODto;

	
	@Repository
	public class BhawanaANODao extends AbstractTransactionalDao{

	private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaANODao.class);	
		
	private static final ANORowmapper ANO_RowMapper = new ANORowmapper();
	@Autowired
	private BhawanaANOConfig anoConfig ;
	
	public Collection<BhawanaANODto> getNetworkOpreaterInfoForAirtel() {
		
		try
		{
			LOGGER.debug("I m In try block of AnoDaO");
			if(anoConfig!=null){
				
			 
			return (Collection<BhawanaANODto>) getJdbcTemplate().query(anoConfig.getShowAirtelNetworkOpreatorDetail(), ANO_RowMapper);
				
		}
			else{
				LOGGER.error("The anoConfig is  set to NULL");
				return null;
			}
		}
		catch (DataAccessException e) {
			// TODO: handle exception
			
			LOGGER.error("I m In catch block of AnodAO" + e);
			return null;
		}
		
		catch(Exception e)
		{
			LOGGER.error("Throwing exception while fetching values from the database" + e);
			LOGGER.error("ERROR! Returning null");
			return null;
		}
	}

	private static class ANORowmapper implements RowMapper<BhawanaANODto>{
		
		@Override
        public BhawanaANODto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			String customerName = rs.getString("customerName");
			Integer customer_Id = rs.getInt("customer_Id");
			String address = rs.getString("address");
						
			return new BhawanaANODto(customerName,customer_Id,address);
			
		}
		
		
		
		
	}
	
	
	
	

}
