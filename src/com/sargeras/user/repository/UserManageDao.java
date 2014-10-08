package com.sargeras.user.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sargeras.login.vo.UserVo;

@Repository
public interface UserManageDao {
	public List<UserVo> viewUsers();
}
