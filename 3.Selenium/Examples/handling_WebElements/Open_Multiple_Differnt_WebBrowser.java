package handling_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_Multiple_Differnt_WebBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Open Mozill Firefox
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();		
		d.get("http://www.google.co.in");
		
		
		// Open Chrome Browser
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("http://www.facebook.com");
					
		
		// Internetexplorer Driver
		Thread.sleep(5000);
		System.setProperty("webdriver.ie.driver","C:/IEDriverServer_Win32_3.9.0/IEDriverServer.exe");
		WebDriver i=new InternetExplorerDriver();
		i.get("http://www.youtube.com");
		
		
		// Close the browser
		d.close();
		c.close();
		i.close();
		

	}

}
