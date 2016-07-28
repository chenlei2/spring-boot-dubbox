package org.spring.boot.dubbox.sample.consumer;

import org.spring.boot.dubbox.sample.api.user.User;
import org.spring.boot.dubbox.sample.consumer.service.UserServiceRPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication()
public class App {
	@Autowired
	private UserServiceRPC userServiceRPC;

	@RequestMapping("/hello")
	User home() {
		return userServiceRPC.getUserService().getUser();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
