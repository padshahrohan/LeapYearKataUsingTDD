package com.technicalassignment.LeapYearUsingTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void isLeapYearIfYearIsDivisibleBy400()
	{
		assertTrue(new Year(2000).isLeapYear());
	}
	
	@Test
	public void isNotALeapYearIfYearIsDivisibleBy100()
	{
		assertFalse(new Year(1800).isLeapYear());
	}
	
	@Test
	public void isLeapYearIfYearIsDivisibleBy4()
	{
		assertTrue(new Year(2008).isLeapYear());
	}
	
	@Test
	public void isNotLeapYearIfYearIsNotDivisibleBy4()
	{
		assertFalse(new Year(2019).isLeapYear());
	}
	
	@Test
	public void isNotLeapYearIfInputYearIsInvalid()
	{
		assertFalse(new Year(-2000).isLeapYear());
	}
}
