package com.sargeras.login.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sargeras.login.vo.UserVo;
@Service
public interface LoginService {
	public int register(UserVo userVo);
	public List<UserVo> toLogin(UserVo userVo);
	public int validateLogin(UserVo vo);
}
