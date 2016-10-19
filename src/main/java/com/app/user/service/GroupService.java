package com.app.user.service;

import java.util.List;

import com.app.common.value.objects.GroupInfo;

public interface GroupService {

	void addGroup(GroupInfo user);

	List<GroupInfo> getGroups();
}
