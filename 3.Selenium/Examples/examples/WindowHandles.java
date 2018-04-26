package examples;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles 
{

	public static void main(String[] args) 
	{
		
		// WebDriver
		WebDriver driver = new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.naukri.com/");
		
		// Create the Array List example
		ArrayList<String> BW = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(BW.size());
		
		for(int i=1;i<BW.size(); i++) 
		{
		
			driver.switchTo().window(BW.get(i));
		
			driver.close();

		}
	}

}
