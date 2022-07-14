package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Parameter {

	
	
	@ParameterizedTest
	@DisplayName("Should pass only even values")
	@ValueSource(ints= {10,30,30,450,6})
	public void testArrays(int args) {
		
		
		Assertions.assertTrue(args % 2 == 0);
		System.out.println(args);
		
	}
	
	
	
    
	@ParameterizedTest
	@DisplayName("Pass only non null values")
	@ValueSource(strings= {"Raman","Bankra"})
	public void testParam(String msg) {
		Assertions.assertNotNull(msg);
		System.out.println(msg);
		
	}
	
	
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x= 10, y = 30;
		Assertions.assertEquals(300, x * y);
		System.out.println(x);
	}
	
	
	@Test
	public void testLambda() {
		Integer[] intAry = {1,2,3,4,5};
		List<Integer> numbers= Arrays.asList(intAry);
		
		Assertions.assertAll(
				()->assertEquals(1,numbers.get(0)),
				()->assertEquals(2,numbers.get(1)),
				()->assertEquals(3,numbers.get(2)),
				()->assertEquals(4,numbers.get(3)),
				()->assertEquals(5,numbers.get(4))
		         );
		
	}
	
	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt("One");
		});
	
	
	
}}
