package afterviva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);
		String str=e1.getText();
		String s1=e1.getAttribute("href");
		System.out.println(str);
		System.out.println(s1);
		}
	}

}
