package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by swarnalatha.valluru on 12/22/2017.
 */
public class DuplicateLead extends  Leads {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    //ChromeDriver driver = new ChromeDriver();
       //driver.get("http://leaftaps.com/opentaps");
       Leads l = new Leads();

        l.login("DemoSalesManager","crmsfa");
        l.goToCrm_sfaPage();
        l.goToLeadsPage();
        ChromeDriver  driver = l.driver;
        String company_name =l.FindLead("swarna.test@gmail.com");
        driver.findElement(By.linkText(company_name)).click();

        driver.findElement(By.linkText("Duplicate Lead")).click();
        if(driver.getTitle().contains("Duplicate Lead") ){
            System.out.println("Duplicate Lead page is displayed");
            driver.findElementByXPath("(//input[@value='Create Lead'])").click();
            String duplicatename =driver.findElement(By.id("viewLead_companyName_sp")).getText();
            if(duplicatename.contains(company_name)){
                System.out.println("Duplicate lead is created for"+" "+company_name );
            }
            else
                System.out.println("Duplicate lead is not created for : "+" "+company_name );

        }

         driver.close();
    }
}
