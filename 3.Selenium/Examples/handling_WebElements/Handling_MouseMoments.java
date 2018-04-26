package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MouseMoments 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 // Open WebDriver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
	   	 
	   	 
	   	 // Open URL
	   	 Thread.sleep(5000);
	   	 d.get("http://store.demoqa.com/");
	   	 
	   	 
	   		 
	   	 // Create the action class object
	   	 Actions a=new Actions(d);
	   	 
	   	 
	   	 // Move the element active build action   	 
	   	 Thread.sleep(5000);
	   	 WebElement e1=d.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
	   	 a.moveToElement(e1).build().perform();
	   	 
	   	 
	   	 // Move Next menu options
	   	 Thread.sleep(5000); 
	   	 

	}

}
