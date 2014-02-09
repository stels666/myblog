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
public class LoginController {
	
	@RequestMapping({"/", "/login", "/index"})
	public String login(@ModelAttribute("model") ModelMap model){
		User user = SessionUtils.getCurrentUser();
		if(user == null){
			return "index";
		}else{
			List<User> list = StorageServices.getUserService().getAll();
			model.addAttribute("animals", list);
			return "home";
		}
	}

}
