package week4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	@Test(dataProvider="Fetch Data")   //(groups="smoke") //, invocationCount=2,invocationTimeOut=180000)
	public void CreateLead_dp(String comp,String fname, String lname, String email, int phone ) {

		// Go to create Lead page
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);

		// Enter required data for create lead and submit
		type(locateElement("id", "createLeadForm_companyName"), comp);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		
		selectDropDownUsingValue(locateElement("name", "dataSourceId"), "LEAD_EMPLOYEE");
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type((locateElement("id", "createLeadForm_primaryPhoneNumber")), ""+phone);

		WebElement CreateLead1 = locateElement("xpath", "//input[@value='Create Lead']");
		verifyDisplayed(CreateLead1);
		verifySelected(CreateLead1);
		verifyEnabled(CreateLead1);
			click(CreateLead1);

		
}
	
	@DataProvider(name="Fetch Data")
	public Object[][] getData(){
		
		Object[] [] data = new Object[2][5];
		
		data[0][0] = "company_swarna";
		data[0][1] = "swarna";
		data[0][2] = "latha";
		data[0][3] = "swarna.test@testleaf.com";
        data[0][4] =  984077597;
        
  
		data[1][0] = "company_latha";
		data[1][1] = "sri";
		data[1][2] = "priya";
		data[1][3] = "latha.test@testleaf.com";
        data[1][4] =  123456789;

        return data;
	}

}
