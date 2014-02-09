package com.myblog.services;

import com.myblog.models.User;

public interface UserService extends AbstractService<User>{

	public User getByLoginOrEmail(String loginOrEmail);
	
}
