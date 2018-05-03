package week2.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in");
        driver.findElement(By.linkText("Contact Us")).click();
       Set<String> windows = driver.getWindowHandles();
       int windows_cnt= windows.size();
         System.out.println(windows_cnt);
         List<String> s = new ArrayList<String>();
         s.addAll(windows);
      
      driver.switchTo().window(s.get(1));
      System.out.println(driver.getCurrentUrl());
      driver.close();
      driver.switchTo().window(s.get(0));
      driver.findElement(By.id("usernameId")).sendKeys("Hello");
      driver.findElement(By.id("loginbutton")).click();
   String alertText=   driver.switchTo().alert().getText();
   System.out.println(alertText);
   driver.switchTo().alert().accept();
   
   


	}

}
