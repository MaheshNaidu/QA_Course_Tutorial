package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Open Browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
				
		// Open URL
		driver.get("https://www.hdfcbank.com/");
				
		
		// Create Action Class Object
		Actions a = new Actions(driver);
				
		// Move to mouse to element and activate build action
		WebElement main = driver.findElement(By.linkText("Products"));
		a.moveToElement(main).build().perform();				
		Thread.sleep(5000);
				
		
		WebElement sub = driver.findElement(By.linkText("Loans"));				
		a.moveToElement(sub).build().perform();
				
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home Loan")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
