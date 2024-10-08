package afterviva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment14WAP in flipkart clickon fashion menu using Xpathusing text messade"
public class A14
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
			dr.findElement(By.xpath("((//span[.='Fashion'])[2])"));
		
	}

}
