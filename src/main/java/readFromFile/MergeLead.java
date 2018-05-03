package readFromFile;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */
public class MergeLead extends ProjectMethods {

	@Test(dataProvider ="Merge")  //(groups = "sanity", dependsOnGroups = "smoke")
	public void MergeLead_dp(int FromLeadID, int ToLeadID) throws InterruptedException {


		// Go to Merge Leads page
		WebElement Merge_Lead = locateElement("link", "Merge Leads");
		Merge_Lead.click();

		// Click on From Lead icon
		WebElement from_LeadID = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		from_LeadID.click();
		// Select LeadID for From Lead
		switchToWindow(1);
		WebElement LeadID = locateElement("class", "id");
		type(LeadID, ""+FromLeadID);
		WebElement FindLead = locateElement("xpath", "//button[text()='Find Leads']");
		FindLead.click();
		Thread.sleep(10000);
		WebElement Id = locateElement("link", ""+FromLeadID);
		Id.click();
		switchToWindow(0);

		// Click on From Lead icon
		WebElement to_LeadID = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		to_LeadID.click();

		// Select LeadID for To Lead
		switchToWindow(1);
		WebElement lead1 = locateElement("class", "id");
		type(lead1, ""+ToLeadID);
		WebElement FindLead1 = locateElement("xpath", "//button[text()='Find Leads']");
		FindLead1.click();
		Thread.sleep(10000);
		WebElement Id1 = locateElement("link", ""+ToLeadID);
		Id1.click();
		switchToWindow(0);

		// Merge Lead
		WebElement MergeLead = locateElement("link", "Merge");
		MergeLead.click();
		acceptAlert();

	}
@DataProvider(name="Merge")	
	public Integer[][] getLeadIds(){
		Integer[][] leadId = new Integer[1][2];
		leadId[0][0]=13481;
		leadId[0][1]=13487;
        return leadId;
		
	}
	
	
	

}
