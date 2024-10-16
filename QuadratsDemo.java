package hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuadratsDemo {

	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		WebElement web=dr.findElement(By.xpath("(//a[.=\"About Amazon\"])"));
		Point quadrants=web.getLocation();
		System.out.println(quadrants);
		int x=quadrants.getX(); //for getting x coordinate
		int y=quadrants.getY();   //for getting y cocorinate
		System.out.println(x+"********"+y);
		

	}

}
