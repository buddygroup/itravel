package com.app.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.value.objects.GroupInfo;
import com.app.user.service.GroupService;
import com.app.user.service.UserService;

/**
 * Controller for User related activity.
 * 
 * @author hgaur2
 *
 */
@Controller
public class GroupController {
	@Autowired
	UserService userService;
	@Autowired
	GroupService groupService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	// Adding new group
	@RequestMapping(value = "/createGroup", method = RequestMethod.PUT)
	@ResponseBody
	public String addNewGroup(@RequestBody GroupInfo grpInfo) {
		System.out.println("add user " + grpInfo.getGrpName());
		groupService.addGroup(grpInfo);
		return "success";
	}
	
	@RequestMapping(value = "/getGroups", method = RequestMethod.PUT)
	@ResponseBody
	public List<GroupInfo> getGroup() {
		return groupService.getGroups();

	}

}
