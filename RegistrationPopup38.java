package hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 38 Handle javascript popup in https://grotechminds.com/registration/ page."
public class RegistrationPopup38
{

	public static void main(String[] args)
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
	
	driver.switchTo().alert().accept();
	
	
	}
}
