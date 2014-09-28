package com.sargeras.pub.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * DAO基类
 * 子类可继承以获得组件
 * 添加JdbcTemplate组件
 * @author chris.zhang
 *
 */
public class BaseDao {
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
