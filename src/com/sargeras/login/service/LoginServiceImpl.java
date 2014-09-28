package com.sargeras.login.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.sargeras.login.repository.LoginDao;
import com.sargeras.login.vo.UserVo;

public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	public int register(UserVo userVo){
		return loginDao.register(userVo);
	}
}
