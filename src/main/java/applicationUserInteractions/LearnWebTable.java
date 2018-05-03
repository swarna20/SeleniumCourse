package applicationUserInteractions;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NLR", Keys.TAB);
		// driver.findElementById("buttonFromTo").click();
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(table));
		// Thread.sleep(3000);
		String trainNmae = table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(1).getText();

		System.out.print(trainNmae);

		driver.close();
	}

}
