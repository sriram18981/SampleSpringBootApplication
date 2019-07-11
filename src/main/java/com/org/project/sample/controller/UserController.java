package com.org.project.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.project.sample.bean.User;
import com.org.project.sample.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller for accepting requests for Users
 * 
 * @author Sriram
 *
 */
@RestController
@RequestMapping(path = "user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@PutMapping
	public void addUser(@RequestBody User user) {
		log.info("Got the user to add {} ", user);
		userService.addUser(user);

	}
	
	@GetMapping(path = "{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
		
	}
	
	@GetMapping
	public List<User> getAllusers(){
		return userService.getAllUsers();
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUserById(id);
	}
}
