package afterviva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));//list of webelemens with taganame a
		int count=li.size(); //finds count of webelments
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		WebElement e1=li.get(i);//
		String str=e1.getText();//gets linktext
		System.out.println(str);
		String s1=e1.getAttribute("href"); //prints link
		System.out.println(s1);
		}

	}

}
