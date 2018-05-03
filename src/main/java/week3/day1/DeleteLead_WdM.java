package week3.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLead_WdM extends ProjectMethods {

	@Test //, dependsOnGroups = "smoke")
	public void deleteLead() throws InterruptedException {
		// Go to Find Leads page
		click(locateElement("link", "Find Leads"));

		// click on Phone in find leads page
		click(locateElement("xpath", "//span[text()='Phone']"));

		// Enter value for phone field
		type(locateElement("class", "phoneNumber"), "9840775979");

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

		// close browser
		closeBrowser();

	}

}