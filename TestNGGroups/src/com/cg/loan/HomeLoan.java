package com.cg.loan;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void webLoginHomeLoan()
	{
		System.out.println("web Login HomeLoan");
	}
	
	@Test(groups= {"SmokeTest"})
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobile Login HomeLoan");
	}
	
	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("api Login HomeLoan");
	}
}
