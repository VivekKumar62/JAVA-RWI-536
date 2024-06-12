package com.tut.mymvcproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHomeController {
    @RequestMapping("/home")
    public String home(Model m) {
        m.addAttribute("name", "vivek");
        m.addAttribute("roll", 135); 
        
        	List<String> list=new ArrayList<String>();
        	list.add("railworld");
        	list.add("india");
        	list.add("Shivam");
        	list.add("ashish");
        	m.addAttribute("namelist",list);
        	
        return "home";
    }
    
    @RequestMapping("/login")
    public ModelAndView loginPage() {
    	
    	ModelAndView model = new ModelAndView();
    	model.addObject("Class","12th class");
    	model.addObject("regnumber",62016);
    	
    	List<String> list=new ArrayList<String>();
    	list.add("railworld");
    	list.add("india");
    	list.add("Shivam");
    	list.add("ashish");
    	model.addObject("namelist",list);
    	
    	model.setViewName("login");
    	
        return model;
    }
}
