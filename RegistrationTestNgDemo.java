package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTestNgDemo
{

	@DataProvider(name="details")
	public Object[][] data1()
	{
		Object data[][]=new Object[5][2];
		data[0][0]="shrl@gmail.com";
		data[0][1]="shrl@password";
		
		data[1][0]="xxyy@gmail.com";
		data[1][1]="xxyy@password";
		
		data[2][0]="pilli@gmail.com";
		data[2][1]="pilli@password";
		
		data[3][0]="sneha@gmail.com";
		data[3][1]="sneha@password";
		
		data[4][0]="simha@gmail.com";
		data[4][1]="simha@password";
		return data;
		
		
	}
	
	@Test(dataProvider="details")
	public void login_amazon(String username,String password)
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		WebElement e1=dr.findElement(By.id("email"));
		WebElement pass1=dr.findElement(By.id("pass"));
		e1.sendKeys(username);
		pass1.sendKeys(password);
	}
}
