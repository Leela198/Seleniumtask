package hoverover;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		WebElement login=dr.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(2000);
		Set<String> s1=dr.getWindowHandles();
	
		System.out.println(s1);
		
WebElement google=		dr.findElement(By.xpath("//span[.=\"Sign in with Google\"]"));
google.click();
	}

}
