package myPractise;



import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Leads_WdM {

	SeMethods se = new SeMethods();
	


	public  void login  () {
		   se.startApp("chrome", "http://leaftaps.com/opentaps");

		//find user name 
		WebElement username = se.locateElement("id", "username");
		
		// and pass the value
		se.type(username, "DemoSalesManager");

		// find the password
		WebElement password = se.locateElement("id", "password");
		se.type(password, "crmsfa");
		
		// find the login
		WebElement login = se.locateElement("xpath", "(//input[@value='Login'])");
		se.click(login);
		
	}
	
	//Go to CRMSFA page
	public  void goToCRMSFAPage() {
		WebElement crmsfa = se.locateElement("link", "CRM/SFA");
		se.click(crmsfa);
	
	}
	
	//Go to Leads  page
	public  void goToLeadsPage  () {
		// find the CRM/SFA
		WebElement Leads = se.locateElement("link", "Leads");
		se.click(Leads);
	
	}
	public  void goToMergeLeads  () {
		// find the CRM/SFA
		WebElement MergeLead = se.locateElement("link", "Merge Leads");
		se.click(MergeLead);
	
	}
	
	public WebElement FindLead(String Email) {
				 
		 WebElement FindLeads = se.locateElement("link", "Find Leads");
		 FindLeads.click();
		 
		 WebElement EmailTab = se.locateElement("xpath", "(//span[text()='Email'])");
		 EmailTab.click();
		 
		 WebElement EmailAddress = se.locateElement("class", "emailAddress");
		 se.type(EmailAddress, Email);

		 WebElement FindLeadsButton = se.locateElement("xpath", "(//button[text()='Find Leads'])");
		 FindLeadsButton.click();
		 
		 WebElement lead = se.locateElement("link", "swarna_TestLeaf");
		 return lead;
	   	       
	    
		
		
	}

}