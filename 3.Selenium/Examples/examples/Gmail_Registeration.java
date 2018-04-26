package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Registeration 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Fire fox Driver
		WebDriver driver = new FirefoxDriver();

		// Open URL
		driver.get("https://accounts.google.com/SignUp?hl=en");
		
		Thread.sleep(5000);
		driver.findElement(By.name("FirstName")).sendKeys("Nadella");

		Thread.sleep(5000);
		driver.findElement(By.name("LastName")).sendKeys("madhu");
		
		Thread.sleep(5000);
		driver.findElement(By.id("GmailAddress")).sendKeys("madhunadella7");
		
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("A123@4567");
		
		Thread.sleep(5000);
		driver.findElement(By.name("PasswdAgain")).sendKeys("A123@4567");
		
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//label[@id='month-label']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=':3']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("BirthDay")).sendKeys("21");
		
		
		Thread.sleep(5000);
		driver.findElement(By.name("BirthYear")).sendKeys("1983");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@id='gender-label']")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=':e']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("8978130325");
		
		Thread.sleep(5000);
		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("madhu1bindu@gmail.com");
		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//label[@id='country-code-label']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=':o']")).click();
		
		Thread.sleep(5000);
		WebElement bNext=driver.findElement(By.id("submitbutton"));
		
		Thread.sleep(5000);
		bNext.click();

	}

}
