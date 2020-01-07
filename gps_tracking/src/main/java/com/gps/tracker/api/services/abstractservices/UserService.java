package com.gps.tracker.api.services.abstractservices;


import java.util.List;

import com.gps.tracker.api.models.User;

public interface UserService {
	
	public User getUserById(String userId);
	public List<User> getUsers();
	
}
