package com.myblog.services.login;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.myblog.models.User;
import com.myblog.services.ServicesStore;

public class UserLoginService implements UserDetailsService {

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = ServicesStore.getUserService().getByEmail(email);
		if(user == null){
			throw new UsernameNotFoundException("Invalid user");
		}
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		grantedAuthorities.add(new SimpleGrantedAuthority(user.getPermission().name()));
		
		return new SpringUserImpl(user, grantedAuthorities);
	}

}
