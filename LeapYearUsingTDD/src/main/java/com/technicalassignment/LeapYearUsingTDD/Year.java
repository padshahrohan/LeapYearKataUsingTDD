package com.technicalassignment.LeapYearUsingTDD;

public class Year {
	
	private int year;
	
	public Year(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		
		if(isValidYear() && isYearMultipleOf400() || (isYearMultipleOf4() && isYearNotMultipleOf100()))
			return true;
		return false;
	}
	public boolean isYearMultipleOf400()
	{
		return year % 400 == 0;
	}
	
	public boolean isYearNotMultipleOf100()
	{
		return !(year % 100 == 0);
	}
	
	public boolean isYearMultipleOf4()
	{
		return year % 4 == 0;
	}
	
	public boolean isValidYear()
	{
		return !(year < 0);
	}
	
}
