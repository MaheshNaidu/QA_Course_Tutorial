package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Attribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		WebDriver driver = new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.facebook.com");				
				
		// Find Element
		WebElement e = driver.findElement(By.name("firstname"));
				
		//element is exist or not		
		boolean x = e.isDisplayed();
		System.out.println(x);
				
		boolean y = e.isEnabled();
		System.out.println(y);
				
		if(y==true) 
		{
			//return a element type			
			String objtype = e.getAttribute("type");
			System.out.println(objtype);
			
			//enter a value					
			e.sendKeys("Mahesh");
			
			//return a value			
			String value = e.getAttribute("value");
			System.out.println(value);
			
			Thread.sleep(5000);
			e.clear();
		}
		
		else
		{
			System.out.println("element is disabled");
		}
		
		// Close Browser
		driver.close();
				

	}

}
