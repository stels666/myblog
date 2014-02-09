package com.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myblog.models.User;
import com.myblog.utils.SessionUtils;
import com.myblog.viewmodels.HomeAdminViewModel;

@Controller
public class HomeAdminController {
	
	@RequestMapping({"/admin"})
	public String homeAdmin(@ModelAttribute("model") ModelMap model){
		
		User user = SessionUtils.getCurrentUser();
		model.addAttribute("vm", new HomeAdminViewModel(user.getId()));
		
		return "admin_user";	
	}

}
