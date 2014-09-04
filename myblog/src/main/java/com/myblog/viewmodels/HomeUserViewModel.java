package com.myblog.viewmodels;

import com.myblog.models.User;
import com.myblog.services.ServicesStore;

public class HomeUserViewModel {
	
	private User user;
	
	public HomeUserViewModel(Long id) {
		user = ServicesStore.getUserService().get(id);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
