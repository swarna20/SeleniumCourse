package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSourceValues {

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
		
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select sdropdown = new Select(source);
		List<WebElement> Listdd= sdropdown.getOptions();
		
		System.out.println("Values of source field:");

		for (WebElement ele : Listdd) {
			
			System.out.println(ele.getText());
		}
		
				
		driver.findElementById("createLeadForm_companyName").sendKeys("swarna");
		driver.findElementById("createLeadForm_firstName").sendKeys("Lname");
		driver.findElementById("createLeadForm_lastName").sendKeys("Fname");
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
		 
		 String title= driver.getTitle();
		 if(title.contains("View Lead")){
			 
				System.out.println(title);
 
		 }
		 else
			 
				System.out.println("Lead is not  created");

		}
		

		

        		
		
		
	}


