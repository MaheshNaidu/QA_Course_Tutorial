package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		//Launch the Browser
		WebDriver driver=new FirefoxDriver();	

		//Open gmail URL
		driver.get("https://www.gmail.com");

		//Enter Email ID
		driver.findElement(By.id("identifierId")).sendKeys("testing9908820008");

		//Click next button
		driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']")).click();
		Thread.sleep(5000);
		
		//Enter password
		driver.findElement(By.name("password")).sendKeys("9908820008");

		//click next
		driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();				
		Thread.sleep(5000);
		
		//verify login process
		String url = driver.getCurrentUrl();
		System.out.println(url);

		if(url.contains("https://mail.google.com/mail/u/0/#inbox")) {
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is Fail");
		}
		
		// close Browser
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
