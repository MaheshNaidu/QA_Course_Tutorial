package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_AlertMessages 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Open Driver
		Thread.sleep(5000);
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		Thread.sleep(5000);
		driver.get("http://site21.way2sms.com/content/index.html?");
		
		// Type Mobile No
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("9063715888");
		
		// click on Login Button
		Thread.sleep(5000);
		driver.findElement(By.id("loginBTN")).click();
		
			
		
		// Click on Alert Message
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//or
		
		// Dismiss alert Message
		// Thread.sleep(5000);
		// driver.switchTo().alert().dismiss();
		
		
		// Type Password
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("1234");
		
		// click on Login Button
		Thread.sleep(5000);
		driver.findElement(By.id("loginBTN")).click();
		
		
		// Close Driver
		Thread.sleep(5000);
		driver.close();

	}

}
