package applicationUserInteractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RightClick {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com");
				WebElement cricket = driver.findElementByXPath("//a[text()='Cricket']");
				Actions builder = new Actions(driver);
				builder.contextClick(cricket).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
				
				
	}

}
