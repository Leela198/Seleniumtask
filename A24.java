package afterviva;
//"Assignment 24 Launch Amazon.in , Type ""Shoe"" and from auto-suggestions print all the options"

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24 {

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
       for(int i=0;i<sizee;i++)
       {
    	   WebElement w1=li.get(i);
    	   String str=w1.getText();
           System.out.println(str);
       }
      

	}

}
