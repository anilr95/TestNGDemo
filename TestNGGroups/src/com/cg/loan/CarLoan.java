package com.cg.loan;

import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void webLoginCarLoan()
	{
		System.out.println("web Login CarLoan");
	}
	
	@Test
	public void mobileLoginCarLoan()
	{
		System.out.println("mobile Login CarLoan");
	}
	
	@Test(groups= {"SmokeTest"})
	public void apiLoginCarLoan()
	{
		System.out.println("api Login CarLoan");
	}
}
