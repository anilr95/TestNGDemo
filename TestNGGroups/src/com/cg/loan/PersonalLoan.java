package com.cg.loan;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test(groups= {"SmokeTest"})
	public void webLoginPersonalLoan()
	{
		System.out.println("web Login PersonalLoan");
	}
	
	@Test
	public void mobileLoginPersonalLoan()
	{
		System.out.println("mobile Login PersonalLoan");
	}
	
	@Test
	public void apiLoginPersonalLoan()
	{
		System.out.println("api Login PersonalLoan");
	}
}
