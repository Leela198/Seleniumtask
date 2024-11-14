package parellelpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AmazonParameterDemo 
{

	
	public class LaunchQuit 
	{
		WebDriver driver;
		@BeforeMethod
		@Parameters("browser")
		public void precondition(String nameofbrowser)
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
			
		}
		
		@AfterMethod
		public void posttestcaseactivities() throws InterruptedException
		{
			
			
			Thread.sleep(2000);
			driver.quit();
		}
		
		
		
		
	}
}
