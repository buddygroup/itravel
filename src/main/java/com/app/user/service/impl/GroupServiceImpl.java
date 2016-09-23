package com.app.user.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.common.dao.entity.GroupsEntity;
import com.app.common.dao.repository.GroupsJpaRepository;
import com.app.common.value.objects.GroupInfo;
import com.app.user.service.GroupService;
import com.app.user.util.UserUtility;

/**
 * 
 * This is service class used to provide services for User Interface.
 * 
 * This class store user member to DB and Retrieve them from DB
 * 
 * @author Rudra
 * 
 */
@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private UserUtility userUtility;
	@Autowired
	private GroupsJpaRepository groupJpsRepo;

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void addGroup(GroupInfo group) {
		GroupsEntity groupsEntity = new GroupsEntity();
		groupsEntity.setCreateDate(Calendar.getInstance().getTime());
		groupsEntity.setGroupCode(group.getGrpTypes());
		groupsEntity.setGroupDescription(group.getGrpName());
		groupsEntity.setGroupName(group.getGrpName());
		groupsEntity.setPublic(Boolean.TRUE);
		groupsEntity.setUsers(userUtility.getLoggedInUser());
		groupJpsRepo.saveAndFlush(groupsEntity);
	}

}
