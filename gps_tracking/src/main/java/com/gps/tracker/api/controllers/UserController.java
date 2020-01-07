package com.gps.tracker.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gps.tracker.api.models.User;
import com.gps.tracker.api.services.UserServiceImpl;


@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping(value = "/getUser/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping(value = "/getAllUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
}
