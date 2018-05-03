package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */
public class MergeLead  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        String FromLeadID = "10173";
        String ToLeadID = "10174";
        

        Leads l = new Leads();
    ChromeDriver driver =  l.driver;
        l.login("DemoSalesManager","crmsfa");
        l.goToCrm_sfaPage();
        l.goToLeadsPage();
        l.goToMergeLeads();
       
          
        List<WebElement> ids =  driver.findElementsByXPath("(//img[@src='/images/fieldlookup.gif'])");
               
      for(int i=0; i<=1; i++){
         
    	ids.get(i).click();
    	String LeadId[]={FromLeadID,ToLeadID};
        Set<String> windows = driver.getWindowHandles();
        List<String> wind = new ArrayList<String>();
        wind.addAll(windows);
        driver.switchTo().window(wind.get(1));
        if (driver.getTitle().contains("Find Leads")) {
            driver.findElementByName("id").sendKeys(LeadId[i]);
            driver.findElementByXPath("(//button[text()='Find Leads'])").click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.linkText(LeadId[i])).click();
            driver.switchTo().window(wind.get(0));

         }
      }
        
         
        driver.findElementByLinkText("Merge").click();
        driver.switchTo().alert().accept();
        l.goToMergeLeads();

        driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'][1])").click();;
        Set<String> windows3 = driver.getWindowHandles();
        List<String> wind3 = new ArrayList<String>();
        wind3.addAll(windows3);
        driver.switchTo().window(wind3.get(1));
        if (driver.getTitle().contains("Find Leads")) {
            driver.findElementByName("id").sendKeys(FromLeadID);
            driver.findElementByXPath("(//button[text()='Find Leads'])").click();
           String Results = driver.findElementByXPath("(//div[text()='No records to display'])").getText();          
           System.out.println(Results);

         }
        driver.close();

    }
}

