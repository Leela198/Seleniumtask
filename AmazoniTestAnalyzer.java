package Analrzerretry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Analrzerretry.ItestAnalyzerDemo.class)
public class AmazoniTestAnalyzer extends ItestAnalyzerDemo
{
	//WebDriver driver;
	@Test()
	public void amazonsearch()
	{
	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement  search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		search.sendKeys("toys"+Keys.ENTER);
	}
}
