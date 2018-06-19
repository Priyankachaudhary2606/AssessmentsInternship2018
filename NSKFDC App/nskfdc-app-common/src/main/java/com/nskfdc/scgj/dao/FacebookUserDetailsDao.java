package com.nskfdc.scgj.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.FacebookUserConfiguration;
import com.nskfdc.scgj.dto.FacebookUserDetailsDto;

@Repository
public class FacebookUserDetailsDao extends AbstractTransactionalDao{

	@Autowired
	private FacebookUserConfiguration facebookUserConfiguration;
	
	private static final FacebookUserDetailsMap facebookUserDetails_RowMapper = new FacebookUserDetailsMap();
	
	
	public FacebookUserDetailsDto getFacebookUserDetails(String username) {
		
		Map<String, Object> parameters = new HashMap<>();
		
		parameters.put("username",username);
		
		return getJdbcTemplate().queryForObject(facebookUserConfiguration.getBringUserDetails(), parameters, facebookUserDetails_RowMapper);
		
			
		
	}
	
	private static class FacebookUserDetailsMap implements RowMapper<FacebookUserDetailsDto>{
		
		@Override
		public FacebookUserDetailsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			String user = rs.getString("username");
			String course = rs.getString("course");
			String age = rs.getString("age");
			String college = rs.getString("college");		
			
			return new FacebookUserDetailsDto(user, course, age, college);
			
		}
		
		
	}
	
}
