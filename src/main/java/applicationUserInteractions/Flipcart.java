package applicationUserInteractions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electonics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement apple = driver.findElementByXPath("//span[text()='Apple']");
		Actions builder = new Actions(driver);
		builder.click(electonics).perform();

		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.elementToBeClickable(apple));
		builder.click(apple).perform();

	}

}
