package week3.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class EditLead_WdM extends ProjectMethods {

	@Test // (dependsOnMethods = {
							// "week3.day1.CreateLead_WdM.CreateLead" })
	public void EditLead() throws InterruptedException {

		

		// Go to Find Leads page
		WebElement Find_Lead = locateElement("link", "Find Leads");
		click(Find_Lead);
		WebElement Fname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(Fname, "fname");
		WebElement Find_Lead1 = locateElement("xpath", ("//button[text()='Find Leads']"));
		click(Find_Lead1);
		Thread.sleep(1000);
		WebElement Leadid = locateElement("xpath", ("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(Leadid);
		boolean s = verifyTitle("View Lead");
		System.out.println(s + "Page");
		WebElement edit = locateElement("link", "Edit");
		click(edit);
		WebElement cname = locateElement("id", "updateLeadForm_companyName");
		type(cname, "swarna_testlaf_Updated");
		WebElement update = locateElement("xpath", ("//input[@value='Update']"));
		click(update);
		WebElement verifyname = locateElement("id", ("viewLead_companyName_sp"));
		String name = getText(verifyname);
		System.out.println(name);
		if (name.contains("Updated")) {
			System.out.print("Updated successfully");
		}

		else
			System.out.print("Not Updated successfully");

		closeBrowser();

	}

}
