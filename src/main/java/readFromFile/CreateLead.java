package readFromFile;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	@Test(dataProvider="Fetch Data")   //(groups="smoke") //, invocationCount=2,invocationTimeOut=180000)
	public void CreateLead_dp(String comp,String fname, String lname, String email, String phone ) {

		// Go to create Lead page
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);

		// Enter required data for create lead and submit
		type(locateElement("id", "createLeadForm_companyName"), comp);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type((locateElement("id", "createLeadForm_primaryPhoneNumber")), phone);

		WebElement CreateLead1 = locateElement("xpath", "//input[@value='Create Lead']");
		click(CreateLead1);
	//	closeBrowser();

	}
	
	@DataProvider(name="Fetch Data")
	public Object[][] getData() throws IOException{
		
		ReadExcel data = new ReadExcel();
		Object[][] read = data.read("CreateLead");
		return read;
	}

}
