package hoverover;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScTimeA37 {

	public static void main(String[] args) throws IOException
	{
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://en.zalando.de/?_rfl=de");
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		String current_time=	d1.toString();
		String year=	current_time.substring(current_time.length()-4);
		System.out.println(year);
		
		String month=	current_time.substring(4,7);
		System.out.println(month);

		String date=	current_time.substring(8,10);  
		System.out.println(date);
		TakesScreenshot sc=cd;  //upcasting
		File source=sc.getScreenshotAs(OutputType.FILE);  //desired output is stored in source
		
		File destination=new File("/Users/LeelaRaniK/Desktop/Assignments/scmath1"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
		File destination2=new File("/Users/LeelaRaniK/Desktop/Assignments/scdm3"+date+"."+month+".png");
	FileHandler.copy(source, destination2);
	}

}
