package afterviva;
/*"Assignment 15
WAP in Amazon.in hoverover on 
language -select any language(ex:-kannada)"*/

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A15 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement we=driver.findElement(By.xpath("(//span[@class='icp-nav-link-inner'])"));
		Thread.sleep(4000);
		Actions a1=new Actions(driver);
		a1.moveToElement(we).perform();
		
	//driver.findElement(By.xpath("(//span[@class=\"a-label a-radio-label\"])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//i[@class=\"icp-radio\"])[1]")).click();
	//driver.findElement(By.linkText("తెలుగు"));

	}

}
