package com.org.project.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.project.sample.bean.User;
import com.org.project.sample.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}

	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}

	public void deleteUser(User user) {
		userRepo.delete(user);
	}

	public User getUserById(int id) {
		Optional<User> user = userRepo.findById(id);
		return user.orElseThrow(() -> new RuntimeException("Couldn't find a User with id: " + id));
	}

	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

}
