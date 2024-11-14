package Assertiondemopak;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A58DDTAmazonproductseatch 
{
	@Test
	public void main1() throws EncryptedDocumentException, IOException
	{
	
	ChromeDriver de=new ChromeDriver();
	de.manage().window().maximize();
	de.get("https://www.amazon.in/");
	
	WebElement search1=de.findElement(By.id("twotabsearchtextbox"));
	FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/Manishselenium/testdata/search.xlsx");
	//step-2 open the excel sheet
			Workbook w1=WorkbookFactory.create(f1);
			//step 3 go to actual sheet
			
			String sn=w1.getSheet("search").getRow(1).getCell(0).getStringCellValue();
			
			
			//String pwd=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
			/*System.out.println(un);*/
			System.out.println(sn);
			search1.sendKeys(sn);
	}
			
}
