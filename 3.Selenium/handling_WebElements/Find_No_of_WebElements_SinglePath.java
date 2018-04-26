package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_No_of_WebElements_SinglePath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.facebook.com");
		
		
		// Get No.of Elements
		List<WebElement> r = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(r.size());
		
		r.get(0).click();
		
		Thread.sleep(5000);
		boolean x = r.get(0).isSelected();
		
		if(x==true) {
			r.get(1).click();
		}
		else
		{
			r.get(0).click();
		}
		
		
		// Open Another Browser
		Thread.sleep(5000);
		driver.get("http://toolsqa.com/automation-practice-form/");		
		List<WebElement> c = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		//int s = c.size();
		//System.out.println(s);
		System.out.println(c.size());
		
		//c.get(2).click();
		
		for(int i=0; i<c.size(); i++) 
		{
			c.get(i).click();
			Thread.sleep(5000);
		}
		
		// close Driver
		driver.close();
		
		
		// close Browser
		Thread.sleep(5000);
		driver.close();

	}

}
