package com.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myblog.models.User;
import com.myblog.utils.SessionUtils;
import com.myblog.viewmodels.HomeUserViewModel;

@Controller
public class HomeUserController {
	
	@RequestMapping({"/user"})
	public String homeUser(@ModelAttribute("model") ModelMap model){
		
		User user = SessionUtils.getCurrentUser();
		model.addAttribute("vm", new HomeUserViewModel(user.getId()));
		
		return "home_user";	
	}

}
