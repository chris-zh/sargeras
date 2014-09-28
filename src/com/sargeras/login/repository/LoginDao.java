package com.sargeras.login.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sargeras.login.vo.UserVo;
public interface LoginDao{
	public int register(UserVo userVo);

}
