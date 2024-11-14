package Assertiondemopak;

import org.testng.Assert;
import org.testng.annotations.Test;

//pass nd fail Testcase demo

public class AssertDemo1 {

	
		@Test
		public void m1() //fails the test method m1
		{
			Assert.assertTrue(true);
		}
@Test
public void m2()//fails the test method m2
{
	Assert.assertTrue(false);
}
@Test
public void m3()//pass the test method m3
{
	Assert.assertFalse(false);
}	

@Test
public void m4()
{
	Assert.assertFalse(true);//fails the test mthod m4
}

}
