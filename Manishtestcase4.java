package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*"Assignment 48
WAP for below annotation and check execution

@BeforeMethod
@Test
@AfterMethod
"*/

public class Manishtestcase4
{
	@BeforeMethod
	public void gettingtitle()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement accept=driver.findElement(By.xpath("(//div[@class=\"QS5gu sy4vM\"])[2]"));
		accept.click();
		String title=driver.getTitle();
		System.out.println("title of page"+title);
	}
	
	@Test
	public void searchgoogle()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement accept=driver.findElement(By.xpath("(//div[@class=\"QS5gu sy4vM\"])[2]"));
		accept.click();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("india"+Keys.ENTER);
		
	}
	
	
	@AfterMethod
	public void aftertest()
	{
		System.out.println("i am tiredddddddd");
	}

}
