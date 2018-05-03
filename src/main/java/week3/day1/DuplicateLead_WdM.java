package week3.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class DuplicateLead_WdM extends ProjectMethods {

	@Test
	public void DuplicateLead() throws InterruptedException {

		// Find LeadID to duplicate
		WebElement Findlead = locateElement("xpath", "//a[contains(@href, 'findLeads')]");
		click(Findlead);
		WebElement LeadName = locateElement("xpath", "(//input[starts-with(@name,'companyName')])[2]");
		type(LeadName, "swarna");
		WebElement Findlead1 = locateElement("xpath", "//button[starts-with(text(),'Find')]");
		click(Findlead1);
		Thread.sleep(1000);
		WebElement leadId = locateElement("link", "swarna_TestLeaf");

		System.out.println(getText(leadId));
		click(leadId);

		WebElement DuplicateLead = locateElement("xpath", " //a[text()= 'Edit']/preceding-sibling::a");
		DuplicateLead.click();

		WebElement createLead1 = locateElement("xpath", "//*[@value='Create Lead']");
		click(createLead1);

		WebElement duplicatename = locateElement("viewLead_companyName_sp");
		String dname = getText(duplicatename);

		Thread.sleep(1000);
		System.out.println("Duplicate lead is created for " + dname);

		closeBrowser();
	}

}
