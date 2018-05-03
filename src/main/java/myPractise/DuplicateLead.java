package myPractise;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods {

	@Test
	public void DL() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("xpath", "//input[@value='Login']"));
		//click(locateElement("class", "decorativeSubmit"));		
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Leads"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[5]/a"));
		click(locateElement("link", "Duplicate Lead"));
		click(locateElement("xpath", "//input[@value='Create Lead']"));

	}
}
