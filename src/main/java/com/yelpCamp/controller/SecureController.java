package com.yelpCamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yelpCamp.entity.User;
import com.yelpCamp.service.UserService;

@RestController
@RequestMapping("/secure/user")
public class SecureController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String loginSuccess() {
		return "Login Successful!";
	}

	@RequestMapping(value = "/email", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User findByEmail(@RequestBody User user) {
		String email = user.getEmail();
		return userService.findByEmail(email);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable("userId") long userId) {
		userService.deleteUserById(userId);
	}
}
