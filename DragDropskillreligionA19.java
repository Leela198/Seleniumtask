package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//"Assignment 19
//WAP on DropDown handling using ""https://grotechminds.com/registration/"" website for
//Skills, Country and Relegion dropdowns"

public class DragDropskillreligionA19 {
	

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement Skills=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s1=new Select(Skills);
		
		s1.selectByIndex(1);
		WebElement country=driver.findElement(By.xpath("//select[@id=\"Country\"]"));
		Select s2=new Select(country);
		
		s2.selectByIndex(4);
		
		WebElement religion=driver.findElement(By.xpath("//select[@id=\"Relegion\"]"));
		Select s3=new Select(religion);
		
		s3.selectByVisibleText("Hindu");
		
		
	
	}

}
