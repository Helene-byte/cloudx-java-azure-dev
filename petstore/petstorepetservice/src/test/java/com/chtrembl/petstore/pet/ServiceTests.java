package com.chtrembl.petstore.pet;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
//TODO
public class ServiceTests {

	@Autowired
	private ApplicationContext context;
	@Test
	public void shouldGetByID()  {

		assertNotNull(6);
	}
}