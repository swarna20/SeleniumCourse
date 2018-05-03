package applicationUserInteractions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Sortable']").click();
		
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		driver.switchTo().frame("241d92881b908b5e23b0a180fac02b72");
		WebElement item1 = driver.findElementByXPath("//li[text()=;'Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		 int x=item4.getLocation().getX();
		 int y= item4.getLocation().getY();

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, 0, y).perform();
		
		


	}

}
