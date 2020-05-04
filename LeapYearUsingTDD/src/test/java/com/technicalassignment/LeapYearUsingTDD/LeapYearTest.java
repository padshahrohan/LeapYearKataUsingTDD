package com.technicalassignment.LeapYearUsingTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void isLeapYearIfYearIsDivisibleBy400()
	{
		Year year = new Year(2000);
		boolean actual = year.isLeapYear();
		assertEquals(true, actual);
	}
}
