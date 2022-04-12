package com.cg.pack2;

import org.testng.annotations.Test;

public class DemoMultipleGroups {

	
	@Test(groups = {"Group A"})
	public void testMethod1()
	{
	System.out.println("This is implementation of testMethod1() Test, from grp=A");
	}

	@Test(groups = {"Group A","Group B"})
	public void testMethod2()
	{
	System.out.println("This is implementation of testMethod2() Test, from grp = A and B");
	}

	@Test(groups = {"Group B"})
	public void testMethod3()
	{
	System.out.println("This is implementation of testMethod3() Test, from grp= B");
	}

	@Test(groups = {"Group C"})
	public void testMethod4()
	{
	System.out.println("This is implementation of testMethod4() Test, from grp = C");
	}

	@Test(groups = {"Group D"})
	public void testMethod5()
	{
	System.out.println("This is implementation of testMethod5() Test, from grp = D");
	}
}
