package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		int num1=10;int num2=10;
		
		assertEquals(20, Main.add(num1,num2));
	}
	@Test
	public void testNums() {
		int num1=10,num2=20;
		//assertTrue(Main.compare(num1, num2));
		assertFalse(Main.compare(num1, num2));
	}
	@Test
	public void testObjects() {
		Flight f1=new Flight(1001,"Mumbai","Pune");
		Flight f2=f1;
		//assertSame(f1, f2);
		assertEquals(f1, f2);
	}
}
