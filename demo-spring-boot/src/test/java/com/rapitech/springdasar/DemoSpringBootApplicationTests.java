package com.rapitech.springdasar;

import com.rapitech.springdasar.config.HelloWorldConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

@SpringBootTest
class DemoSpringBootApplicationTests {
	@Test
	void contextLoads() {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		Assertions.assertNotNull(context);
	}

}
