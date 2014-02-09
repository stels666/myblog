package com.myblog.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myblog.dao.UserDAO;
import com.myblog.models.User;
import com.myblog.services.UserService;

@Service
@Transactional(readOnly=true)
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDAO getDAO() {
		return userDAO;
	}

	public User getByLoginOrEmail(String loginOrEmail) {
		return getDAO().getByLoginOrEmail(loginOrEmail);
	}

}
