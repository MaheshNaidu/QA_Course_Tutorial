package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Calender 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.mercurytravels.co.in/");
		
		// Manager Window Size
		driver.manage().window().maximize();
		
		// Clcik on flight Menu
		driver.findElement(By.xpath(".//*[@id='flights']")).click();
		
		
		// Select Date Controler
		driver.findElement(By.name("departDate")).click();		
		Thread.sleep(3000);
		
		// Find and click Date
		List<WebElement> table = driver.findElements(By.xpath("html/body/div[10]/div[1]/table/tbody/tr/td"));		
		System.out.println(table.size());
		
		for(int i=0; i<table.size(); i++) 
		{
			
			
			if(i==20)
			{
				table.get(i).click();
			}
		
		}

	}

}
