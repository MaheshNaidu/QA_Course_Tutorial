package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_RadioButtons 
{

	public static void main(String[] args) throws InterruptedException 
	{
			// Create WebDriver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
			
			// Open URL
			Thread.sleep(5000);		
			d.get("http://newtours.demoaut.com");
			
			
			// Enter User Name
			Thread.sleep(5000);	
			d.findElement(By.name("userName")).sendKeys("mahesh");
					
			
			// Enter Password
			Thread.sleep(5000);	
			d.findElement(By.name("password")).sendKeys("mahesh");
			
			
			// click Sign In Button
			Thread.sleep(5000);	
			d.findElement(By.name("login")).click();
			
			
			// Select One Way Radio Button
			Thread.sleep(5000);	
			d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
			String result1=d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).getAttribute("value");
		    System.out.println("Radio button1 : "+result1);
			
			// Select Two Way Radio Button
			Thread.sleep(5000);	
			d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
			String result2 = d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).getAttribute("value");
			System.out.println("Radio Button2 : "+result2);
			
			
			// close Browser
			Thread.sleep(5000);
			d.close();
				


	}

}
