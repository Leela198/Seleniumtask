package hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScrollDown {

	public static void main(String[] args) 
	
	{
		ChromeDriver drr=new ChromeDriver();
		drr.manage().window().maximize();
		drr.get("https://www.youtube.com/");
		WebElement we1=drr.findElement(By.xpath("//input[@id=\"search\"]"));
		we1.sendKeys("india"+Keys.ENTER);
		
		Point axis=we1.getLocation();
		JavascriptExecutor jex=(JavascriptExecutor)drr; //upcasting to JavascriptExecutor
		jex.executeScript("window.scrollBy(100,10000)");

	}

}
