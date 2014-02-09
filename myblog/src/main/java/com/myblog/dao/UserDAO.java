package com.myblog.dao;

import com.myblog.models.User;

public interface UserDAO extends AbstractDAO<User> {

	public User getByLoginOrEmail(String loginOrEmail);
	
}
