package com.myblog.services.login;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SpringUserImpl extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8877293013187530932L;

	public SpringUserImpl(com.myblog.models.User user, Collection<GrantedAuthority> grantedAuthorities) {
		super(user.getEmail(), user.getPassword(), true, true, true, true, grantedAuthorities);
	}

}
