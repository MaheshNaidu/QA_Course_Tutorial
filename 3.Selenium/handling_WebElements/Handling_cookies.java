package handling_WebElements;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_cookies 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Open Driver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
				
		Thread.sleep(5000);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Set<Cookie> c = driver.manage().getCookies();
		
		System.out.println(c);
		
		if(c.isEmpty()) {
			System.out.println("no cookies are available");
		}
		else
		{
			System.out.println("Cookies are available"+c.size());
		}
		
		
		// Find List of Cookies
		ArrayList<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		System.out.println(cookie.size());
		

		for(int i=0; i<cookie.size();i++) 
		{
			String cname = cookie.get(i).getName();
			System.out.println(cname);
			
		}
		
		
		// Using Cookie Login URL
		Cookie ck = driver.manage().getCookieNamed("_js_reg_fb_ref");		
		System.out.println(ck);
		
		Cookie a = new Cookie("mahesh","mahesh123");
		
		driver.manage().addCookie(a);
		
		driver.manage().deleteCookieNamed("mahesh");
		
		
		Cookie d = driver.manage().getCookieNamed("mahesh");
		System.out.println(d);
		
		
		driver.manage().deleteAllCookies();
				
		
		// Close Browser
		Thread.sleep(5000);
		driver.close();

	}

}
