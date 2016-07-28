package org.spring.boot.dubbox.sample.consumer.service;

import org.spring.boot.dubbox.sample.api.user.UserService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class UserServiceRPC {
	@Reference
	private UserService userService;
	public UserService getUserService() {
		return  userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

}
