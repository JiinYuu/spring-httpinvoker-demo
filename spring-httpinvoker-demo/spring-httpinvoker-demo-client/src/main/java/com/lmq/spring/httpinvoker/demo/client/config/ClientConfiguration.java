package com.lmq.spring.httpinvoker.demo.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.lmq.spring.httpinvoker.demo.common.api.UserService;

@Configuration
public class ClientConfiguration {

	/**
	 * 以HttpInvokerProxyFactoryBean类型注入远程服务
	 * @return
	 */
	@Bean
	public HttpInvokerProxyFactoryBean remoteUserService() {
		HttpInvokerProxyFactoryBean service = new HttpInvokerProxyFactoryBean();
		service.setServiceInterface(UserService.class);//服务实现的接口类型，我们可以在使用的地方直接注入该类型bean
		service.setServiceUrl("http://localhost:8080/remote/user-service");//远程服务地址
		return service;
	}
}
