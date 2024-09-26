package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeManish {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.de/");
	
		driver.manage().window().maximize();
		//String xx=driver.getTitle();
		//System.out.println(xx);
		driver.findElement(By.id("APjFqb")).sendKeys("india");
		
		
		
		//driver.close();
//driver.quit();
	}

}
