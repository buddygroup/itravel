package com.app.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.value.objects.GroupInfo;
import com.app.common.value.objects.UserDetail;

@Controller
public class UserController {
	
	//Adding new member to create a new group
	@RequestMapping(value="/addMember", method = RequestMethod.PUT)
	@ResponseBody
	public String addMember(@RequestBody UserDetail userDetail) {
		System.out.println("add user "+userDetail.getName());
		return "success";

	}
	
	//Adding new group
	@RequestMapping(value="/createGroup", method = RequestMethod.PUT)
	@ResponseBody
	public String addNewGroup(@RequestBody GroupInfo grpInfo) {
		System.out.println("add user "+grpInfo.getGrpName());
		
		return "success";

	}
	
	//Home Page lending
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getHome() {
		System.out.println("I am in home");
		return "redirect:/static/views/Home.html";

	}
}
