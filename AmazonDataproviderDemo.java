package data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDataproviderDemo 
{
	
	@DataProvider(name="searchlist")
	
	public Object[][] method1()
	{
		return new Object[][] {{"books"},{"shoes"},{"ricecooker"},{"jewellery"},{"handbags"},{"toys"},{"beauty"},{"nutrition"}};
	}	
	
	
	
	@Test(dataProvider="searchlist")
	public void Amasearch(String input)
	{
	
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.amazon.in/");
	WebElement search=dr.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys(input+Keys.ENTER);
	
	
	}

}
