package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class Login  extends BaseClass
{
  public Login(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public @FindBy(xpath="//input[@id='email']")
  WebElement email;
  
  public @FindBy(xpath="//input[@id='userpassword']")
  WebElement password;
  
  public @FindBy(xpath="//button[@type='submit']")
  WebElement signIn;
  
  public void enterEmail(String mail)
  {
	  email.sendKeys(mail);
  }
  public void enterPassword(String pass)
  {
	  password.sendKeys(pass);
  }
  public void clickSignIn()
  {
	  signIn.click();
  }
  
  public @FindBy(xpath="//button[@class=\"swal2-confirm swal2-styled\"]")
  WebElement logout;
  
  public @FindBy(xpath="//button[@class=\"swal2-confirm swal2-styled\"]")
  WebElement ok;
}
