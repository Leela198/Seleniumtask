package TestNGpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/*"WAP
@Test
@AfterMethod
@AfterClass"*/

public class ManishTestcase1 
{
	@Test
	public void testAmazon()
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		String title=cd.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void aftemeth()
	{
		System.out.println("after executing test amazon");
	}
	
	@AfterClass
	public void aftecls()
	{
		System.out.println("after class");
	}

}
