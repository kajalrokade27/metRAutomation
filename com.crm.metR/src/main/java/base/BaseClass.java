package base;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import fileUtility.GetPropertyData;
import pageObjectModel.Login;


public class BaseClass  
{
public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition() throws IOException, InterruptedException
	{
		String browser = GetPropertyData.propData("mr_browser");
		String web_url = GetPropertyData.propData("mr_url");
			
		
		if(browser.equals("chrome"))
		{
			//open the browser
			driver= new ChromeDriver();
			
		}
		if(browser.equals("edge"))
		{
		 driver = new EdgeDriver();
		}
		if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		//maximize the window
       driver.manage().window().maximize();
       //implicit waiting condition
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //Enter into web application
       driver.navigate().to(web_url);
	
       
       Login lg = new Login(driver);	
	    lg.enterEmail("user2@met-r.io");
	    lg.enterPassword("Meta@123");
	    lg.clickSignIn();
       
	    Thread.sleep(3000);
	    assertTrue(lg.logout.isDisplayed());
	    lg.logout.click();
	    Thread.sleep(2000);
	    lg.ok.click();
	    lg.email.clear();
	    lg.enterEmail("user2@met-r.io");
	    lg.password.clear();
	    lg.enterPassword("Meta@123");
	    lg.clickSignIn();
	    Thread.sleep(4000);
	}
//	@AfterClass
//	public void postCondition()
//	{
//		driver.close();
//	}
}
