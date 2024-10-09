package afterviva;
//"Assignment 17
//WAP on Drag and Drop using ""https://grotechminds.com/drag-and-drop/"" website"

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropA17 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement source=driver.findElement(By.id("drag9"));
		
		WebElement target=driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(source,target).perform();

		//Here e1- is that component which u wish to drag
		//e2->is that component which u wish to drop"	*/

	}

}
