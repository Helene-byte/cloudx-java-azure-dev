package com.chtrembl.petstore.order;

import com.chtrembl.petstore.order.api.StoreApiController;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(classes = StoreApiController.class)
//TODO
public class ServiceTests {


	@Test
	public void shouldReturnVersion() throws Exception {
		assertNotNull(6);
	}
}