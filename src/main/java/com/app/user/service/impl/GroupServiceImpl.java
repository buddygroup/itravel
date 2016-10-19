package com.app.user.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.common.dao.entity.GroupsEntity;
import com.app.common.dao.repository.GroupsJpaRepository;
import com.app.common.value.objects.GroupInfo;
import com.app.user.service.GroupService;
import com.app.user.service.UserService;

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
	private UserService userService;
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
		if(null==group.getGrpPics()&&group.getGrpPics().isEmpty()){
			groupsEntity.setGroupPics("/ITravel/static/img/about-4.jpg");
		}else{
			groupsEntity.setGroupPics(group.getGrpPics());
		}
		groupsEntity.setPublic(Boolean.TRUE);
		groupsEntity.setUsers(userService.getLoggedInUser());
		groupJpsRepo.saveAndFlush(groupsEntity);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<GroupInfo> getGroups() {
		List<GroupsEntity> entityList =groupJpsRepo.findAll();
		List<GroupInfo> groupList = new ArrayList<>(entityList.size());
		for (GroupsEntity entity : groupJpsRepo.findAll()) {
			groupList.add(getGroupFromEntity(entity));
			if(5==groupList.size()){
				break;
			}
		}
		return groupList;
	}
	
	private GroupInfo getGroupFromEntity(GroupsEntity entity){
		GroupInfo info = new GroupInfo();
		info.setAdminName(entity.getUsers().getUser());
		info.setGrpDesp(entity.getGroupDescription());
		info.setGrpName(entity.getGroupName());
		info.setGrpPics(entity.getGroupPics());
		info.setGrpTypes(entity.getGroupCode());
		info.setGrpVsble(entity.getPublic().toString());
		return info;
	}
	
}
