package com.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void testAddnumberPositive() {
		System.out.println("Numbers Addition Unit test");
		mathsAddition ma=new mathsAddition();
		int num3=10;
		int num4=8;
		int actualResult=ma.addNumber(num3,num4);
		int expectedResult=18;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testAddnumberNegative() {
		System.out.println("Numbers Addition Unit test");
		mathsAddition ma=new mathsAddition();
		int num3=10;
		int num4=8;
		int actualResult=ma.addNumber(num3,num4);
		int expectedResult=17;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(timeout=5)
	public void testgenerateRandomNumber() {
		double randumNumbers[]=new double[100000];
		for(int i=0;i<100000;i++) {
			randumNumbers[1]=Math.random()+1;
		}
	}
	
}
