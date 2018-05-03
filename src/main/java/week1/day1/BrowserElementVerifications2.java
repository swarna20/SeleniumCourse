package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by swarnalatha.valluru on 12/18/2017.
 */
public class BrowserElementVerifications2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        System.out.println( "Page Title is:" + driver.getTitle());
        System.out.println("Page URL is: " + driver.getCurrentUrl());
       // System.out.println("Page Source is: " + driver.getPageSource());
       System.out.println("Email element type is: " + driver.findElement(By.id("username")).getAttribute("size"));
       
       System.out.println("Back ground color is:" + driver.findElement(By.tagName("h2")).getCssValue("background-color"));
       System.out.println("Element text is:" +  driver.findElement(By.tagName("h2")).getText());
       System.out.println("Element location is:" +  driver.findElement(By.tagName("h2")).getLocation());
       System.out.println("Element X coordinate location is:" +  driver.findElement(By.tagName("h2")).getLocation().getX());
       System.out.println("Element y coordinate location is:" +  driver.findElement(By.tagName("h2")).getLocation().getY());
       
       System.out.println("Element class location is:" +  driver.findElement(By.tagName("h2")).getLocation().getClass());

       System.out.println("Element size is:" +  driver.findElement(By.tagName("h2")).getSize());

       System.out.println("Element height is:" +  driver.findElement(By.tagName("h2")).getSize().getHeight());
       System.out.println("Element Width is:" +  driver.findElement(By.tagName("h2")).getSize().getWidth());
       System.out.println("Element class size is:" +  driver.findElement(By.tagName("h2")).getSize().getClass());
       
       System.out.println("Element Tag name is:" +  driver.findElement(By.tagName("h2")).getTagName());
       

      boolean isavailble = driver.findElement(By.id("username")).isDisplayed();
      System.out.println("Element is available: " + isavailble);
      
      boolean isaenabled = driver.findElement(By.id("username")).isEnabled();
      System.out.println("Element is enabled: " + isaenabled);
      
      boolean isselected = driver.findElement(By.id("username")).isSelected();
      System.out.println("Element is selected: " + isselected);

       driver.close();

   



    }
}
