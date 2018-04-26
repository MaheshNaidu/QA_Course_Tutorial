package handling_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Create the Firefox Driver
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		// 1. get (). It is used to open specified url browser in windows.
		Thread.sleep(5000);
		d.get("http://www.google.co.in");
		
		// 2. getCurrentUrl() Its Returns title of the Browser
		Thread.sleep(5000);
		String url=d.getCurrentUrl();
		System.out.println("Current url : "+url);
		
		
		// 3. getTitle() It is used to get the title of current web page
		Thread.sleep(5000);
		d.getTitle();
		String title=d.getTitle();
		System.out.println(title);
		
		
		// 4. getPageSource().It is used to get the source of current load page
		Thread.sleep(5000);
		String pagesource=d.getPageSource();
		System.out.println(pagesource);
		
		
		// 5. findElement(). It is used to find the first WebElement using the given method.
		Thread.sleep(5000);
		d.get("http://www.google.co.in");
		WebElement gmaillink=d.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		System.out.println(gmaillink.getText());
		
		
		
		//6. findElements(). It is used to find all elements within the current page
		Thread.sleep(5000);
		d.get("http://www.facebook.com");			
		List links=d.findElements(By.tagName("a"));
		
		//Counting no of links in result page
		System.out.println(links.size());


		//7. getWindowHandle(). Whenever the web driver launches the browser it assigns the unique id to that browser which is called as window handler. 
		// This can be captured through the method.
		Thread.sleep(5000);
		d.getWindowHandle();
		
		
		// 8. getWindowHandles(). Whenever multiple windows are opened by webdriver and 
		//we want to capture all their ids. We use this method.
		Thread.sleep(5000);
		d.getWindowHandles();
		
		
		//9. switchTo(). Used to switch from one window to another window (or) window to a frame (or) frame to a window (or) 
		//window to an alert
		Thread.sleep(5000);
		d.switchTo().window("");
		d.switchTo().frame("");
		d.switchTo().alert();
		
		
		// 10. navigate(). The driver to access the browser’s history and to navigate to a given URL&Refresh page.
		Thread.sleep(5000);
		d.get("http://gmail.com");
		
		//navigate to page
		Thread.sleep(5000);
		d.navigate().to("http://estestinghub.com");
		
		//navigate to back
		Thread.sleep(5000);
		d.navigate().back();
		
		//navigate to forward
		Thread.sleep(5000);
		d.navigate().forward();
		
		//navigate to refresh page
		Thread.sleep(5000);
		d.navigate().refresh();

		// 11. manage().This is used to perform maximize the size of the window.
		Thread.sleep(5000);
		d.get("http://gmail.com");
		d.manage().window().maximize();


		//12. close(). Close the current window, if there are multiple windows, it will close the current window which is active and quits the browser
		Thread.sleep(5000);
		d.get("http://www.etestinghub.com");
		d.close();
		
		
		//13. quit(). It is used to close every associated window which is opened.
		Thread.sleep(5000);
		d.get("http://www.etestinghub.com");
		d.quit();



	}

}
