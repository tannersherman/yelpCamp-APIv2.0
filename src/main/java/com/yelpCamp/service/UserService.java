package com.yelpCamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yelpCamp.dao.CampgroundDao;
import com.yelpCamp.entity.User;


@Service
public class UserService implements UserInterface{

	@Autowired
	@Qualifier("MySQLData")
	private CampgroundDao userDao;

	public void save(User user) {
		userDao.save(user);
	}

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public void deleteUserById(long userId) {
		userDao.deleteUserById(userId);
		
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}
}
