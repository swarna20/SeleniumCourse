package readFromFile;

import java.io.IOException;

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
		WebElement leadId = locateElement("link", name);

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

	}
	
	@DataProvider(name="companyname")
	public Object[][] getPhone() throws IOException{
		ReadExcel data = new ReadExcel();
		Object[][] read = data.read("DuplicateLead");
		return read;

		
	}

}
