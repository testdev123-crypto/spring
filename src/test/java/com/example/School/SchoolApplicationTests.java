package com.example.School;

import com.example.School.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SchoolApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	RoleService roleService;
	@Test
	public void testAdd_positiveNumbers() {
// Test case: add two positive numbers
		int result= roleService.add(5, 3);
		assertEquals(8, result, "5 + 3 should equal 8");
	}


}
