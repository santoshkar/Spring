package com.learning.mvc.dao;

import java.util.List;
import java.util.Set;

import com.learning.mvc.model.Role;
import com.learning.mvc.model.User;

/**
 * 
 * @author santoshkumarkar
 *
 */
public interface UserDao {

	List<User> findAll();

	User findById(int id);
	
	User findByUserName(String userName);

//	Set<Role> findRolesByUserId(int id);
	
}
