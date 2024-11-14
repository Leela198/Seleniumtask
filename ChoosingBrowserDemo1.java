package parellelpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ChoosingBrowserDemo1 


{

	WebDriver driver;
@Test
@Parameters("browser")
public void testcase(String nameofbrowser)
{
	if(nameofbrowser.equals("chrome"))
	{
	driver=new ChromeDriver();
	}
	if(nameofbrowser.equals("firefox"))
	{
	driver=new FirefoxDriver();
	}
	if(nameofbrowser.equals("edge"))
	{
	driver=new EdgeDriver();
	}
	//driver.manage().window().maximize();
	driver.get("https://amazon.in");

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe"+ Keys.ENTER);

	
	
	
}
}  


