package afterviva;
//"Assignment 23Launch google, Type ""Bangalore"" and from auto-suggestions print all options"

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23 {

	public static void main(String[] args)
	{
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		driver1.findElement(By.name("q")).sendKeys("banglore"+Keys.ENTER);
		
	}

}
