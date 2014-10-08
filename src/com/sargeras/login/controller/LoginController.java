/**
 * 
 */
package com.sargeras.login.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public String toLogin(HttpServletRequest request,HttpServletResponse response) throws Exception {
		UserVo user = new UserVo();
		int validate = 0;
		List<UserVo> list = new ArrayList();
		HttpSession session = request.getSession();
		user.setUserName((String)request.getParameter("username"));
		user.setUserPassword((String)request.getParameter("password"));
		validate = service.validateLogin(user);
		if(validate>0){
			list = service.toLogin(user);
			user = list.get(0);
			session.setAttribute("user",user);
			return "jsp/admin/admin";
		}else{
			response.getWriter().print(" login fail,check username or password");
		}
		return null;
		
		
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
	/**
	 * ×¢ÏúµÇÂ¼
	 * @param request
	 * @return
	 */
	@RequestMapping(value="logout")
	public String logout(HttpServletRequest request){
		System.out.println("session:"+request.getSession().getAttribute("user"));
		request.getSession().removeAttribute("user");
		System.out.println("session:"+request.getSession().getAttribute("user"));
		return "index";
	} 
}
