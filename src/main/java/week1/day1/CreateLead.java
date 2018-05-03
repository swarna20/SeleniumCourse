package week1.day1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
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
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
		 scan.close();
		// driver.findElementByClassName("smallSubmit").click();
		 String cname= driver.findElementById("viewLead_companyName_sp").getText();
		 
		System.out.println(cname);  
		
		System.out.println(cname.substring(cname.lastIndexOf("(") + 1));
 

		
	
	
	}
		
}


