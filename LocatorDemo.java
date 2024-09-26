package day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LocatorDemo {

	public static void main(String[] args)
	{
		
		
	WebDriver driver=new ChromeDriver();
	try 
	{
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	String str=driver.getTitle();
	System.out.println("titel of page is"+str);
	//name
	driver.findElement(By.name("search")).sendKeys("Mac");
	//id 
	boolean searchdiaplaystatus=driver.findElement(By.id("logo")).isDisplayed();
	System.out.println(searchdiaplaystatus);
	//will give us browser id of parent window/tab
	System.out.println("window handel method"+driver.getWindowHandle());

    //linkText nd partialLinkText
	
	//driver.findElement(By.linkText("Tablets")).click();
	driver.findElement(By.partialLinkText("Tablets")).click();
	}
	catch(Exception e) {
        e.printStackTrace();
    } 
	
	}

}
