package Jenkins.jtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpageoject 
{
	
	
WebDriver driver;
	
public loginpageoject (WebDriver driver) // constructor
{
	this.driver = driver;
}
		
	By email = By.id("email");
  public WebElement email()
	{
		return driver.findElement(email);
		
	}
	
	By password = By.id("pass");
	public WebElement password()
	{
		return driver.findElement(password);
	 }
	
//	By sign = By.xpath("//*[@id=\"u_0_8\"]");
//	public WebElement sign()
//	{
//		return driver.findElement(sign);
//	 }
//	
	
	
}
