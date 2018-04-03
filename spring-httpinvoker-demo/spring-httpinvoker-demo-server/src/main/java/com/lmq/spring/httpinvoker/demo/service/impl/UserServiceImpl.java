package com.lmq.spring.httpinvoker.demo.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.lmq.spring.httpinvoker.demo.common.api.UserService;
import com.lmq.spring.httpinvoker.demo.common.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(Long id) {
		return new User(1L, "罗明强", 31, "男", new Date());
	}

}
