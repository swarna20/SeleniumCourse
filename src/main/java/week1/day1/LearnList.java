package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		List<WebElement> ListItems =driver.findElementsByTagName("a");
		int cnt = ListItems.size();
		System.out.println(ListItems.size());
	    ListItems.get(cnt-1).click();
	    System.out.println(driver.getCurrentUrl());

	}

}
