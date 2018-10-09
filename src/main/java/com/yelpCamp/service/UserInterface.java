package com.yelpCamp.service;

import org.springframework.beans.factory.annotation.Qualifier;

import com.yelpCamp.entity.User;

public interface UserInterface {
	@Qualifier("MySQLData")
	void save(User user);

	User findByEmail(String email);

}