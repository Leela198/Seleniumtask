package TestNGpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*"Assignment 52
WAP which is having. @beforeMethod, @afterMethod and 2 test cases and should perform below steps
1. launch browser 
2. Testcase1 - Login to amezon search for any product, 
3. Testcase2 - Login to Amezon and Add product to wishlist
4. Close browser"*/

public class ManishTestNgWishlistDemo 

{
	@BeforeMethod
	public void m1()
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		String urll=cd.getCurrentUrl();
		System.out.println("url issssssssss"+urll);
	}
	@AfterMethod
	public void windohan()
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		String winowhan=cd.getWindowHandle();
		System.out.println("window handel isssssss"+winowhan);		
	}
	@Test
	public void testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("kidsshoes"+Keys.ENTER);
	}
	@Test
	public void wishlistTestcase2()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("shoes"+Keys.ENTER);
		WebElement we2=driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]"));
		we2.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String>  li=s1.iterator();
		String parentid=li.next();
		String childid=li.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement addwishlist=driver.findElement(By.xpath("//span[@id= \"wishListMainButton\"]"));
		addwishlist.click();

	}
	

}
