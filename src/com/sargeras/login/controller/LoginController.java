/**
 * 
 */
package com.sargeras.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sargeras.login.service.LoginService;
import com.sargeras.login.vo.UserVo;
import com.sargeras.pub.controller.BaseController;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController{
	@Autowired
	private LoginService service;
	@RequestMapping(value = "validate")
	public void toLogin(HttpServletResponse response) throws Exception {
		logger.error("hhhh");
		response.getWriter().print(" this is to logging 1");
	}
	@RequestMapping(value="register")
	public void register(HttpServletRequest request,HttpServletResponse response) throws Exception{
		UserVo user = new UserVo();
		int result = 0;
		String userName = (String)request.getParameter("usernamesignup");
		String userPassword = (String)request.getParameter("passwordsignup_confirm");
		String userEmail = (String)request.getParameter("emailsignup");
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserEmail(userEmail);
		result = service.register(user);
		if(result == 1){
			response.getWriter().print("Success");
		}
	}
}
