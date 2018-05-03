package week3.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */
public class MergeLead_WdM extends ProjectMethods {

	@Test(groups = "sanity", dependsOnGroups = "smoke")
	public void MergeLead() throws InterruptedException {
		String FromLeadID = "10331";
		String ToLeadID = "10315";

		// Go to Merge Leads page
		WebElement Merge_Lead = locateElement("link", "Merge Leads");
		Merge_Lead.click();

		// Click on From Lead icon
		WebElement from_LeadID = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		from_LeadID.click();
		// Select LeadID for From Lead
		switchToWindow(1);
		WebElement LeadID = locateElement("class", "id");
		type(LeadID, FromLeadID);
		WebElement FindLead = locateElement("xpath", "//button[text()='Find Leads']");
		FindLead.click();
		Thread.sleep(10000);
		WebElement Id = locateElement("link", FromLeadID);
		Id.click();
		switchToWindow(0);

		// Click on From Lead icon
		WebElement to_LeadID = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		to_LeadID.click();

		// Select LeadID for To Lead
		switchToWindow(1);
		WebElement lead1 = locateElement("class", "id");
		type(lead1, ToLeadID);
		WebElement FindLead1 = locateElement("xpath", "//button[text()='Find Leads']");
		FindLead1.click();
		Thread.sleep(10000);
		WebElement Id1 = locateElement("link", ToLeadID);
		Id1.click();
		switchToWindow(0);

		// Merge Lead
		WebElement MergeLead = locateElement("link", "Merge");
		MergeLead.click();
		acceptAlert();

	}

}
