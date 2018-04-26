package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Duplicate_Objects 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open WebDriver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
	   	 
	   	 //Open Url
	   	 Thread.sleep(5000);
	   	 d.get("https://www.infibeam.com");
	   	 
	    
	   	 // click on Login Link
	   	 Thread.sleep(5000);
	   	 d.findElement(By.id("loginlink")).click();
	   	 
	   	 
	   	 // click on Create Account
	   	 Thread.sleep(5000);
	   	 d.findElement(By.id("new-account-btn")).click();
	   	 
	   	 
	   	 // Select Duplicate element
	   	 Thread.sleep(5000);
	   	 List<WebElement> e=d.findElements(By.xpath(".//*[@id='password']"));
	   	 
	   	 
	   	 // count no.of element

	   	 int count=e.size();
	   	 System.out.println("No.of Elements : "+count);
	   	 
	   	 
	   	 // Send first element values
	   	 Thread.sleep(5000);
	   	 e.get(0).sendKeys("123");
	   	 
	   	 
	   	 Thread.sleep(5000);
	   	 e.get(1).sendKeys("12345");
	   	 
	   	 
	   	 // Close
	   	 Thread.sleep(5000);
	   	 d.close();
	   	 
	   	 
	   	 



	}

}
