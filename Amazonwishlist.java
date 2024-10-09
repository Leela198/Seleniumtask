package hoverover;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonwishlist {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("shoes"+Keys.ENTER);
		WebElement we2=driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]"));
		we2.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String>  li=s1.iterator();
		String parentid=li.next();
		String childid=li.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		WebElement addwishlist=driver.findElement(By.xpath("//span[@id= \"wishListMainButton\"]"));
		addwishlist.click();

	}

}
