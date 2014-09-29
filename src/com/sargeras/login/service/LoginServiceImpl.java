package com.sargeras.login.service;

import java.util.List;

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
	@Override
	public List<UserVo> toLogin(UserVo userVo) {
		return loginDao.toLogin(userVo);
	}
	@Override
	public int validateLogin(UserVo vo) {
		return loginDao.validateLogin(vo);
	}
	
}
