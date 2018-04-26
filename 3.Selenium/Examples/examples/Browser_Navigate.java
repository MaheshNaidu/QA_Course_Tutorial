package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Navigate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		// Navigate To
		driver.navigate().to("https://www.gmail.com");		
		Thread.sleep(3000);
		
		// Navigate Back
		driver.navigate().back();		
		Thread.sleep(3000);
		
		
		// Navigate Forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		// Page Refresh
		driver.navigate().refresh();		
		
		
		// get Title
		String title = driver.getTitle();
		
		System.out.println(title);		
		if(title.contains("Gmail")) 
		{
			System.out.println("Test case is pass");
		}
		
		else
		{
			System.out.println("Test case is Fail");
		}
		
		// close Browser
		driver.close();

	}

}
