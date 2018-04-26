package handling_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	
	public WebDriver driver;
	
	By M = By.id("username");
	
	By P = By.name("password");
	
	By L = By.id("loginBTN");
	
	@Test
	public void Browser(WebDriver driver) {
		
		this.driver= driver;
	}
	@Test
   public void EnterMobile(String user) {
	   driver.findElement(M).sendKeys(user);
   }
   @Test
   public void PasswordEnter(String pass) {
	   driver.findElement(P).sendKeys(pass);
   }
   
   @Test
   public void Clicklogin() {
	   driver.findElement(L).click();
   }
   
}
