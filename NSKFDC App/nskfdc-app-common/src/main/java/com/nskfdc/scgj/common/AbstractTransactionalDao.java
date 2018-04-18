package com.nskfdc.scgj.common;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractTransactionalDao extends AbstractQueryDao {

		public int insert(String insertSql, Map<String,Object> parameters,
			String keyColumnName) {
			MapSqlParameterSource mapSqlPatMapqlParameterSource = new MapSqlParameterSource(parameters);
		KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		 getJdbcTemplate().update(insertSql, mapSqlPatMapqlParameterSource, generatedKeyHolder,
				new String[] { keyColumnName });
		return generatedKeyHolder.getKey().intValue();
	}
}
