package readFromFile;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods {

	@Test(dataProvider="phone") //(groups = "sanity") //, dependsOnGroups = "smoke")
	public void deleteLead_dp(String phone) throws InterruptedException {
		// Go to Find Leads page
		click(locateElement("link", "Find Leads"));

		// click on Phone in find leads page
		click(locateElement("xpath", "//span[text()='Phone']"));

		// Enter value for phone field
		type(locateElement("class", "phoneNumber"), phone);

		// Click on Find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(10000);

		// Capture lead id of first listing item
		String leadId = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));

		// click on first listing element
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));

		// Delete lead
		click(locateElement("link", "Delete"));

		// Go to Find Leads page
		click(locateElement("link", "Find Leads"));

		// Enter deleted lead id
		type(locateElement("class", "id"), leadId);

		// Click on Find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		// Print error message
		System.out.println(getText(locateElement("xpath", "(//div[text()='No records to display'])")));

		
	}
	@DataProvider(name="phone")
	public Object[][] getPhone() throws IOException{
		ReadExcel data = new ReadExcel();
		Object[][] phone = data.read("DeleteLead");
		return phone;

		
	}

}