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
	private JdbcTemplate jdbcTemplate;
	/**
	 * jdbcTemplate���̰߳�ȫ�ģ���˿���ע�������DAOʵ��ʹ��
	 * @return
	 */
	public JdbcTemplate getJdbcTemplate(){
		return this.jdbcTemplate;
	}
}
