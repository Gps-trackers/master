package com.gps.tracker.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gps.tracker.api.models.User;
import com.gps.tracker.api.repos.UserRepository;
import com.gps.tracker.api.services.abstractservices.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepos;
	
	@Override
	public User getUserById(String userId) {
		return userRepos.findUserById(userId);
	}

	@Override
	public List<User> getUsers() {
		return userRepos.findAll();
	}


}
