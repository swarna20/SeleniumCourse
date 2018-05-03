package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


/**
 * Created by swarnalatha.valluru on 12/18/2017.
 */
public class Irctc_SignIn {
	
	@Test
    public  void signup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
        driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("SwarnaUser");
        driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Password123");
        driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("Password123");
       //WebElement SQ= driver.findElement(By.id("userRegistrationForm:securityQ"));
        Select SQD = new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
        SQD.selectByVisibleText("What is your pet name?");
        driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("snoopy");
        Select lan = new Select(driver.findElement(By.id("userRegistrationForm:prelan")));
        lan.selectByVisibleText("English");
        driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("Fname");
        driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys("Mname");
        driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("Lname");

       driver.findElements(By.name("userRegistrationForm:gender")).get(1).click();
      driver.findElements(By.name("userRegistrationForm:maritalStatus")).get(0).click();
       Select Bday = new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
       Bday.selectByVisibleText("20");
        Select BMonth = new Select(driver.findElement(By.id("userRegistrationForm:dobMonth")));
        BMonth.selectByVisibleText("JUN");
        Select BYY = new Select(driver.findElement(By.id("userRegistrationForm:dateOfBirth")));
        BYY.selectByVisibleText("1984");

        Select Occupation = new Select(driver.findElement(By.id("userRegistrationForm:occupation")));
        Occupation.selectByVisibleText("Private");

        Select contry = new Select(driver.findElement(By.id("userRegistrationForm:countries")));
        contry.selectByVisibleText("India");

        driver.findElement(By.id("userRegistrationForm:email")).sendKeys("swarnav.valluru@gmail.com");
        driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("9840775979");

        Select Nationality = new Select(driver.findElement(By.id("userRegistrationForm:nationalityId")));
        Nationality.selectByVisibleText("India");

        driver.findElement(By.id("userRegistrationForm:address")).sendKeys("74");
        driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("600119");
       Thread.sleep(50000);

     // driver.findElement(By.id("userRegistrationForm:cityName")).isEnabled();
         Select City = new Select(driver.findElement(By.id("userRegistrationForm:cityName")));
       //City.selectByVisibleText("Kanchipuram");
       City.selectByIndex(1);
     Thread.sleep(50000);
            Select Post_Office = new Select(driver.findElement(By.id("userRegistrationForm:postofficeName")));
         Post_Office.selectByVisibleText("Sholinganallur S.O");
        driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("0402425685");
        driver.findElements(By.name(("userRegistrationForm:resAndOff"))).get(1).click();
       driver.close();
    }
}
