package week1.day1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		//Enter username, password and then login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		
		//open the CRM/SFA page
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Open creat lead page
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter required data for create lead and submit
		Scanner scan = new Scanner(System.in);
		System.out.println("enter comany name: ");
		driver.findElementById("createLeadForm_companyName").sendKeys(scan.nextLine());
		System.out.println("enter First name: ");
		driver.findElementById("createLeadForm_firstName").sendKeys(scan.nextLine());
		System.out.println("enter Last name: ");
		driver.findElementById("createLeadForm_lastName").sendKeys(scan.nextLine());
		
		//Select last item  listed in soure dropdown

		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select sdropdown = new Select(source);
		List<WebElement> Listdd= sdropdown.getOptions();
		sdropdown.selectByIndex(Listdd.size()-1);
		
		//Select "Road and Track" item  from Marketing dropdown
		WebElement Marketing= driver.findElementById("createLeadForm_marketingCampaignId");
		Select Mdropdown = new Select(Marketing);
		Mdropdown.selectByVisibleText("Road and Track");
		scan.close();
		
		//Select any item  using byvalue method  from  Industry dropdown
		
		WebElement Industry= driver.findElementById("createLeadForm_industryEnumId");
		Select Idropdown = new Select(Industry);
		Idropdown.selectByValue("IND_HEALTH_CARE");

	
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
         
		
		
		
		
	}

}
