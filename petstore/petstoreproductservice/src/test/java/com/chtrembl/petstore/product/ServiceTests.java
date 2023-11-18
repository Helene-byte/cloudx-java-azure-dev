package com.chtrembl.petstore.product;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest

public class ServiceTests {


	@Test
	public void shouldReturnVersion()  {
		assertEquals(1,1,"Values should match");
	}
}