package docMigrationValidation;


import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjectModel.DocMigration;

public class VerifyIPSourceDropdown  extends BaseClass
{
  @Test
  public void verifyDropdown() throws InterruptedException
  {
	 DocMigration dm = new DocMigration(driver);
	 dm.doc_migr.click();
	 dm.dropdown.click();
	 dm.docToDita.click();
	 Thread.sleep(2000);
	// dm.uploadFile.click();
	 Thread.sleep(2000);
//	try {
//		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\UploadFile.exe"+" " + "C:\\Users\\Admin\\Downloads\\PrinterUser'sGuide.docx");
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	 String project_path = System.getProperty("user.dir");
	 dm.uploadFile.sendKeys(project_path+"\\input\\PrinterUser'sGuide.docx");
  }
}
