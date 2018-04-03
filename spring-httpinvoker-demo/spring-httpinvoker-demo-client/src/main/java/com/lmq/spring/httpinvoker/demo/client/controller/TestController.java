package com.lmq.spring.httpinvoker.demo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lmq.spring.httpinvoker.demo.common.api.UserService;
import com.lmq.spring.httpinvoker.demo.common.model.User;

@RestController
public class TestController {

	private @Autowired UserService userService;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		return ResponseEntity.ok(this.userService.getUser(id));
	}
}
