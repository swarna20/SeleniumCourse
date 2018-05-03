package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FramesLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.findElementByXPath("//button[text() = 'Run »']").click();
		System.out.println("Clicked on Run");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Swarna");
		alert.accept();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(text);
	}

}
