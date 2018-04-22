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
import com.nskfdc.scgj.config.POCConfig;
import com.nskfdc.scgj.dto.PocDto;

@Repository
public class POCDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(POCDao.class);
	
	private static final POCRowmapper POC_RowMapper = new POCRowmapper();
	
	@Autowired
	private POCConfig pocConfig;
	
	public Collection<PocDto> getPOCTrainingPartnerDetail(){
		
		LOGGER.debug("Request received from Service");
		LOGGER.debug("In POCDao, to get Training Partner Detail for POC");
		
		
		try {
			
			LOGGER.debug("In try block");
			LOGGER.debug("Execute query to get training partner details for POC");
			return getJdbcTemplate().query(pocConfig.getShowTrainingPartnerDetails(), POC_RowMapper);
			
		} catch (Exception e) {
			
			LOGGER.debug("In Catch Block");
			LOGGER.debug("An error occured while getting the training partner details for POC" + e);
			return null;
			
		}
		
	}
	
	private static class POCRowmapper implements RowMapper<PocDto>{
		
		@Override
		public PocDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			String trainingPartnerId = rs.getString("trainingPartnerId");
			String trainingPartnerName = rs.getString("trainingPartnerName");
			String tpAddress = rs.getString("tpAddress");
			String tpContact = rs.getString("tpContact");
			String tpEmail = rs.getString("tpEmail");			
			
			return new PocDto(trainingPartnerId,trainingPartnerName,tpAddress,tpContact,tpEmail);
			
		}
		
		
	}

}
