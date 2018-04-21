package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.LoginConfigSql;

@Repository
public class LoginDao extends AbstractTransactionalDao{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginDao.class);
	
	@Autowired
	private LoginConfigSql loginConfigSql;
	
	
	public Integer userExistence(){
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In LoginDao - userExistence");
		 	
		LOGGER.debug("Checking Existense of User");
		
		LOGGER.debug("Creating HashMap object");
		Map<String, Object> parameters = new HashMap<>();
		LOGGER.debug("object created successfully");
		
		LOGGER.debug("Inserting parameters to HashMap object");
		//parameters.put("userId", userId);
		//parameters.put("password", password);
		LOGGER.debug("Parameters inserted");
		
		LOGGER.debug("Executing SQL query and returning response");
		
        try {
        	
        	LOGGER.debug("In try block for user existence in Login Dao");
        	
        	//write your code here
        	
        	return 1;
        	
        }catch(Exception e) {
        	
        	LOGGER.debug("Error occured while checking user existence for Login" + e);
        	return null;
        }
		
	}
	
	public void getValidUserDetails() {
		LOGGER.debug("Request Received from Service");
		LOGGER.debug("In LoginDao - getValidateLoginUser");
		
		LOGGER.debug("Creating HashMap object");
		Map<String, Object> parameters = new HashMap<>();
		LOGGER.debug("object created successfully");
		
		LOGGER.debug("Inserting parameters to HashMap object");
		//parameters.put("userId", userId);
		//parameters.put("password", password);
		LOGGER.debug("Parameters inserted");
		
		LOGGER.debug("Executing SQL query and returning response");
        try {
        	
        }catch(Exception e) {
        	
        	LOGGER.debug("Error occured while getting valid user details on login" + e);
        	
        }
	}
	
	


}
