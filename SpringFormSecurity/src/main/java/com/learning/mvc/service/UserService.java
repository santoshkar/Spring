package com.learning.mvc.service;

import java.util.List;

import com.learning.mvc.model.User;

/**
 * 
 * @author santoshkumarkar
 *
 */
public interface UserService {

	User findById(int id);
	List<User> findAll();
	User findByUserName(String name);
}
