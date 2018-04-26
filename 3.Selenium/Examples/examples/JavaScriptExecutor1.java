package examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor1 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('identifierId').value='ravikanth.softwaresys';");
	}

}
