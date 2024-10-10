package hoverover;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScWrongLocation36 
{

	public static void main(String[] args) throws IOException
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		TakesScreenshot scst=cd;  //upcasting to TakesScreetshot interface
		File f1=scst.getScreenshotAs(OutputType.FILE); //source file
		File des=new File("/Users/LeelaRaniK/Desktop/Assignmen/sc1.png"); //destination file
		FileHandler.copy(f1, des);

	}

}
//FILENOTFOUNDEXCEPTION