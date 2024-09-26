package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearchDemo {

	public static void main(String[] args)
	{
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.youtube.com/");
		driver1.manage().window().maximize();
		String str=driver1.getTitle();
		System.out.println(str);
		WebElement e2=driver1.findElement(By.name("search_query"));
			e2.sendKeys("Grotechminds"+Keys.ENTER);
	}

}
