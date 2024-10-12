package com.micro.hotel.HotelService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // This will pick up the test profile (using H2 DB)
public class HotelServiceApplicationTests {
	@Test
	void contextLoads() {
	}
}
