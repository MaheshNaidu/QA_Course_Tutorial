package dataDrivenFramework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_Notepad_TestData 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		// file Object
		FileReader f = new FileReader("e:\\testdata.txt");

		// Store the file data into buffer reader
		BufferedReader br = new BufferedReader(f);

		String Line;
		int count =0;

		while((Line=br.readLine())!=null) 
		{
			
			count++;
			
			String input[] =Line.split(" ");
			
			 System.out.println(input[0]);
			 System.out.println(input[1]);			 
			
			 // Open Browser
			 WebDriver driver = new FirefoxDriver();

			 //Open Way2sms URL in the Browser
			 Thread.sleep(5000);
			 driver.get("http://site21.way2sms.com/content/index.html?");

			 //Enter mobile number
			 Thread.sleep(5000);
			 driver.findElement(By.id("username")).sendKeys(input[0]);


			 //Enter password
			 Thread.sleep(5000);
			 driver.findElement(By.name("password")).sendKeys(input[1]);

			 //click login button
			 Thread.sleep(5000);
			 driver.findElement(By.id("loginBTN")).click();

			 // Close Browser
			 Thread.sleep(5000);			 
			 driver.close();
			
		}

	}

}
