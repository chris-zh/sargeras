package com.sargeras.login.service;

import org.springframework.stereotype.Service;

import com.sargeras.login.vo.UserVo;
@Service
public interface LoginService {
	public int register(UserVo userVo);
}
