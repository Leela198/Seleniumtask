package afterviva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//"Assignment 22Launch Flipkart , Type ""Mobiles"" and from auto-suggestions select last Auto-suggestion option"

public class Ass22 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		WebElement wb=dr.findElement(By.name("q"));
		wb.sendKeys("mobiles");
		Thread.sleep(4000);
		List<WebElement> lr1=dr.findElements(By.xpath("(//form[@class=\"Hy6F9O header-form-search\"])/ul/li"));
			
		int sx=lr1.size();
		System.out.println(lr1.size());
		Thread.sleep(2000);
		
		for(int i=0;i<sx;i++)
		{
			WebElement wb1=lr1.get(i);
			String ss1=wb1.getText();
			System.out.println(ss1);
		}
		
		//dr.findElement("//input[@name='otracker1']");
		/*Thread.sleep(2000);
	       WebElement w1=lr.get(7);
	       String str=w1.getText();
	       System.out.println(str);
	       w1.click();*/
		
	}

}
