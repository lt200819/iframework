package com.bupt.app.auth.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bupt.app.auth.dao.UserMapper;
import com.bupt.app.auth.model.User;
import com.bupt.app.auth.model.UserExample;
import com.bupt.app.auth.model.UserExample.Criteria;
import com.bupt.app.auth.service.AuthService;

@Service("authService")
public class AuthServiceImpl implements AuthService{

	@Resource(name="userMapper")
	private UserMapper um;
	
	@Override
	public boolean validate(String username, String password) {
		UserExample ue = new UserExample();
		Criteria criteri = ue.createCriteria();
		criteri.andNameEqualTo(username);
		List<User> resultUserExcample = um.selectByExample(ue);
		if(resultUserExcample!=null&&resultUserExcample.size()>0){
			return true;
		}else{
			return false;
		}
	}

	public UserMapper getUm() {
		return um;
	}

	public void setUm(UserMapper um) {
		this.um = um;
	}
	
	
}
