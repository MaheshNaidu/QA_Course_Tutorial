package handling_WebElements;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Browser_Window_controls 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Driver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		Thread.sleep(5000);
		driver.get("https://www.google.com");
		
		// Maximize Window
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		// Get Height		
		Thread.sleep(5000);
		int h = driver.manage().window().getSize().getHeight();
		
		// Get Width
		Thread.sleep(5000);
		int w = driver.manage().window().getSize().getWidth();		
		System.out.println(h+"  "+w);
		
		
		// Get positions
		Thread.sleep(5000);
		int x = driver.manage().window().getPosition().getX();		
		int y = driver.manage().window().getPosition().getY();		
		System.out.println(x+"  "+y);
		
		
		//Set the size
		Thread.sleep(5000);
		Dimension d = new Dimension(400,400);	
		driver.manage().window().setSize(d);            
		
		// Set the Position
		Thread.sleep(5000);
		Point p = new Point(10,10);		
		driver.manage().window().setPosition(p);
		
		
		// Close Browser
		Thread.sleep(5000);
		driver.close();
			

	}

}
