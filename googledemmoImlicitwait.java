package Analrzerretry;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googledemmoImlicitwait 
{
	
	@Test(retryAnalyzer=Analrzerretry.RetryDemoAnalyzer2.class)
	public void m1()
	{
		
		
	ChromeDriver d1=new ChromeDriver();
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	d1.manage().window().maximize();
	d1.get("https://www.google.com/");
	WebElement accept=d1.findElement(By.xpath("((//div[@class=\"QS5gu sy4vM\"])[2])"));
	accept.click();
	WebElement e1=d1.findElement(By.name("q"));
	e1.sendKeys("india"+Keys.ENTER);
	
	}
		
	
	
}
