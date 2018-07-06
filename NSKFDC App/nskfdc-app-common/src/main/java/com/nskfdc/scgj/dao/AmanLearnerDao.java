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
import com.nskfdc.scgj.config.AmanLearnerConfig;
import com.nskfdc.scgj.dto.AmanLearnerDto;




@Repository
public class AmanLearnerDao extends AbstractTransactionalDao {
	private static final Logger LOGGER= LoggerFactory.getLogger(AmanLearnerDao.class);
	private static final LearnerRowmapper learner_RowMapper = new LearnerRowmapper();
	@Autowired
	private AmanLearnerConfig amanConfig;
	public Collection<AmanLearnerDto> getShowLearnerDetails(){
		
		LOGGER.debug("Request received from Service");
		LOGGER.debug("In AmanLearnerDao, to get learner Detail");
		
		
		try {
			LOGGER.debug("In try block");
			LOGGER.debug("Execute query to get learner details");
			
			return getJdbcTemplate().query(amanConfig.getShowLearnerDetails(), learner_RowMapper);
			
		} catch (Exception e) {
			LOGGER.debug("In Catch Block");
			LOGGER.debug("An error occured while getting the learner details" + e);
			return null;
			
		}
		
	}
	private static class LearnerRowmapper implements RowMapper<AmanLearnerDto>{
		@Override
		public AmanLearnerDto mapRow(ResultSet rs, int rowNum) throws SQLException{
			int id=rs.getInt("learnerId");
			String learnerName=rs.getString("learnerName");
			String learningTitle=rs.getString("learningTitle");
			String learningDescription=rs.getString("learningDescription");
			String date=rs.getString("date");
			return new AmanLearnerDto(id, learnerName, learningTitle, learningDescription, date);
		}
	}
}
