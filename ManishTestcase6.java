package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*"Assignment 50
WAP for below annotation and check execution
         
@BeforeMethod
@Test----1
@Test----2
@AfterMethod
@Test----3"*/

public class ManishTestcase6 
{

@BeforeMethod
public void titileofpage()
{
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.flipkart.com/");
	String we1=dr.getTitle();
System.out.println(we1);	
}
@Test
public void searchshoe()
{
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.flipkart.com/");
	WebElement we1=dr.findElement(By.xpath("//input[@name='q']"));
	we1.sendKeys("shoes"+Keys.ENTER);
	WebElement we2=dr.findElement(By.xpath("(//a[@class=\"WKTcLC\"])[1]"));
	we2.click();
}
@Test
public void searchshoe5()
{
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.flipkart.com/");
	WebElement we1=dr.findElement(By.xpath("//input[@name='q']"));
	we1.sendKeys("shoes"+Keys.ENTER);
	WebElement we2=dr.findElement(By.xpath("(//a[@class=\"WKTcLC\"])[5]"));
	we2.click();
}
@AfterMethod
public void afme()
{
	System.out.println("good to know");
}
@Test
public void booksearch()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement we=driver.findElement(By.id("searchDropdownBox"));

	Select s1=new Select(we);
	
	s1.selectByVisibleText("Books");
	WebElement name=driver.findElement(By.id("twotabsearchtextbox"));
	
	name.sendKeys("Power of Mind");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}

}
