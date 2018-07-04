package com.oleksii.pchelintsev.lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.oleksii.pchelintsev.exception.MyZeroException;

import junit.framework.Assert;

class ArithmeticTest {

	@Test
	void testDivideException() {
		assertThrows(MyZeroException.class, ()->{
		int a = 100;
		int b = 0;
		new Arithmetic().divide(a, b);
		}, "a message");
		  System.out.println("a = 100,  b = 0, Test is successful!");
	}
	
	@Test
	void testDivideUsual() {
		int a = 100;
		int b = 5;
		Assert.assertEquals(20,(int)new Arithmetic().divide(a, b));
		System.out.println("a = 100,  b = 5, Test is successful!");
	}
	
	@Test
	void testDivideNegativeNum() {
		int a = 100;
		int b = -5;
		Assert.assertEquals(-20,(int)new Arithmetic().divide(a, b));
		System.out.println("a = 100,  b = -5, Test is successful!");
	}
}
