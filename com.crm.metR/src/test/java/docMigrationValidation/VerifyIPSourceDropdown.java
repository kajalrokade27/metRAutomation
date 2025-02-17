package docMigrationValidation;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjectModel.DocMigration;

public class VerifyIPSourceDropdown  extends BaseClass
{
  @Test
  public void verifyDropdown() throws InterruptedException, AWTException
  {
	 DocMigration dm = new DocMigration(driver);
	 dm.doc_migr.click();
	 dm.dropdown.click();
	 dm.docToDita.click();
	 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].click();",dm.uploadFile);
     
     StringSelection filePathSelection =new StringSelection("C:\\Users\\Admin\\Downloads\\PrinterUser'sGuide.docx");

     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
     Thread.sleep(3000);
     
     Robot rb = new Robot();
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     
     Thread.sleep(1000);
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(5000);
     
     js.executeScript("arguments[0].click();",dm.checkbox);
     dm.upload_button.click();
     
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     wait.until(ExpectedConditions.visibilityOf(dm.UpSuccessMessage));
     String successMsg_text = dm.UpSuccessMessage.getText();
     
     assertTrue(successMsg_text.contains("uploaded successfully"));
     Reporter.log("File uploaded successfully", true);
     
     dm.preFlightCheck.click();
     wait.until(ExpectedConditions.visibilityOf(dm.preFlightCheck_Msg));
     assertTrue(dm.preFlightCheck_Msg.isDisplayed());
     Reporter.log("Pre-flight check successful.", true);
     
     Thread.sleep(2000);
     dm.convert_now.click();
     wait.until(ExpectedConditions.visibilityOf(dm.converted_msg));
     
     assertTrue(dm.converted_msg.isDisplayed());
     Reporter.log("Files converted successfully.", true);
     
     dm.verify_now.click();
     assertTrue(dm.post_fc_success_msg.isDisplayed());
     Reporter.log("Post-flight check successful", true);
     
     dm.view_output.click();
     
  }
}
