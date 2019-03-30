
package Jenkins.jtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import PageObjects.loginpage;
//import PageObjects.loginpage;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import junit.framework.TestCase;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

public class jetest extends App
{
	WebDriver driver;
	@Test
	public void TC1() throws IOException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ksayali\\Downloads\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
   		//driver1.manage().window().maximize();
		
       driver.get("https://www.facebook.com/"); //https://edgeconnect.ust-global.com/
		//to access any method from any class need t create an Object of class and then call method of the class with an Object 
		loginpageoject lp = new loginpageoject(driver);
  		lp.email().sendKeys("sayalijkale@gail.com");
	    lp.password().sendKeys("sjkherambha1891");
	  //  lp.sign().click();
	//	@Test
//    public void testApp()
//    {
//		//https://www.facebook.com/
//        System.out.println("Program Run");
//    }
	       
}  
	
	@Test
	public void TC2()
	{		
		System.out.println("Successfully Merged to GitHub from local to Remote repository!!!");
	}
}
