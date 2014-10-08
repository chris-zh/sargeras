package com.sargeras.login.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sargeras.login.vo.UserVo;
import com.sargeras.pub.dao.BaseDao;
public class LoginDaoImpl  extends BaseDao implements LoginDao  {
	@Override
	public int register(UserVo userVo) {
		int result = -1;
		String sql = "INSERT INTO T_USER (USER_ID, USER_CODE, USER_NAME, USER_EMAIL, USER_PASSWORD) VALUES (S_USER.NEXTVAL,S_USER.CURRVAL || TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'),?,?,?)";
		Object args[]={userVo.getUserName(),userVo.getUserEmail(),userVo.getUserPassword()};
		result = super.getJdbcTemplate().update(sql, args);
		return result;
	}
	

	@Override
	public List<UserVo> toLogin(UserVo userVo) {
		int result = -1;
		List<UserVo> list = new ArrayList();
		String sql = 
			"SELECT T.USER_ID,\n" +
			"       T.USER_NAME,\n" + 
			"       T.USER_CODE,\n" + 
			"       T.USER_EMAIL,\n" + 
			"       T.USER_PASSWORD,\n" + 
			"       T.USER_NICKNAME\n" + 
			"  FROM T_USER T\n" + 
			" WHERE T.USER_NAME = ?\n" + 
			"   AND T.USER_PASSWORD = ?";
		Object args[]={userVo.getUserName(),userVo.getUserPassword()};
		list = getJdbcTemplate().query(sql, args, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int i)
					throws SQLException {
					UserVo vo = new UserVo();
					vo.setUserId(rs.getLong("USER_ID"));
					vo.setUserName(rs.getString("USER_NAME"));
					vo.setUserEmail(rs.getString("USER_EMAIL"));
					vo.setUserNickname(rs.getString("USER_NICKNAME"));
				return vo;
			}
			
		});

		return list;
	}


	@Override
	public int validateLogin(UserVo userVo) {
		int result = -1;
		String sql = 
			"SELECT COUNT(1) CN\n" +
			"  FROM T_USER T\n" + 
			" WHERE T.USER_NAME = ?\n" + 
			"   AND T.USER_PASSWORD = ?";
		Object args[] = {userVo.getUserName(),userVo.getUserPassword()};
		result = getJdbcTemplate().queryForInt(sql,args);
		return result;
	}

}
