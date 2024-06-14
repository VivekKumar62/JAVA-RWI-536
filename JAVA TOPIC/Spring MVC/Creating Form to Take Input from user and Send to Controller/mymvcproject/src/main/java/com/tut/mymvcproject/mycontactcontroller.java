package com.tut.mymvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mycontactcontroller {
@RequestMapping("/mycontact")
	public String showform() {
		
		return "mycontact";
	}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@RequestParam("email")String userEmail,
		@RequestParam("username")String userName,
		@RequestParam("password") String userpassword,Model model) {
	System.out.println("user email:-  " +userEmail);
	System.out.println("user name:-  "+userpassword);
	System.out.println("user password:-  "+userpassword);
	model.addAttribute("name",userName);
	model.addAttribute("email",userEmail);
	model.addAttribute("password",userpassword);
	return"success";
}}

