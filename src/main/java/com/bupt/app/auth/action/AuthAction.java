package com.bupt.app.auth.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bupt.app.auth.service.AuthService;
@Controller
@RequestMapping("/auth")
public class AuthAction {
	//将spring 配置文件中的bean 通过setter注入进来
	@Resource(name="authService")
	private AuthService authService=null;
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+password);
		boolean flag= authService.validate(username, password);
		System.out.println(flag);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the result.jsp+++++++++++++");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++");
		return "result";
	}
	

	public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}




}
