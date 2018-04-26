package handling_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Handling_Take_Screen 
{

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		
		// Open Link
		driver.get("http://site21.way2sms.com/content/index.html?");	
		
		// Create the Screen Objects
		Screen S = new Screen();
		
		//get Screen and store in folder	
		Thread.sleep(5000);
		S.type("C:\\Users\\Mahesh\\Desktop\\Screens\\mobile.PNG", "9063715888");
		
		Thread.sleep(5000);
		S.type("C:\\Users\\Mahesh\\Desktop\\Screens\\password.PNG", "1234");
		
		
		Thread.sleep(5000);
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\button.PNG");
		
		
		// Click on Images
		Thread.sleep(5000);
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\mini.PNG");
		
				
		// Drag and Drop the screens
		Thread.sleep(5000);
		S.dragDrop("C:\\Users\\Mahesh\\Desktop\\Screens\\source.PNG", "C:\\Users\\Mahesh\\Desktop\\Screens\\target.PNG");
		
		
		Thread.sleep(5000);
		driver.get("https://www.youtube.com");
		
		S = new Screen();		
		
		S.type("C:\\Users\\Mahesh\\Desktop\\Screens\\search.PNG", "Selenium introduction by ravikanth kumar");
		
		Thread.sleep(3000);		
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\sbutton.PNG");
		
		Thread.sleep(5000);		
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\linktext.PNG");
		
		Thread.sleep(5000);		
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\pause.PNG");
		
		Thread.sleep(7000);		
		S.click("C:\\Users\\Mahesh\\Desktop\\Screens\\play.PNG");
		

	}

}
