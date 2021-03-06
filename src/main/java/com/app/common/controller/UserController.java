package com.app.common.controller;

import java.security.Principal;

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
	
	@RequestMapping("/home")
	  public String home() {
	    return "redirect:/static/views/Home.html";
	  }
	
	@RequestMapping("/user")
	@ResponseBody
	  public User user(Principal user) {
	    return userService.findUserByEmail(user.getName());
	  }

	// Home Page lending
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() {
		System.out.println("I am in home");
		return "redirect:/static/views/Home.html";

	}
}
