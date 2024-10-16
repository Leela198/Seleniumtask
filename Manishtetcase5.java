package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*"Assignment 49
WAP for below annotation and check execution
 	
@BeforeMethod
@Test----1
@Test----2
@AfterMethod"*/

public class Manishtetcase5
{
	
	@BeforeMethod
	public void gtmlopen()
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("file:///Users/LeelaRaniK/Learning.html");
		driver.manage().window().maximize();
	}
	@Test
	public void registraton()
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("file:///Users/LeelaRaniK/Learning.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='1']"));
		username.sendKeys("leelaraani");
		WebElement hint = driver.findElement(By.xpath("//input[@name='say hello']"));
		hint.sendKeys("testing");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("kom234g");
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("gahnb"); 
		WebElement cb1 = driver.findElement(By.xpath("//input[@id='123']"));
		cb1.click();
		WebElement cb2 = driver.findElement(By.xpath("//input[@name='name2']"));
		cb2.click(); 
		WebElement cb3 = driver.findElement(By.xpath("//input[@id='321']"));
		cb3.click(); 
		///html/body/input[4]
		WebElement rb1 = driver.findElement(By.xpath("(//input)[11]"));
		rb1.click();
		WebElement rb2 = driver.findElement(By.xpath("(//input)[12]"));
		rb2.click();
		WebElement bnglrcb = driver.findElement(By.xpath("(//input)[13]"));
		bnglrcb.click();
		WebElement link = driver.findElement(By.xpath("(//a)[1]"));
		// or driver.findElement(By.tagName(a))
		link.click();
	}
	@Test
	public void filedemo()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
WebElement wb=driver.findElement(By.id("fname"));
wb.sendKeys("leela");
WebElement lastna=driver.findElement(By.id("lname"));
lastna.sendKeys("rani");

WebElement email=driver.findElement(By.id("email"));
email.sendKeys("leela.rani2@gmail.com");

WebElement passk=driver.findElement(By.id("password"));
passk.sendKeys("123456");
WebElement gender=driver.findElement(By.xpath("//input[@id=\"Female\"]"));
gender.click();


	WebElement skill=driver.findElement(By.xpath("(//div/select/option)[2]"));
	skill.click();
	WebElement presentadd=driver.findElement(By.id("Present-Address"));
	presentadd.sendKeys("germany");
	
	WebElement parmadd=driver.findElement(By.id("Permanent-Address"));
	parmadd.sendKeys("germany,nuremberg");
	
	WebElement pincod=driver.findElement(By.id("Pincode"));
	pincod.sendKeys("90403");
	WebElement country=driver.findElement(By.xpath("//select[@id=\"Country\"]"));
	
	Select s1=new Select(country);
	s1.selectByIndex(7);
	
	WebElement religion=driver.findElement(By.xpath("//select[@id=\"Relegion\"]"));
	Select s2=new Select(religion);
	s2.selectByIndex(1);
	
WebElement file=driver.findElement(By.xpath("//input[@id=\"file\"]"));
	file.sendKeys("/Users/LeelaRaniK/Desktop/User-Stories-ATM.pdf");
	
	WebElement relocate=driver.findElement(By.xpath("//input[@id=\"relocate\"]"));
relocate.click();
	

	WebElement submit=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
	
	submit.click();
	
	//driver.switchTo().alert().accept();
	
	}
	@AfterMethod
	public void afmeth()
	{
		System.out.println("i am good to go");
	}

}
