package com.gps.tracker.api.repos;

import org.springframework.stereotype.Repository;

import com.gps.tracker.api.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findUserById(String id);
}