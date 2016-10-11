package com.app.user.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.common.dao.entity.UsersEntity;
import com.app.common.dao.repository.UserRepository;
import com.app.common.value.objects.User;
import com.app.user.service.UserService;
/**
 * @author Rudra
 * This is service class used to provide services for User Interface.
 * 
 * This class store user member to DB and Retrieve them from DB
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private	UserRepository lUserRepo;
	
	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void addMember(User user) {
	
			UsersEntity lUserEntity = new UsersEntity();
			lUserEntity.setCreateDate(Calendar.getInstance().getTime());
			lUserEntity.setEmail(user.getEmail());
			lUserEntity.setLocation(user.getLocation());
			
			lUserEntity.setPassword(user.getPassword());
			lUserEntity.setUser(user.getName());
			lUserRepo.saveAndFlush(lUserEntity);
	}


	@Override
	public User findUserByEmail(String email) {
		UsersEntity lUserEntity =lUserRepo.findByEmail(email).get(0);
		User user = new User();
		user.setName(lUserEntity.getUser());
		user.setPassword(lUserEntity.getPassword());
		user.setLocation(lUserEntity.getLocation());
		user.setEmail(lUserEntity.getEmail());
		return user;
	}

	
	
}
