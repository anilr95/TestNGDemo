package com.cg;

import org.testng.annotations.Test;

public class Test2 
{

   @Test(enabled=false) 
   public void demo1()
   {
	  System.out.println("demo1() test method");
   }
   
  @Test() 
  public void demo2()
  {
	 System.out.println("demo2() test method");
  }
}
