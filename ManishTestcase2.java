package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*"@BeforeTest
@BeforeClass
@BeforeMethod
@AfterMethod
@Test"*/

public class ManishTestcase2 

{
	@BeforeTest
	public void launchamazon()
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		String title=cd.getTitle();
		System.out.println(title);
	}
	
	@BeforeClass
	public void clasname()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("shoes"+Keys.ENTER);
		
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("hello i am before method");
	}
	
	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("after method byyeeeeeeeee");
	}
	
	@Test
	public void actualtestcase()
	{
		ChromeOptions co=new ChromeOptions(); //to save resources
		co.addArguments("--headless");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	
	
}
