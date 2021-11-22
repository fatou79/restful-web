package com.fatou.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.rest.webservices.restfulwebservices.diop.User;
import com.fatou.rest.webservices.restfulwebservices.diop.UserDaoService;

@RestController
public class UserController {

	
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		return service.findOne(id);
	}
	
}
