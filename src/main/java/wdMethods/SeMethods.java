package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporter;

public class SeMethods extends Reporter implements WdMethods {

	RemoteWebDriver driver;

	
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The browser " + browser + " launched");
		} catch (NullPointerException e) {
			System.err.println("URL is not loaded");
			throw new RuntimeException("Stopped execution as exception found");

		} catch (WebDriverException e) {
			System.err.println("Browser not launched");
			throw new RuntimeException("Stopped execution as exception found");

		} finally {
			takeSnap();

		}

	}

	
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return driver.findElementById(locValue);
			case "class":
				return driver.findElementByName(locValue);
			case "link":
				return driver.findElementByLinkText(locValue);
			case "xpath":
				return driver.findElementByXPath(locValue);
			case "name":
				return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");

		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");

		} finally {
			takeSnap();
		}
		return null;
	}

	
	public WebElement locateElement(String locValue) {
		WebElement webele = null;
		try {
			webele = driver.findElementById(locValue);
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

		return webele;
	}

	
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text " + data + " is entered");
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element " + ele + " is clicked");
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void clickNoSnap(WebElement ele) {
		// TODO Auto-generated method stub

	}

	
	public String getText(WebElement ele) {
		String text = null;
		try {
			text = ele.getText();
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

		return text;
	}

	
	public void selectDropDownUsingText(WebElement ele, String text) {
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(text);
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {

		try {
			Select s = new Select(ele);
			s.selectByValue(value);
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public boolean verifyTitle(String expectedTitle) {
		boolean title = false;
		try {
			if (driver.getTitle().contains(expectedTitle)) {
				title = true;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}
		return title;
	}

	
	public void verifyExactText(WebElement ele, String expectedText) {

		try {
			if (ele.getText().equals(expectedText)) {
				System.out.println("Text " + expectedText + " is matching exactly");
			} else {
				System.out.println("Text " + expectedText + " is not matching exactly");

			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}
	}

	
	public void verifyPartialText(WebElement ele, String expectedText) {

		try {
			if (ele.getText().contains(expectedText)) {
				System.out.println("Text " + expectedText + " is matching partially");
			} else {
				System.out.println("Text " + expectedText + " is not matching partially");

			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			if (ele.getAttribute(attribute).equals(value)) {
				System.out.println("Attribute " + value + " is matching exactly");
			} else {
				System.out.println("Attribute " + value + " is not matching exactly");

			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			if (ele.getAttribute(attribute).contains(value)) {
				System.out.println("Attribute " + value + " is matching partially");
			} else {
				System.out.println("Attribute " + value + " is not matching partially");

			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void verifySelected(WebElement ele) {

		try {
			if (ele.isSelected()) {
				System.out.println("element is selected");

			} else {
				System.out.println("element is not selected");

			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void verifyDisplayed(WebElement ele) {

		try {
			if (ele.isDisplayed()) {
				System.out.println("element is displayed");
			} else {
				System.out.println("element is not displayed");
			}
		} catch (NoSuchElementException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	public void verifyEnabled(WebElement ele) {

		try {
			if (ele.isEnabled()) {
				System.out.println(ele+ " is Enabled");
			} else {
				System.out.println("element is not Enabled");

			}
		} catch (NotFoundException e) {
			System.err.println("Required element is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	public void switchToWindow(int index) {
		try {
			Set<String> w = driver.getWindowHandles();
			List<String> windows = new ArrayList<String>();
			windows.addAll(w);
			driver.switchTo().window(windows.get(index));
		} catch (NoSuchWindowException e) {
			System.err.println("Required window is not found");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not present");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			;
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not present");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}

	}

	
	public String getAlertText() {
       String  alertText=null;
		try {
			alertText=driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			System.err.println("Alert is not present");
			throw new RuntimeException("Stopped execution as exception found");
		} catch (WebDriverException e) {
			System.err.println("Unknown Error");
			throw new RuntimeException("Stopped execution as exception found");
		} finally {
			takeSnap();
		}
  return alertText;
	}

	
	public long takeSnap() {

		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./reports/images/" + number + ".jpeg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (WebDriverException e) {
			System.out.println("The browser is closed");
			throw new RuntimeException("Stopped execution as exception found");

		} catch (IOException e) {
			System.out.println("File input output error");

			throw new RuntimeException("Stopped execution as exception found");
		}

		return number;
	}

	
	public void closeBrowser() {
		try {
			driver.close();
		} catch (WebDriverException e) {
			System.err.println("Browser is not available");
			throw new RuntimeException("Stopped execution as exception found");
		}

	}

	
	public void closeAllBrowsers() {
		try {
			driver.quit();
		} catch (WebDriverException e) {
			System.err.println("Browser is not available");
			throw new RuntimeException("Stopped execution as exception found");
		}
	}

}
