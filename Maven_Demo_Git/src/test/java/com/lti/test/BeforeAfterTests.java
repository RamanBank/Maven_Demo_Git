package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTests {
	
	Calculator c = new Calculator();
	int sum;
	
	@BeforeAll
	public static void testDBConn() {
		System.out.println("DB is connected");
	}
	
	@BeforeEach
	public void testStartup() {
		
		sum = 0;
		System.out.println("sum is initialized to zero");
	}

	@Test
	public void testAdd() {
		sum  = c.add(100, 200);
		Assertions.assertEquals(300, sum);
		
	}
	
	@Test
	public void testAdd1() {
	    sum  = c.add(100, 200);
		Assertions.assertEquals(300, sum);
		
	}
	
	@AfterEach
	public void testShutDown() {
		sum = 0;
		System.out.println("shut down");
	}
	
	@AfterAll
	public static void testshutDB() {
		System.out.println("DB is shut down");
	}

}
