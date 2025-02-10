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
   
   
}
