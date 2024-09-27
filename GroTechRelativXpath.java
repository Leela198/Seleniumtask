package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechRelativXpath {

	public static void main(String[] args)
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


	}

