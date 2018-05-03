package week4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {

	@Test(dataProvider="companyname") // (groups="regression")
	public void DuplicateLead_dp(String name) throws InterruptedException {

		// Find LeadID to duplicate
		WebElement Findlead = locateElement("xpath", "//a[contains(@href, 'findLeads')]");
		click(Findlead);
		WebElement LeadName = locateElement("xpath", "(//input[starts-with(@name,'companyName')])[2]");
		type(LeadName, name);
		WebElement Findlead1 = locateElement("xpath", "//button[starts-with(text(),'Find')]");
		click(Findlead1);
		Thread.sleep(1000);
		WebElement leadId = locateElement("xpath", "(//a[starts-with(text(), 'L_TestLeaf')])[2]/following::a[3]");

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
	
	@DataProvider(name="companyname")
	public String[][] getPhone(){
		String[][] cname = new String[2][1];
		cname[0][0] = "swarna";
		cname[1][0] = "latha";
		return cname;

		
	}

}
