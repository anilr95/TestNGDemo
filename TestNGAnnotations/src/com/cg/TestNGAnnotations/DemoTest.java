package com.cg.TestNGAnnotations;

import org.testng.annotations.*;

public class DemoTest {

	@BeforeGroups("Group A")
	public void beforeGroup()
	{
		System.out.println("beforeGroup - A");
	}

	@AfterGroups("Group A")
	public void afterGroup()
	{
		System.out.println("afterGroup-A");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

	@Test(groups= {"Group A"})
	public void testMethod2()
	{
		System.out.println("testMethod2- Group A");
	}

	@Test(groups= {"Group A"})
	public void testMethod3()
	{
		System.out.println("testMethod3- Group A");
	}


}
