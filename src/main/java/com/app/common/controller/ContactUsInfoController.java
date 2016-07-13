package com.app.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.value.objects.ContactUsInfo;

@Controller
public class ContactUsInfoController {
	
	@RequestMapping(value ="/contactUsInfo", method= RequestMethod.PUT)
	@ResponseBody
	public ContactUsInfo submitContactUsInfo(@RequestBody ContactUsInfo lContactUsInfo){
		
		lContactUsInfo.getEmail();
		lContactUsInfo.getName();
		lContactUsInfo.setMessage("Thanks "+ lContactUsInfo.getName()+ "we will get back to you shortly");
		return lContactUsInfo;
	}

}
