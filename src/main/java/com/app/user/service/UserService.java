package com.app.user.service;

import com.app.common.value.objects.User;

public interface UserService {

	void addMember(User user);
	
	User findUserByEmail(String email);
	
}
