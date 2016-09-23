package com.app.user.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.dao.entity.UsersEntity;
import com.app.common.dao.repository.UserRepository;

/**
 * 
 * @author Rudra
 * 
 */
@Service
public class UserUtility {

	@Autowired
	private UserRepository lUserRepo;

	/**
	 * Providing default user now but will provide logged in user in future.
	 * 
	 * @return
	 */
	public UsersEntity getLoggedInUser() {
		return lUserRepo.findOne(2);
	}
}
