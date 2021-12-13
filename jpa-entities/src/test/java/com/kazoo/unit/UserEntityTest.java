package com.kazoo.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kazoo.entities.User;

class UserEntityTest {

	@Test
	void test() {
		User user1 = new User();
		user1.setId(1001L);
		assertEquals( user1.getId(), 1001L);
	}

}
