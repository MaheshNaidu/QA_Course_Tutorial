package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Multi_Selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		// Find List box
		Select sc = new Select(driver.findElement(By.name("selenium_commands")));
		
		// Get All Options
		List<WebElement> obj = sc.getOptions();
		
		
		// check is multiple or not
		boolean x = sc.isMultiple();
		
		if(x==true) 
		{
			
			// Create Browser Action Object
			Actions a = new Actions(driver);
			
			a.keyDown(Keys.CONTROL).build().perform();			
			a.click(sc.getOptions().get(1)).build().perform();
			
			Thread.sleep(5000);
			
			a.click(obj.get(2)).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			
			
		}
		else
		{
			System.out.println("Element is not supporting multiple item selection");
		}
		
		
		// Close Driver
		driver.close();

	}

}
