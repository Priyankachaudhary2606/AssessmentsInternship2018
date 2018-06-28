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
import com.nskfdc.scgj.config.BhawanaLearnerConfig;
import com.nskfdc.scgj.dto.BhawanaLearnerDto;


@Repository
public class BhawanaLearnerDao extends AbstractTransactionalDao {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaLearnerDao.class);	
	
    private static final LearnerRowmapper learner_Rowmapper = new LearnerRowmapper();
	
	@Autowired
	private BhawanaLearnerConfig bhawanaLearnerConfig;
	
		public Collection<BhawanaLearnerDto> getLearnerAppInfo(){
			
			
			try
			{
				LOGGER.debug("I m In try block of BhawanaLearnerDaO");
				if(bhawanaLearnerConfig!=null){
					
				 
				return getJdbcTemplate().query(bhawanaLearnerConfig. getShowLearnerDetails(), learner_Rowmapper); 
					
			        }
				else{
					LOGGER.error("The bhawanalearnerConfig is  set to NULL");
					return null;
				    }
			}
			catch (DataAccessException e) {
				// TODO: handle exception
				
				LOGGER.error("I m In catch block of BhawanalearnerDao" + e);
				return null;
			}
			
			catch(Exception e)
			{
				LOGGER.error("Throwing exception while fetching values from the database" + e);
				LOGGER.error("ERROR! Returning null");
				return null;
			}
		}

		
		

		private static class LearnerRowmapper implements RowMapper<BhawanaLearnerDto>{

			@Override
			public BhawanaLearnerDto mapRow(ResultSet rs, int rowNum)throws SQLException {
				
				Integer learnerId = rs.getInt("learnerId");
				String learnerName = rs.getString("learnerName");
				String learningTitle = rs.getString("learnerTitle");
				String learningDescription = rs.getString("learnerDescription");
				String date = rs.getString("date");
				
				return new BhawanaLearnerDto(learnerId, learnerName, learningTitle,learningDescription,date );
			}
			


		}	
			
	
}
