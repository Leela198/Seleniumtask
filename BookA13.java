package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Assignment 13 Launch amazon,select a catagory as books,search a book called power of minds and press enter button using X-Path

public class BookA13
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement we=driver.findElement(By.id("searchDropdownBox"));

		Select s1=new Select(we);
		
		s1.selectByVisibleText("Books");
		WebElement name=driver.findElement(By.id("twotabsearchtextbox"));
		
		name.sendKeys("Power of Mind");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	

}
