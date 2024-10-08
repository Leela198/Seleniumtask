package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Assignment 16
//WAP on Hoverover using ""https://grotechminds.com/hoverover/"" website"
public class GroTechHoverDemo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
		WebElement demo1=driver.findElement(By.xpath("//div[@data-id=\"1857001\"]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(demo1).perform();
		
		
		
		//a1.movetoelement(target elemnt e1).perform;

		//Here e1- is that component on which u wish to perform hoverover"	

	}

}
