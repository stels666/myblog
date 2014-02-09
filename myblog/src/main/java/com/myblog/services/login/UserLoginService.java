package com.myblog.services.login;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.myblog.models.User;
import com.myblog.services.StorageServices;

public class UserLoginService implements UserDetailsService {

	public UserDetails loadUserByUsername(String loginOrEmail) throws UsernameNotFoundException {
		User user = StorageServices.getUserService().getByLoginOrEmail(loginOrEmail);
		if(user == null){
			throw new UsernameNotFoundException("Invalid user");
		}
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		return new SpringUserImpl(user, grantedAuthorities);
	}

}
