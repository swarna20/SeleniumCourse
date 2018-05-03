package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableListReverse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.findElementById("chkSelectDateOnly").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		List<String> train = new ArrayList<String>();
		List<WebElement> trainslist = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]");
		for (WebElement webElement : trainslist) {
			train.add(webElement.getText());
		}
		Collections.sort(train);
		System.out.println(train);
		
		Collections.reverse(train);
		System.out.println(train);

		Thread.sleep(1000);

		driver.findElementByXPath("//a[text()='Train Name']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//a[text()='Train Name']").click();

		List<String> train1 = new ArrayList<String>();
		List<WebElement> trainslist1 = driver.findElementsByXPath("//table[@class='DataTable TrainList']//tr/td[2]");
		for (WebElement ele : trainslist1) {
			train1.add(ele.getText());
		}
		
		System.out.println(train1);

		if(train.equals(train1)){
			System.out.println("correct");
		}
		else{
			System.out.println("wrong");

			
		}

	}

}
