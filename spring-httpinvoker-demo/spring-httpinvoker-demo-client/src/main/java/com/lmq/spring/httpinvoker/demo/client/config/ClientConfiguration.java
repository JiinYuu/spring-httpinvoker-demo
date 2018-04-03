package com.lmq.spring.httpinvoker.demo.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.lmq.spring.httpinvoker.demo.common.api.UserService;

@Configuration
public class ClientConfiguration {

	@Bean("userService")
	public HttpInvokerProxyFactoryBean remoteUserService() {
		HttpInvokerProxyFactoryBean service = new HttpInvokerProxyFactoryBean();
		service.setServiceInterface(UserService.class);
		service.setServiceUrl("http://localhost:8080/remote/user-service");
		return service;
	}
}
