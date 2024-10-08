package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 26Check Right click is disable in any banking application ex IDFC, ICICI etc and Insepct It"

public class A26 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		WebElement e2=driver.findElement(By.id("username"));
		e2.sendKeys("asdfnm");
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("123456");
		WebElement e4=driver.findElement(By.xpath("//input[@id=\"loginCaptchaValue\"]"));
		e4.sendKeys("6r7c8");
		
		WebElement e5=driver.findElement(By.id("Button2"));
		e5.click();


	}

}
