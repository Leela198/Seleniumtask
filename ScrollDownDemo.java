package hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class ScrollDownDemo {

	public static void main(String[] args) 
	{
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		WebElement web=dr.findElement(By.xpath("(//a[.=\"About Amazon\"])"));
		JavascriptExecutor jsExec = (JavascriptExecutor) dr;
		jsExec.executeScript("window.scrollBy(700,3050)");
		jsExec.executeScript("window.scrollBy(0,50)");

		
	}

}
