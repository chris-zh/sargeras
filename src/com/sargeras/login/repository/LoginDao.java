package com.sargeras.login.repository;

import java.util.List;

import com.sargeras.login.vo.UserVo;
public interface LoginDao {
	public int register(UserVo userVo);
	public List<UserVo> toLogin(UserVo userVo);
	public int validateLogin(UserVo userVo);
}
