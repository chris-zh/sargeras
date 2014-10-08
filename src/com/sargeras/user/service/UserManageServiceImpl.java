package com.sargeras.user.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.sargeras.login.vo.UserVo;
import com.sargeras.user.repository.UserManageDao;

public class UserManageServiceImpl implements UserManageService{
	@Autowired
	private UserManageDao userDao;
	@Override
	public List<UserVo> viewUsers() {
		return userDao.viewUsers();
	}

}
