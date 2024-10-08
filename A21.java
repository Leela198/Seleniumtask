package afterviva;
//"Assignment 21  Launch Amazon.in , Type ""Shoe"" and from auto-suggestions select 2nd Auto-suggestion option"

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		WebElement wwb=dr.findElement(By.id("twotabsearchtextbox"));
       wwb.sendKeys("shoe");
       Thread.sleep(3000);
       List<WebElement> li=dr.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
       int sizee=li.size();
       //System.out.println(li);
       System.out.println(sizee);
       Thread.sleep(2000);
       WebElement w1=li.get(1);
       String str=w1.getText();
       System.out.println(str);
       w1.click();
       
	}

}
