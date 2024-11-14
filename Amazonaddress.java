package data;
//"Assignment 59 Login to amazon, add a new address, where address should come from excel sheet"




import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Amazonaddress
{ 
	WebDriver de;
/*//name
			String name = s.getRow(1).getCell(0).getStringCellValue();
			//Mobile Number
			String MobileNum  =   NumberToTextConverter.toText(s.getRow(1).getCell(1).getNumericCellValue());
			//pincode
			String pincode  =   NumberToTextConverter.toText(s.getRow(1).getCell(2).getNumericCellValue());
			//flatno
			String flatNo = NumberToTextConverter.toText(s.getRow(1).getCell(3).getNumericCellValue());
			//street
			String Area =      s.getRow(1).getCell(4).getStringCellValue();
			//City
			String city = s.getRow(1).getCell(5).getStringCellValue();
			//state
			//String state = s.getRow(1).getCell(6).getStringCellValue();*/
	@Test
	public void address() throws InterruptedException, EncryptedDocumentException, IOException
	{
		de=new ChromeDriver();
		de.manage().window().maximize();
		de.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement signin=de.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		signin.sendKeys("leela.rani2@gmail.com");
		WebElement contin=de.findElement(By.xpath("//input[@id=\"continue\"]"));
		contin.click();
		WebElement pwd=de.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		pwd.sendKeys("komma£1234");
		WebElement submit=de.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		submit.click();
		WebElement add1=de.findElement(By.xpath("//a[@id=\"nav-global-location-popover-link\"]"));
		add1.click();
		Thread.sleep(2000);
		WebElement add=de.findElement(By.xpath("//a[.=\"Add an address or pick-up point \"]"));
		add.click();
		
		
		Thread.sleep(2000);
		FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/Manishselenium/testdata/leelaaddress.xlsx");
		//step-2 open the excel sheet
				Workbook w1=WorkbookFactory.create(f1);
				//step 3 go to actual sheet
				
				
		
		WebElement newadd=de.findElement(By.xpath("//div[@class=\"a-box first-desktop-address-tile\"]"));
		newadd.click();
		
		
		WebElement country=de.findElement(By.xpath("//select[@id=\"address-ui-widgets-countryCode-dropdown-nativeId\"]"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement firstname1=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressFullName\"]"));
		
		firstname1.sendKeys(w1.getSheet("address").getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		
		WebElement address=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]"));
		address.sendKeys(w1.getSheet("address").getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		WebElement phno=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressPostalCode\"]"));
		
		phno.sendKeys(NumberToTextConverter.toText(w1.getSheet("address").getRow(1).getCell(2).getNumericCellValue()));
		Thread.sleep(2000);
		WebElement houseno=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressLine1\"]"));
		houseno.sendKeys(NumberToTextConverter.toText(w1.getSheet("address").getRow(1).getCell(3).getNumericCellValue()));
		
		
		WebElement area=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressLine2\"]"));
		area.sendKeys(w1.getSheet("address").getRow(1).getCell(4).getStringCellValue());
		
		WebElement landmark=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-landmark\"]"));
		landmark.sendKeys(w1.getSheet("address").getRow(1).getCell(5).getStringCellValue());
		
		WebElement town=de.findElement(By.xpath("//input[@id=\"address-ui-widgets-enterAddressCity\"]"));
		town.sendKeys(w1.getSheet("address").getRow(1).getCell(6).getStringCellValue());
		
		WebElement state=de.findElement(By.xpath("//select[@id=\"address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId\"]"));
		Select s2=new Select(state);
		s2.selectByVisibleText("TELANGANA");
		
		
		WebElement makedefault=de.findElement(By.xpath("(//input[@id=\"address-ui-widgets-use-as-my-default\"])"));
		makedefault.click();
		
		
		WebElement addaddress=de.findElement(By.xpath("(//span[@id=\"address-ui-widgets-form-submit-button\"])"));
		addaddress.click();
		
		
		
	}
	/*@AfterMethod
	public void logout()
	{
		//de.quit();
	}*/
	
}
	

