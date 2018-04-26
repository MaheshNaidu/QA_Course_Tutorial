package handling_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM {

	public static void main(String[] args) 
	{		
		// Open Driver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Open URL
		driver.get("http://site21.way2sms.com/content/index.html?");
		
		// Create the Object Repository 
		ObjectRepository obj = new ObjectRepository();
		
		obj.Browser(driver);
		
		obj.EnterMobile("9063715888");
		
		obj.PasswordEnter("1234");
		
		obj.Clicklogin();

	}

}
