package com.app.user.service;

import java.util.List;

import com.app.common.configuration.Role;

public interface LoginService {

	List<Role> checkLogin(String userName, String password);
}
