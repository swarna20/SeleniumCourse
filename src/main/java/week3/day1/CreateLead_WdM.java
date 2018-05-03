package week3.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateLead_WdM extends ProjectMethods {

	@Test //, invocationCount=2,invocationTimeOut=180000)
	public void CreateLead() {


		// Go to create Lead page
		WebElement createLead = locateElement("link", "Create Lead");
		click(createLead);

		// Enter required data for create lead and submit
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "swarna_TestLeaf");
		WebElement FName = locateElement("id", "createLeadForm_firstName");
		type(FName, "F_TestLeaf");
		WebElement LName = locateElement("id", "createLeadForm_lastName");
		type(LName, "L_TestLeaf");
		WebElement email = locateElement("id", "createLeadForm_primaryEmail");
		type(email, "swarna.test@gmail.com");
		type((locateElement("id", "createLeadForm_primaryPhoneNumber")), "9840775979");

		WebElement CreateLead1 = locateElement("xpath", "//input[@value='Create Lead']");
		click(CreateLead1);

		// String company_name=
		// driver.findElementById("viewLead_companyName_sp").getText();

		// System.out.print(company_name);

		closeBrowser();

	}

}
