package testNg_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class AfterSuite_Example 
{
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void VerifyTitle() 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
				
		driver.get("https://www.gmail.com");
				
		String Atitle = driver.getTitle();
				
		String Etitle ="Gmail";
				
		Assert.assertEquals(Atitle, Etitle);
	}
		
	@AfterSuite
	public void GLogin() throws InterruptedException 
	{
		driver.findElement(By.id("identifierId")).sendKeys("ravikanth.softwaresys");
	
		//Click next button
	
		driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']")).click();
					
	
		Thread.sleep(3000);
	
		//Enter password
	
		driver.findElement(By.name("password")).sendKeys("mintubabu@5888");
	
		//click next
	
		driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();
		
	}

}
