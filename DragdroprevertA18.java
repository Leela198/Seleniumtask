package afterviva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*"Assignment 18
WAP on Drag and Drop using ""https://grotechminds.com/drag-and-drop/"" website
And Revert the dragged element at its original position"*/
public class DragdroprevertA18{

	public static void main(String[] args)
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/drag-and-drop/");
       WebElement source=dr.findElement(By.id("drag9"));
		
		WebElement target=dr.findElement(By.id("div2"));
		
		Actions a1=new Actions(dr);
		a1.dragAndDrop(source,target).perform();
		
		WebElement sourc1=dr.findElement(By.id("container-8"));
		
		WebElement target1=dr.findElement(By.id("drag9"));
		
		a1.dragAndDrop(target1,sourc1).perform();

	}

}
