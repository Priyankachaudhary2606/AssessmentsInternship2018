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
import com.nskfdc.scgj.config.MannuLearnerConfig;
import com.nskfdc.scgj.dto.MannuLearnerDTO;

@Repository
public class MannuLearnerDAO extends AbstractTransactionalDao {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(MannuLearnerDAO.class);
    private static final MannuLearnerRowmapper Mannu_RowMapper = new MannuLearnerRowmapper();
	@Autowired
	private MannuLearnerConfig mannuLearnerConfig;
	
	public Collection<MannuLearnerDTO> getLearnersData(){
		
		LOGGER.debug("Request received from Service");
		LOGGER.debug("In Mannu Learner DAO to get Learners Detail");
		
		
		try {
			
			LOGGER.debug("In try block");
			return getJdbcTemplate().query(mannuLearnerConfig.getShowLearnersData(), Mannu_RowMapper);
			
		} catch (Exception e) {
			
			LOGGER.debug("In Catch Block");
			LOGGER.debug("An error occured while getting the data" + e);
			return null;
			
		}
		
	}
	
	private static class MannuLearnerRowmapper implements RowMapper<MannuLearnerDTO>{
		
		@Override
		public MannuLearnerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			String learnerId = rs.getString("learnerId");
			String learnerName = rs.getString("learnerName");
			String learningTitle = rs.getString("learningTitle");
			String learningDescription = rs.getString("learningDescription");
			String date = rs.getString("date");			
			
			return new MannuLearnerDTO(learnerId, learnerName, learningTitle,learningDescription,date);
			
		}
		
		
	}

}
	
