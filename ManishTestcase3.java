package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*"Assignment 47
WAP for below annotation and check execution

@Test
@AfterMethod
@BeforeSuite
@AfterClass"*/

public class ManishTestcase3 
{
	@Test
	public void actualtest()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement accept=driver.findElement(By.xpath("(//div[@class=\"QS5gu sy4vM\"])[2]"));
		accept.click();
		
		WebElement e1=	driver.findElement(By.linkText("Gmail"));
			e1.click();
	}
	@AfterMethod
	public void aftrmeth()
	{
		System.out.println("gmail logout");
	}
	@BeforeSuite
	public void besuit()
	{
		System.out.println("try to click signin");
	}
	@AfterClass
	public void afcls()
	{
		System.out.println("after class method");
	}
	
}
