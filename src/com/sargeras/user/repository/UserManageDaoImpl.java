package com.sargeras.user.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.sargeras.login.vo.UserVo;
import com.sargeras.pub.dao.BaseDao;

public class UserManageDaoImpl extends BaseDao implements UserManageDao{

	@Override
	public List<UserVo> viewUsers() {
		List<UserVo> userList = new ArrayList<UserVo>();
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT USER_ID,USER_NAME,USER_CODE,USER_EMAIL,USER_PASSWORD, ");
		sql.append(" USER_NICKNAME,INSERT_TIME,UPDATE_TIME FROM T_USER ");
		userList = getJdbcTemplate().query(sql.toString(), new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int arg) throws SQLException {
				UserVo user = new UserVo();
				user.setUserId(rs.getLong("USER_ID"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setUserCode(rs.getString("USER_CODE"));
				user.setUserEmail(rs.getString("USER_EMAIL"));
				user.setUserNickname(rs.getString("USER_NICKnAME"));
				user.setUserPassword(rs.getString("USER_PASSWORD"));
				return user;
			}
		});
		return userList;
	}

}
