package org.spring.boot.dubbox.sample.provider.user;

import org.spring.boot.dubbox.sample.api.user.User;
import org.spring.boot.dubbox.sample.api.user.UserService;

import com.alibaba.dubbo.config.annotation.Service;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		User user = new User();
		user.setAge(20);
		user.setId(1);
		user.setName("chenlei");
		return user;
	}

}
