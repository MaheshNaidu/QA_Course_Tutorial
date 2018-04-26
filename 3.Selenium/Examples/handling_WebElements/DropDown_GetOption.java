package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_GetOption 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		Thread.sleep(5000);
		driver.get("https://www.facebook.com");
		
		// Select DropDown
		Thread.sleep(5000);
		Select day = new Select(driver.findElement(By.name("birthday_day")));		
		List<WebElement> l = day.getOptions();		
		l.get(11).click();
		
		
		// Select Month
		Thread.sleep(5000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));		
		List<WebElement> ml = month.getOptions();		
		ml.get(5).click();
		
		
		// Close Driver
		Thread.sleep(5000);
		driver.close();

	}

}
