package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DocMigration extends BaseClass 
{
   public DocMigration(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public @FindBy(xpath="//span[contains(text(),'DocMigration')]")
   WebElement doc_migr;
   
   public @FindBy(xpath="//div[@class='multiselect__tags']")
   WebElement dropdown;
   
   public @FindBy(xpath="//span[@class='multiselect__option multiselect__option--highlight']")
   WebElement docToDita;
   
   public @FindBy(xpath="//img[@class='img-fluid']")
   WebElement uploadFile;
   
   public @FindBy(xpath="//input[@name=\"checkbox-1\"]")
   WebElement checkbox;
   
   public @FindBy(xpath="//button[normalize-space()='Upload']")
   WebElement upload_button;
   
   public @FindBy(xpath="//div[@class=\"toast-body\"]")
   WebElement UpSuccessMessage;
   
   public @FindBy(xpath="//button[@class=\"btn btn-primary btn-sm\"]")
   WebElement preFlightCheck;
   
   public @FindBy(xpath="//div[@class=\"toast-body\"]")
   WebElement preFlightCheck_Msg;
   
   public @FindBy(xpath="//button[@class=\"btn btn-primary btn-sm\"]")
   WebElement convert_now;
   
   public @FindBy(xpath="//div[@class=\"toast-body\"]")
   WebElement converted_msg;
   
   public @FindBy(xpath="//button[@class=\"swal2-confirm swal2-styled\"]")
   WebElement verify_now;
   
   public @FindBy(xpath="//span[@class=\"custom-text ml-2\"]")
   WebElement view_output;
   
   public @FindBy(xpath="//div[@class='toast-body']")
   WebElement post_fc_success_msg;
   
   
}
