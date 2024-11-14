package Assertiondemopak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AA64AmazonAssert
{
@Test(priority=2)
	public void Testamazon()throws InterruptedException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement shoesearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		shoesearch.sendKeys("ikswseswaert"+Keys.ENTER);
		Thread.sleep(2000);
	List<WebElement>li=driver.findElements(By.xpath("(//span[@class=\"a-declarative\"])"));
	int x=li.size();
	System.out.println("size of list of webelements.."+x);
	
	Assert.assertEquals((li.size())>20, true);
	
	} 

@Test
public void Testamazon2()throws InterruptedException 
{
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement shoesearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	shoesearch.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(2000);
List<WebElement>li=driver.findElements(By.xpath("(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20\"])"));
int x=li.size();
System.out.println("size of list of webelements.."+x);

Assert.assertEquals((li.size())>20, true);

}

}
