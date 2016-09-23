package com.app.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.value.objects.GroupInfo;
import com.app.common.value.objects.User;
import com.app.user.service.GroupService;
import com.app.user.service.UserService;

/**
 * Controller for User related activity.
 * 
 * @author hgaur2
 *
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	GroupService groupService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Creates member in database.
	 * 
	 * @param user
	 *            user object
	 * @return success string
	 */
	@RequestMapping(value = "/addMember", method = RequestMethod.PUT)
	@ResponseBody
	public String addMember(@RequestBody User user) {
		userService.addMember(user);
		return "success";

	}

	// Adding new group
	@RequestMapping(value = "/createGroup", method = RequestMethod.PUT)
	@ResponseBody
	public String addNewGroup(@RequestBody GroupInfo grpInfo) {
		System.out.println("add user " + grpInfo.getGrpName());
		groupService.addGroup(grpInfo);
		return "success";

	}

	// Home Page lending
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() {
		System.out.println("I am in home");
		return "redirect:/static/views/Home.html";

	}
}
