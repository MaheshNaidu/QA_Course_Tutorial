package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Textbox_Buttons_Urls 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 // Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
	   	 
	   	 // Open URL
	   	 Thread.sleep(5000);
	   	 d.get("http://www.google.co.in");
	   	 
	   	 
	   	 // click on Sign in link
	   	 Thread.sleep(5000);
	   	 d.findElement(By.id("gb_70")).click();
	   	 
	   	 
	   	 // Enter Email ID
	   	 Thread.sleep(5000);
	   	 d.findElement(By.id("identifierId")).sendKeys("mahesh.saibersys@gmail.com");
	   	 
	   	 
	   	 // Click on Next
	   	 Thread.sleep(5000);
	   	 d.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	   	 
	   	 
	   	 // Enter Password
	   	 Thread.sleep(5000);
	   	 d.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("mahesh@143");
	   	 
	   	 
	   	 // Click on Next
	   	 Thread.sleep(5000);
	   	 d.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	   	 
	   	 
	   	 // Click on Link
	   	 Thread.sleep(5000);
	   	 d.findElement(By.linkText("Gmail")).click();
	   	 
	   	 
	   	 // close Browser
	   	 Thread.sleep(10000);
	   	 d.close();


	}

}
