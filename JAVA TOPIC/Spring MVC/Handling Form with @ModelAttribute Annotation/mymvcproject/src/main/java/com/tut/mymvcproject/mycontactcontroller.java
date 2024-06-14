package com.tut.mymvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tut.model.User;

@Controller
public class mycontactcontroller {
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Hello all welcome to my page ");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding common data to model");
	}
@RequestMapping("/mycontact")
	public String showform() {
		
		return "mycontact";
	}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@ModelAttribute User user, Model model) {
	System.out.println(user);
//	model.addAttribute("user",user);
	
	return"success";
}


}

