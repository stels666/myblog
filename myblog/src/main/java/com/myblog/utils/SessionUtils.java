package com.myblog.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.myblog.models.User;
import com.myblog.services.ServicesStore;

public class SessionUtils {
	
	public static User getCurrentUser(){
		Authentication auth = null;
		User user = null;
		if(SecurityContextHolder.getContext() != null){
			auth = SecurityContextHolder.getContext().getAuthentication();
		}
		
		if(auth != null && auth.getPrincipal() instanceof org.springframework.security.core.userdetails.User){
			org.springframework.security.core.userdetails.User pr = (org.springframework.security.core.userdetails.User) auth.getPrincipal();
			pr.getUsername();
			if(pr.getUsername() != null){
				user = ServicesStore.getUserService().getByEmail(pr.getUsername());
			}
		}
		return user;
	}

}
