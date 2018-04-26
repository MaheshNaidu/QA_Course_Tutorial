package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_No_img_tag_on_Page 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.mercurytravels.co.in/");
		
		// find No.of Tags
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		
		// Print Size
		System.out.println(images.size());
		
			
		// Driver Close
		Thread.sleep(5000);	
		driver.close();

	}

}
