package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;

//"Assignment 20Launch google, Type ""Bangalore"" and from auto-suggestions select 6th Auto-suggestion option"

public class Assi20 
{

	public static void main(String[] args) 
	{
		WebDriver dr=new SafariDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
	WebElement wb=dr.findElement(By.name("q"));
      wb.sendKeys("banglore");
      
	}

}
