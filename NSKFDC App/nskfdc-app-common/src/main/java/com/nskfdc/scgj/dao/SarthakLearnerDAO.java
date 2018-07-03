package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.SarthakLearnerConfig;
import com.nskfdc.scgj.dto.SarthakLearnerDTO;

public class SarthakLearnerDAO extends AbstractTransactionalDao{
private static final Logger LOGGER= LoggerFactory.getLogger(SarthakLearnerDAO.class);
	
	private static final SarthakLearnerRowmapper SarthakLearner_RowMapper = new SarthakLearnerRowmapper();
	
	@Autowired
	private SarthakLearnerConfig SarthakLearnerConfig;
	
	public Collection<SarthakLearnerDTO> getSarthakLearnerLearnerDetail(){
		
		LOGGER.debug("Request received from Service");
		LOGGER.debug("In SarthakLearnerDao, to get learner Detail ");
		
		
		try {
			
			LOGGER.debug("In try block");
			LOGGER.debug("Execute query to get learner details ");
			return getJdbcTemplate().query(SarthakLearnerConfig.getShowSarthakLearnerDetails(), SarthakLearner_RowMapper);
			
		} catch (Exception e) {
			
			LOGGER.debug("In Catch Block");
			LOGGER.debug("An error occured while getting the learner details" + e);
			return null;
			
		}
		
	}
	
	public static class SarthakLearnerRowmapper implements RowMapper<SarthakLearnerDTO>{
		
		@Override
		public SarthakLearnerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			int LearnerId = rs.getInt("LearnerId"); //THIS SHOULD WORK
			String LearnerName = rs.getString("LearnerName");
			String LearningTitle = rs.getString("LearningTitle");
			String LearningDescription = rs.getString("Learning Description");
			String date = rs.getString("date");			
			
			return new SarthakLearnerDTO(LearnerId,LearnerName,LearningTitle, LearningDescription, date);
			
		}
		
		
	}


}
