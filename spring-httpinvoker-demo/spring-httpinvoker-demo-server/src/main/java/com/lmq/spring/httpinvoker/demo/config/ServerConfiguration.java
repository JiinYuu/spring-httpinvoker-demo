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
	
	/**
	 * 以HttpInvokerServiceExporter类型将我们的实现类注册到Spring容器，即可将我们的实现远程发布；<br/>
	 * 其中@Bean注解中参数即你想为这个服务定义的访问url，客户端需要通过这个url来访问我们的服务。
	 * @return
	 */
	@Bean("/remote/user-service")
	public HttpInvokerServiceExporter remoteUserService() {
		HttpInvokerServiceExporter service = new HttpInvokerServiceExporter();
		service.setService(userService);//置具体的实现类对象，客户端调用远程服务时，实际上调用的是这个对象里面的方法
		service.setServiceInterface(UserService.class);//服务实现的接口类型
		return service;
	}
	
}
