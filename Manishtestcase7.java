package TestNGpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*"Assignment 51
WAP for below annotation and check execution
                 
@BeforeMethod
@Test----1
@Test----2"*/
public class Manishtestcase7 
{
	@BeforeMethod
	public void classname()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazonlinks()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));//list of webelemens with taganame a
		int count=li.size(); //finds count of webelments
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);//
		String str=e1.getText();//gets linktext
		System.out.println(str);
		String s1=e1.getAttribute("href"); //prints link
		System.out.println(s1);
		}
	}
	@Test
	public void googlelinks()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement accept=driver.findElement(By.xpath("(//div[@class=\"QS5gu sy4vM\"])[2]"));
		accept.click();
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);
		String str=e1.getText();
		String s1=e1.getAttribute("href");
		System.out.println(str);
		System.out.println(s1);
		}
	}

}
