package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Using_TestNg_DataProvider_GmailLogin_Test 
{
	
	@Test(dataProvider="GmailUrls")
	public void OpenGmails(String Emailid,String Password) throws InterruptedException
	{
		
		// Create the Driver		
		WebDriver d=new FirefoxDriver();
		
		
		// open Gmail		
		d.get("http://www.gmail.com");
					
		
		// set the emailid to gmail textbox	
		Thread.sleep(5000);
		d.findElement(By.id("Email")).sendKeys(Emailid);
		
		
		// click on next button
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='next']")).click();
		
		
		// set the password to gmail password textbox
		Thread.sleep(5000);
		d.findElement(By.name("Passwd")).sendKeys(Password);
		
		
		// click on sign in button
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		
		// click on image
		Thread.sleep(5000);		
		d.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		
		// click on sign out 
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		
		// close broswer
		d.quit();
		
		
		
	}
	
	@DataProvider(name="GmailUrls")
	public Object[][] ReadExcel() throws BiffException, IOException
	{
		
		// create the object of the excel sheet path
		File f=new File("D:\\FrameWorkSheets\\GamilDataDrivenBook.xls");
		
		// get the work book
		Workbook wb=Workbook.getWorkbook(f);
		
		
		// get the sheet
		Sheet s=wb.getSheet("Sheet1");
		
		
		// get the rows and columns 		
		int r=s.getRows();
		int c=s.getColumns();
		
		System.out.println(r);
		System.out.println(c);
		
		
		// Load the sheet data 
		
		String SData[][] = new String[r][c];
		
		for(int i=1;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				// get cell values
				
				Cell v=s.getCell(j,i);
				
				SData[i][j]=v.getContents();
				
			}
		}
		
		
		
		return SData;
		
		
		
	}
	

}
