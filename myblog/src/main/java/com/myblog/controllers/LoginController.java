package com.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myblog.models.User;
import com.myblog.models.User.UserPermission;
import com.myblog.utils.SessionUtils;
import com.myblog.viewmodels.HomeAdminViewModel;
import com.myblog.viewmodels.HomeUserViewModel;

@Controller
public class LoginController {
	
	@RequestMapping({"/", "/login", "/index"})
	public String login(@ModelAttribute("model") ModelMap model){
		
		User user = SessionUtils.getCurrentUser();
		
		if(user == null){
			return "index";
		}else if (user.getPermission().equals(UserPermission.ROLE_USER)) {
			model.addAttribute("vm", new HomeUserViewModel(user.getId()));
			return "home_user";	
		}else if(user.getPermission().equals(UserPermission.ROLE_ADMIN)){
			model.addAttribute("vm", new HomeAdminViewModel(user.getId()));
			return "home_admin";
		}else{
			return "error";
		}
	}

}
