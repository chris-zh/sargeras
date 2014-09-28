package com.sargeras.login.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sargeras.login.vo.UserVo;
import com.sargeras.pub.dao.BaseDao;
@Repository
public class LoginDaoImpl  extends BaseDao implements LoginDao  {
	@Override
	public int register(UserVo userVo) {
		int result = -1;
		String sql = "INSERT INTO T_USER (USER_ID, USER_CODE, USER_NAME, USER_EMAIL, USER_PASSWORD) VALUES (S_USER.NEXTVAL,S_USER.CURRVAL || TO_CHAR(SYSDATE, 'YYYYMMDD HH24:MI:SS'),?,?,?)";
		Object args[]={userVo.getUserName(),userVo.getUserEmail(),userVo.getUserPassword()};
		JdbcTemplate jt = super.jdbcTemplate;
		return result;
	}

}
