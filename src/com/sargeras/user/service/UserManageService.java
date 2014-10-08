package com.sargeras.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sargeras.login.vo.UserVo;

@Service
public interface UserManageService {
	public List<UserVo> viewUsers();
}
