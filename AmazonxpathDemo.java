package day21;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AmazonxpathDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		we.sendKeys("shoes"+Keys.ENTER);
		//WebElement w1=driver.findElement(By.xpath("((/html/body/form)[2])/input[1])"));
		//w1.sendKeys("shoes"+Keys.ENTER);
	}

}
