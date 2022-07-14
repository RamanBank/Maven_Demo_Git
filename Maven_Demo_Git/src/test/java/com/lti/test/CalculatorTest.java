package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	Calculator c = new Calculator();
	
	
	
	@Test
	public void testAdd() {
		int r  = c.add(100, 200);
		Assertions.assertEquals(300, r,"Ha Ha Ha");
		
	}
	
	
	@Test
	public void testAssertFalse() {
          Assertions.assertEquals("Hello", "Hello");
          Assertions.assertFalse("Raman".length() == 5);
          Assertions.assertFalse(100<30,"10 is not greater than 30");
	}
	
	@Disabled
	@Test
	public void testAssertNull() {
		String str1 = null;
		String str2 = "abc";
		
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	@Disabled
	@Test
	public void testArrayList() {
		ArrayList<Integer> a = new ArrayList<>();
		Assertions.assertEquals(0,a.size());
		a.add(10);
		a.add(20);
		Assertions.assertEquals(2, a.size());
		
	}
	
	 @Disabled
	 @Test
	  void testException1() {

		  Calculator c= new Calculator();
		  
		  final Exception e = assertThrows(ArithmeticException.class, () -> {
			  c.searchEmpId(0);
	    
	    });
	
	

}
