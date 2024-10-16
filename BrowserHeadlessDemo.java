package hoverover;

/*Headless browser is a web browser that is not configured with a Graphical User Interface (GUI).
 *  It is mostly used by software test engineers,
 *   because browsers without a GUI perform faster since they do not have to draw visual content
 */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHeadlessDemo {

	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions(); //to save resources
		co.addArguments("--headless");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		

	}

}
