package applicationUserInteractions;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			driver.findElementByXPath("//button[text()='✕']").click();
		} catch (Exception e) {

		}
		WebElement electronics= driver.findElementByXPath("//span[text()='Electronics']");
		WebElement apple= driver.findElementByXPath("//span[text()='Apple']");
		WebElement Men = driver.findElementByXPath("//span[text()='Men']");
		WebElement shorts = driver.findElementByXPath("//span[text()='Shorts']");
		Actions builder = new Actions(driver);
		/*builder.moveToElement(electronics).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(apple));
		builder.click(apple).build().perform();*/
		builder.moveToElement(Men).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(shorts));
		builder.click(shorts).perform();
		WebElement shortcom = driver.findElementByXPath("//a[starts-with(@title, 'Vimal')]");
		wait.until(ExpectedConditions.elementToBeClickable(shortcom));

	builder.contextClick(shortcom).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> allHandles = new ArrayList<>();
	
	allHandles.addAll(windowHandles);
	driver.switchTo().window(allHandles.get(1));
	System.out.println(driver.getTitle());
}
	
}
