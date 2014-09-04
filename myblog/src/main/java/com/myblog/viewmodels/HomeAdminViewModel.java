package com.myblog.viewmodels;

import java.util.List;

import com.myblog.models.User;
import com.myblog.services.ServicesStore;

public class HomeAdminViewModel {
	
	private List<User> users;
	
	private User user;
	
	public HomeAdminViewModel(Long id) {
		users = ServicesStore.getUserService().getAll();
		setUser(ServicesStore.getUserService().get(id));
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
