package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */

public class Leads implements IopenTaps  {
	
	
     ChromeDriver driver = new ChromeDriver();

    public void login(String username, String password) throws InterruptedException {

        driver.get("http://leaftaps.com/opentaps");
        driver.findElementById("username").sendKeys(username);
        driver.findElementById("password").sendKeys(password);
        driver.findElementByXPath("(//input[@value='Login'])").click();
        System.out.println("Login is successfull");
        Thread.sleep(1000);
    }


    public void goToCrm_sfaPage() {
         driver.getPageSource();
        driver.findElementByLinkText("CRM/SFA").click();
        String PageTitle= driver.getTitle();
        if(PageTitle.contains("CRM")) {
            System.out.println(PageTitle +" "+ "Page is displayed");
        }
        else {
            System.out.print("CRM page is not displayed");
        }

    }


    public void goToLeadsPage() {
        driver.findElementByLinkText("Leads").click();
        String PageTitle= driver.getTitle();
        if(PageTitle.contains("Leads")) {
            System.out.println(PageTitle +" "+ "Page is displayed");
        }
        else {
            System.out.print("My Leads page is not displayed");
        }


    }


    public String FindLead(String Email) {
        String Name=null;
        driver.findElementByLinkText("Find Leads").click();
        String PageTitle= driver.getTitle();
        if(PageTitle.contains("Find Leads")) {
            System.out.println(PageTitle +" "+ "Page is displayed");

            driver.findElementByXPath("(//span[text()='Email'])").click();
            driver.findElementByName("emailAddress").sendKeys(Email);
            driver.findElementByXPath("(//button[text()='Find Leads'])").click();
            driver.getPageSource();
            Name= driver.findElementByLinkText("swarna_company").getText();
           System.out.println(Name);

        }
        else {
            System.out.print("Find Leads page is not displayed");
        }
        return Name;

    }


    public void goToMergeLeads() {
        driver.findElementByLinkText("Merge Leads").click();
        String PageTitle= driver.getTitle();
        if(PageTitle.contains("Merge Leads")) {
            System.out.println(PageTitle +" "+ "Page is displayed");
        }
        else {
            System.out.print("Merge Leads page is not displayed");
        }

    

    

    }
}
