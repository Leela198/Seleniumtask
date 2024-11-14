package Testngday2;

import org.testng.annotations.Test;

public class TestcaseDisable

{
	
	@Test
	public void m1()
	{
		
	}
	
	
	@Test(enabled=false)
	public void m2()
	{
		
	}
	@Test(priority=0,invocationCount=4)
	public void m3()
	{
		
	}
	

}
