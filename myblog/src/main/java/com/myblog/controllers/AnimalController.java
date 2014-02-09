package com.myblog.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myblog.models.User;
import com.myblog.services.StorageServices;
import com.myblog.utils.SessionUtils;

@Controller
public class AnimalController {
	

	@RequestMapping({"/home"})
	public String home(@ModelAttribute("model") ModelMap model){
		
		List<User> list = StorageServices.getUserService().getAll();
		model.addAttribute("animals", list);
		
		return "home";
	}
	
	@RequestMapping({"/test"})
	public String test(@ModelAttribute("model") ModelMap model){
		List<User> list = StorageServices.getUserService().getAll();
		model.addAttribute("animals", list);
		SessionUtils.getCurrentUser();
		
		return "home";
	}

	
	@RequestMapping({"/error"})
	public String home(){
		return "error";
	}
}
