package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_DropDownList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open WebDriver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();

	    // Open URL
		Thread.sleep(5000);		
		d.get("http://newtours.demoaut.com");
		
		
		// Enter User Name
		Thread.sleep(5000);	
		d.findElement(By.name("userName")).sendKeys("mahesh");
				
		
		// Enter Password
		Thread.sleep(5000);	
		d.findElement(By.name("password")).sendKeys("mahesh");
		
		
		// click Sign In Button
		Thread.sleep(5000);	
		d.findElement(By.name("login")).click();
		
		
		// Select DropDownList items
		Thread.sleep(5000);
		WebElement e=d.findElement(By.name("fromPort"));
		
		// Create Select Class Object
		Select obj=new Select(e); // Select obj=new Select(d.findElement(By.name("fromPort")));
		
		// Select Drop down Items
		Thread.sleep(5000);
		obj.selectByIndex(5);
		
		
		Thread.sleep(5000);
		obj.selectByIndex(2);
		
		
		Thread.sleep(5000);
		obj.selectByIndex(8);
		
		
		Thread.sleep(5000);
		obj.selectByValue("Paris");
		
		
		Thread.sleep(5000);
		obj.selectByValue("San Francisco");
		
		
		Thread.sleep(5000);
		d.close();	

	}

}
