package com.app.common.configuration;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.app.user.service.LoginService;

@Component
public class CustomDBAuthenticationProvider implements AuthenticationProvider {
 
	@Autowired
	LoginService loginService;
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        System.out.println("running from custom");

        List<Role> roles = loginService.checkLogin(username, password);

   		User user = new User(username, password, roles);
   		System.out.println("paased from here");
        return new UsernamePasswordAuthenticationToken(user, password, roles);
    }
 
    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}