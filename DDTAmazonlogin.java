package Assertiondemopak;
//"Assignment 57  Login to amazon with DDT "

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.google.common.collect.Table.Cell;

public class DDTAmazonlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("/Users/LeelaRaniK/eclipse-workspace/Manishselenium/testdata/leela.xlsx");
//step-2 open the excel sheet
		Workbook w1=WorkbookFactory.create(f1);
		//step 3 go to actual sheet
		
		String un=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		
		
		String pwd=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		System.out.println(pwd);
		
		
	}
		
		
		

}
