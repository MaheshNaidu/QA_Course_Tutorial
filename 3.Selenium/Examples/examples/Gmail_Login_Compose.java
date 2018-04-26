package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Compose {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();

		//Open Gmail URL

		driver.get("https://www.gmail.com");

		//Enter Email ID

		driver.findElement(By.id("identifierId")).sendKeys("ravikanth.softwaresys");

		//Click next button

		driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']")).click();
			

		Thread.sleep(3000);
		//Enter password

		driver.findElement(By.name("password")).sendKeys("mintubabu@5888");

		//click next

		driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();
				
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("to")).sendKeys("rvsatyam789@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("subjectbox")).sendKeys("Welcome to selenium world");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //DIV[contains(@id,':nb')]")).sendKeys("Hi");
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		
	}

}
