package com.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicesStore {
	
	private static final ServicesStore singleton = new ServicesStore();
	
	@Autowired
	private UserService userService;

	
	public static UserService getUserService(){
		return getSingleton().userService;
	}

	public static ServicesStore getSingleton() {
		return singleton;
	} 

}
