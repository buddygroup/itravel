package com.app.user.service;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.persistance.UserDaoImpl;
import com.app.common.value.objects.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDaoImpl userDao;
	@Override
	public void addMember(User user) {
		user.setCreateDate(new LocalDate());
		userDao.save(user);
	}

}
