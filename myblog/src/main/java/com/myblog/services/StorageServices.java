package com.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;

public class StorageServices {
	
	private static final StorageServices singleton = new StorageServices();
	
	@Autowired
	private UserService userService;

	
	public static UserService getUserService(){
		return getSingleton().userService;
	}

	public static StorageServices getSingleton() {
		return singleton;
	} 

}
