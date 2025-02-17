package action;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class ActionClass extends BaseClass
{
	public static void applyBorder(WebElement element, String color)
	{
			
//			//Apply border
//			String script = "arguments[0].style.border= '3px solid" + color+ " ' ";
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript(script, element);
//			Logger.info("Applied the border with color" + color + " to element: " + getElementDescription(by));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.border='3px solid " + color + "'", element);
	}
	public String returnText(WebElement web)
	{
		String text = web.getText();
		return text;
	}
	public static void waitUptoVisible(WebElement web)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(web));
	}
	public static void jsClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}
	
	public static void scrollUptoElement(WebElement element)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});",element);
    }
}
