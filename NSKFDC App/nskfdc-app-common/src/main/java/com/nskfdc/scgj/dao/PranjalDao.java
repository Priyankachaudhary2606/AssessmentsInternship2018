package com.nskfdc.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.nskfdc.scgj.common.AbstractTransactionalDao;
import com.nskfdc.scgj.config.PranjalConfig;
import com.nskfdc.scgj.dto.PranjalDto;

@Repository
public class PranjalDao extends AbstractTransactionalDao{

	private static final DAORowmapper DAO_RowMapper = new DAORowmapper();
	@Autowired
	private PranjalConfig pranjalConfig;
	public Collection<PranjalDto> getCustomerDetails(){
		try {
			return getJdbcTemplate().query(pranjalConfig.getShowCustomerDetails(),DAO_RowMapper);
		}
		catch(Exception e) {
			return null;
		}
	}
	private static class DAORowmapper implements RowMapper<PranjalDto>
	{
		public PranjalDto mapRow(ResultSet rs, int rowNum) throws SQLException 
		{	
			int customerId = rs.getInt("customerId");
			String customerName = rs.getString("customerName");
			String address = rs.getString("address");
			return new PranjalDto(customerId,customerName,address);
		}
	}
}
