package examples;



import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();

		//Open Gmail URL

		driver.get("http://toolsqa.com/automation-practice-form/");

		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.name("continents"));
		
		e.click();
		
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.name("selenium_commands"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
	
		js.executeScript("arguments[0].scrollIntoView();", e1);		
		
	
		js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
		
		

	}

}
