package com.ciq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.bean.UserBean;
import com.ciq.enitity.User;
import com.ciq.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/rest")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<User> addRole(@RequestBody UserBean userBean) {
		return ResponseEntity.ok(userService.save(userBean));

	}

	@GetMapping("/user")
	public User findAll(User user) {
		return user;
	}
	
}