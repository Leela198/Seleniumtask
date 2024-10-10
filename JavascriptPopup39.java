package hoverover;
//"Assignment 39
//Handle javascript popup in https://grotechminds.com/javascript-popup/ page."

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup39 {

	public static void main(String[] args) throws InterruptedException
	{
		
ChromeDriver cdr=new ChromeDriver();
cdr.manage().window().maximize();
cdr.get("https://grotechminds.com/javascript-popup/");

WebElement we=cdr.findElement(By.xpath("//button[@class='btnjs']"));
we.click();
Thread.sleep(3000);
cdr.switchTo().alert().accept();


	}

}


