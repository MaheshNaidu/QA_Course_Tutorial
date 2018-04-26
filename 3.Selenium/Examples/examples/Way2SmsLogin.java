package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2SmsLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();


		//Open Way2sms URL in the Browser

		driver.get("http://site21.way2sms.com/content/index.html?");

		//Enter mobile number
		driver.findElement(By.id("username")).sendKeys("9063715888");


		//Enter password

		driver.findElement(By.name("password")).sendKeys("1234");

		//click login button

		driver.findElement(By.id("loginBTN")).click();

		Thread.sleep(5000);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		if(url.contains("sessionid")) {
			System.out.println("Test case is pass");
		}
		else
		{
		System.out.println("Test case is Fail");	
		}
		
		// close Browser
		Thread.sleep(5000);
		driver.close();


	}

}
