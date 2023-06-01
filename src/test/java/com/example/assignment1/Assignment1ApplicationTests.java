package com.example.assignment1;

import com.example.assignment1.user.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.nullValue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Assignment1ApplicationTests {

	IUserService service = new UserServiceImpl(new MemoryUserRepo());

	@Test
	void join() {

		User user1 = new User(1L, "user1", Grade.VIP);
		User user2 = new User(2L, "user2", Grade.BASIC);
		User user3 = new User(2L, "user3", Grade.BASIC);

		var res = service.join(user1);
		assertThat(true).isEqualTo(res);
		assertThat(user1).isEqualTo(service.findUser(user1.getId()));

		res = service.join(user2);
		assertThat(true).isEqualTo(res);
		assertThat(user2).isEqualTo(service.findUser(user2.getId()));

		res = service.join(user3);
		assertThat(false).isEqualTo(res);
	}

	@Test
	void createOrder() {

		// init.
		User user1 = new User(1L, "user1", Grade.BASIC);
		User user2 = new User(2L, "user2", Grade.VIP);

		service.join(user1);
		service.join(user2);

		// Order basicOrder = new Order(user1, "mac-book", 1000000);
		// Order vipOrder = new Order(user2, "mac-book", 1000000);

		// IOrderService orderService = new Order();
	}

}
