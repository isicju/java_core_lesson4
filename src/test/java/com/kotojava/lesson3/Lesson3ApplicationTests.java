package com.kotojava.lesson3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(properties = {
		"hostname=localhost",
		"port=5432",
		"database=test_db",
		"username=test_user",
		"password=test_password"
})
class Lesson3ApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		System.out.println("running simple test...");
		assertNotNull(context);
	}

}
