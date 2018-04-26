package dataDrivenFramework;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Scanner_Enter_TestData 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Test Loop
		for(int i=1; i<4; i++) 
		{
			
			// Create the scanner Class Object
			@SuppressWarnings("resource")
			Scanner S = new Scanner(System.in);
			
			
			System.out.println("Enter Email id");			
			String x = S.nextLine();
			
			System.out.println("Enter password");			
			String y = S.next();
			
			// Open Driver		
			Thread.sleep(3000);	
			WebDriver driver = new FirefoxDriver();
		
			//Open Gmail URL	
			Thread.sleep(3000);	
			driver.get("https://www.gmail.com");
		
			//Enter Email ID	
			Thread.sleep(3000);	
			driver.findElement(By.id("identifierId")).sendKeys(x);
		
			//Click next button	
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']")).click();
			
			
			//Enter password
			Thread.sleep(3000);		
			driver.findElement(By.name("password")).sendKeys(y);
		
			//click next		
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();
			
			
			// Close Browser
			Thread.sleep(5000);			
			driver.close();
			
		}
	}

}
