package com.app.user.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.app.common.configuration.Role;
import com.app.common.value.objects.User;
import com.app.user.service.LoginService;
import com.app.user.service.UserService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserService userService;
	
	@Override
	public List<Role> checkLogin(String userName, String password) {
		User user =userService.findUserByEmail(userName);		
		
			if (!userName.equals(user.getEmail())) {
	            throw new BadCredentialsException("Username not found.");
	        }
	 
	        if (!password.equals(user.getPassword())) {
	            throw new BadCredentialsException("Wrong password.");
	        }

		List<Role> roles = new LinkedList<Role>();
        Role role = new Role();
        role.setName("ROLE_USER");
        roles.add(role);

		return roles;
	}

}
