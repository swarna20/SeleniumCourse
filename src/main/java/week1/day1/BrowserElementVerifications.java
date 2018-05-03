package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by swarnalatha.valluru on 12/18/2017.
 */
public class BrowserElementVerifications {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        System.out.println( "Page Title is:" + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
       // System.out.println("Page Source is: " + driver.getPageSource());
       System.out.println("Email element type is: " + driver.findElement(By.id("email")).getAttribute("type"));
      
        driver.findElement(By.xpath("//button[text() ='Create Account']")).click();



        /*                
        getCssValue
                getText


        getLocation
                getSize
        getTagName


                isDisplayed
        isEnabled
                isSelected

*/




    }
}
