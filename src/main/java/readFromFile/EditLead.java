package readFromFile;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {

	@Test(dataProvider="Edit Lead data")  //(groups="smoke") // (dependsOnMethods = {
							// "week3.day1.CreateLead_WdM.CreateLead" })
	public void EditLead_dp(String fname, String uName) throws InterruptedException{

		// Go to Find Leads page
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fname);
		click(locateElement("xpath", ("//button[text()='Find Leads']")));
		Thread.sleep(1000);
		click(locateElement("xpath", ("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		boolean s = verifyTitle("View Lead");
		System.out.println(s + "Page");
		click(locateElement("link", "Edit"));
		type(locateElement("id", "updateLeadForm_companyName"), uName);
		click(locateElement("xpath", ("//input[@value='Update']")));
		WebElement verifyname = locateElement("id", ("viewLead_companyName_sp"));
		String name = getText(verifyname);
		System.out.println(name);
		if (name.contains("Updated")) {
			System.out.print("Updated successfully");
		}

		else
			System.out.print("Not Updated successfully");

	//	closeBrowser();

	}
	
@DataProvider(name="Edit Lead data")	
	
	public Object[][] getData() throws IOException{
	
    ReadExcel data = new ReadExcel();	
   return data.read("EditLead");
    
		
		
	}

}
