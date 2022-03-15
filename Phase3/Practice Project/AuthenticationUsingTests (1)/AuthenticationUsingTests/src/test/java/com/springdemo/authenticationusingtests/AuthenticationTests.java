package com.springdemo.authenticationusingtests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthenticationTests {

	Authentication auth;
	@BeforeEach
	void setUp() throws Exception {
		auth = new Authentication();
		System.out.println("Object Created");
	}

	@AfterEach
	void tearDown() throws Exception {
		auth = null;
		System.out.println("Object Destroyed");
	}

	
	@Test
	void AuthTestPositive()
	{
		assertTrue(auth.checkUser("Bhavikrpatel35@gmail.com", "Bhavik@69"));
	}
	
	@Test
	void AuthTestNegative()
	{
		assertFalse(auth.checkUser("Wadiya@gmail.com", "bhavik123"));
	}
}
