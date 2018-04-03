package com.lmq.spring.httpinvoker.demo.common.api;

import com.lmq.spring.httpinvoker.demo.common.model.User;

public interface UserService {

	User getUser(Long id);
}
