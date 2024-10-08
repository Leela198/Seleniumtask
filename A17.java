package afterviva;

import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 17WAP on Drag and Drop using ""https://grotechminds.com/drag-and-drop/"" website"
public class A17 {

	public static void main(String[] args)
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/drag-and-drop/");
		

	}

}
