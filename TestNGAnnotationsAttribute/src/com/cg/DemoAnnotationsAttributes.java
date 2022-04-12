package com.cg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoAnnotationsAttributes {
	
	//alwaysRun---it will execute always whenever its depending methods failed
	//invocationCount--means it will invoke at that particular time
	//invocationTimeOut---it specifies the timeout period to wait for the complete execution
	
	@Test(description = "This is the testMethod1() description", invocationCount = 2, invocationTimeOut =2,alwaysRun = true)
	public void testMethod1()
	{
	System.out.println("testMethod1");
	}
     
	//dependsOnMethods---will execute first and then that particular method will execute
	//like first login method will execute and then creditAmmount will execute
	@Test(dependsOnMethods = "login", priority = 5)
	public void creditAmount()
	{
	System.out.println("Credit amount needs login");
	}

	
	//login and creditAmount will execute and after that debitAmount will execute
	//whatever the priority
	@Test(dependsOnMethods = {"login","creditAmount"}, priority = 0)
	public void debitAmount()
	{
	System.out.println("Debit amount needs credit and login");
	}
     
	
	//enabled=true-------it will execute definitely
	@Test( enabled=true, priority = 9)
	public void login()
	{
	System.out.println("Login method");
	}

	@Test(dependsOnGroups = {"Grp A","Grp B"})
	public void testMethod2()
	{
	System.out.println("testMethod2");
	}

	@Test(groups = "Grp A")
	public void testMethod3()
	{
	System.out.println("testMethod3 Grp A");
	}

	@Test(groups = "Grp B")
	public void testMethod4()
	{
	System.out.println("testMethod4 Grp B");
	}

	//expectedExceptions---what is the excepted exception the method can throw 
	@Test(expectedExceptions = {ArithmeticException.class, Exception.class})
	public void divide()
	{
	int ans= 10/0; //generate exception
	System.out.println("divide method..");
	}

	//dataProvider---it is used for providing some data
	@Test(dataProvider = "get") //get is name of DataProvider
	public void useData(int num, String str)
	{
	System.out.println("number is "+num+" and String is "+str);
	}

	//this will provide the data to above method
	@DataProvider(name="get")
	public Object[][] getData()
	{ 
	return new Object[][]
	{{66,"num1"},{56,"num2"},{11,"num3"},{50,"num4"}};
	}

	@Test
	@Parameters({"city"})
	public void testParameter(String cityName)
	{
	System.out.println("city name is "+cityName);
	}
}
