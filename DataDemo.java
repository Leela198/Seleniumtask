package data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDemo
{
	@DataProvider(name="set1") //used for providing multipel data as inputs
	public Object[][] searchdata() //for dis return type id 2-D object array
	{
		return new Object[][]{{"Germany"},{"india"},{"gold"}};//must return object
	}
	
	@DataProvider(name="set2")
	public Object[][] addition()
	{
		return new Object[][] {{345},{567},{789},{912},{234},{456}};
	

	}
	@Test(dataProvider="set2",priority=2)
	public void summ(int input)
	{
		int sum=300+input;
		Reporter.log("addition is.."+sum);
	}
	
	
	@Test(dataProvider="set1")
	public void googlesearch(String input)
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		WebElement accept=dr.findElement(By.xpath("((//div[@class=\"QS5gu sy4vM\"])[2])"));
		accept.click();
		WebElement search=dr.findElement(By.id("APjFqb"));
	search.sendKeys(input+Keys.ENTER);
	}
	

}
