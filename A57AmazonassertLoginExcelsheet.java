package Assertiondemopak;
//program to assert login search a product  nd logout amazon

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A57AmazonassertLoginExcelsheet 
{
	@Test
	public void Loginamazon() throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/Manishselenium/testdata/leela.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		//step 3 go to actual sheet
		
		String un=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		
		String pwd=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
		WebElement signn=driver.findElement(By.id("ap_email"));
		signn.sendKeys(un);
		
		WebElement continue1=driver.findElement(By.xpath("(//input[@id=\"continue\"])"));
		continue1.click();
		WebElement password=driver.findElement(By.xpath("(//input[@id=\"ap_password\"])"));
		password.sendKeys(pwd);
	}

}
