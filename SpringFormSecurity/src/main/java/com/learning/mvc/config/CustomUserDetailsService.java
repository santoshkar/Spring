package com.learning.mvc.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.mvc.model.Role;
import com.learning.mvc.model.User;
import com.learning.mvc.service.UserService;

/**
 * 
 * @author santoshkumarkar
 *
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Transactional()
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("Username not found");
		}
		org.springframework.security.core.userdetails.User u = new org.springframework.security.core.userdetails.User(
				user.getUsername(), 
				user.getPassword(), true, true, true, true,
				getGrantedAuthorities(user));
		return u;
	}

	private List<GrantedAuthority> getGrantedAuthorities(User user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		Set<Role> roles = user.getRoles();

		for(Role role : roles){
			authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRole()));
		}
		
		System.out.println(authorities);
		return authorities;
	}

}
