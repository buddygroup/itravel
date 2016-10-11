package com.app.user.service;

import com.app.common.dao.entity.UsersEntity;
import com.app.common.value.objects.User;

public interface UserService {

	void addMember(User user);
	
	UsersEntity getLoggedInUser();
	
	User findUserByEmail(String email);
	
}
