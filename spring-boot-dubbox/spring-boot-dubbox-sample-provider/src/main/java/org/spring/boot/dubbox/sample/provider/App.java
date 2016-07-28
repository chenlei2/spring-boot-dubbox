package org.spring.boot.dubbox.sample.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication()
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
