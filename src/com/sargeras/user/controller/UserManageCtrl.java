package com.sargeras.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sargeras.login.vo.UserVo;
import com.sargeras.pub.controller.BaseController;
import com.sargeras.user.service.UserManageService;

@Controller
@RequestMapping(value="/user")
public class UserManageCtrl extends BaseController{
	@Autowired
	private UserManageService userService;
	@RequestMapping(value="/viewUsers")
	public ModelAndView viewUsers(HttpServletRequest request,HttpServletResponse response){
		List<UserVo> userList = new ArrayList<UserVo>();
		ModelAndView mav = new ModelAndView();
		userList = userService.viewUsers();
		mav.setViewName("jsp/admin/admin");
		mav.addObject("userList",userList);
		request.setAttribute("userList", userList);
		return mav;
	}

}
