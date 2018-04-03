package com.lmq.spring.httpinvoker.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.lmq.spring.httpinvoker.demo.common.api.UserService;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ServerConfiguration {

	private final UserService userService;
	
	@Bean("/remote/user-service")
	public HttpInvokerServiceExporter remoteUserService() {
		HttpInvokerServiceExporter service = new HttpInvokerServiceExporter();
		service.setService(userService);
		service.setServiceInterface(UserService.class);
		return service;
	}
	
}
