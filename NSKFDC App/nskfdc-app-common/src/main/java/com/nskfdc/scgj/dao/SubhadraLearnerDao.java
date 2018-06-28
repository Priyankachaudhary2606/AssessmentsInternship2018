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
import com.nskfdc.scgj.config.SubhadraLearnerConfig;
import com.nskfdc.scgj.dto.SubhadraLearnerDto;

@Repository
public class SubhadraLearnerDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER= LoggerFactory.getLogger(SubhadraLearnerDao.class);
	
	private static final LearnerRowmapper Learner_RowMapper = new LearnerRowmapper();
	
	@Autowired
	private SubhadraLearnerConfig subhadraLearnerConfig;
	
	public Collection<SubhadraLearnerDto> getLearnerDetail(){
		
		LOGGER.debug("Request received from Service");
		LOGGER.debug("In subhadraLearnerDao, to get Learner Detail");
		
		
		try {
			
			LOGGER.debug("In try block");
			LOGGER.debug("Execute query to get learner details");
			return getJdbcTemplate().query(subhadraLearnerConfig.getLearnerDetails(), Learner_RowMapper);
			
		} catch (Exception e) {
			
			LOGGER.debug("In Catch Block");
			LOGGER.debug("An error occured while getting the learner details" + e);
			return null;
			
		}
		
	}
	
	private static class  LearnerRowmapper implements RowMapper<SubhadraLearnerDto>{
		
		@Override
		public SubhadraLearnerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
		    Integer learnerId = rs.getInt("learnerId");
			String learnerName = rs.getString("learnerName");
			String learningTitle = rs.getString("learningTitle");
			String learningDescription= rs.getString("learningDescription");
			String date = rs.getString("date");			
			
			return new SubhadraLearnerDto(learnerId,learnerName,learningTitle,learningDescription,date);
		}
	}
}
		
		
		
	


