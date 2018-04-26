package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selection_Methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("https://www.facebook.com");
		
		// Select Day
		Thread.sleep(5000);
		Select day = new Select(driver.findElement(By.name("birthday_day")));		
		day.selectByIndex(21);
		
		
		// Select Month
		Thread.sleep(5000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));		
		month.selectByVisibleText("Sept");
		
		// Select Year		
		Thread.sleep(5000);
		Select year = new Select(driver.findElement(By.name("birthday_year")));		
		year.selectByValue("1995");
		
		
		// Close Browser
		Thread.sleep(5000);
		driver.close();

	}

}
