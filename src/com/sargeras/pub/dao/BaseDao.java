package com.sargeras.pub.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * DAO����
 * ����ɼ̳��Ի�����
 * ���JdbcTemplate���
 * @author chris.zhang
 *
 */
public class BaseDao {
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
