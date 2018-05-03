package wdMethods;


import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


public class ProjectMethods extends SeMethods {

	@BeforeMethod(groups = "common") // (invocationCount=4, threadPoolSize=4,invocationTimeOut=250000)
		@Parameters({ "ubrowser", "url", "uname", "upassword" })
	public void login(String browser, String url, String uname, String userpassword) {
		startApp(browser, url);

		// find user name
		WebElement username = locateElement("id", "username");

		// and pass the value
		type(username, uname);

		// find the password
		WebElement password = locateElement("id", "password");
		type(password, userpassword);

		// find the login
		WebElement login = locateElement("xpath", "//input[@value='Login']");
		click(login);

		// find the CRM/SFA
		WebElement crmsfa = locateElement("link", "CRM/SFA");
		click(crmsfa);

		WebElement leads = locateElement("xpath", "//a[contains(text(), 'Leads')]");
		click(leads);

	}

	
	@AfterMethod
	public void close() {
		closeAllBrowsers();
		//System.out.println("After method annotation");
	}
	
/*	@BeforeMethod
	public void bMethod() {
		System.out.println("Before method annotation");
	}

	@BeforeSuite
	public void bSuite() {
		System.out.println("Before suite annotation");
	}
	@AfterSuite
	public void aSuite() {
		System.out.println("After suite annotation");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("Before Test annotation");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("After Test annotation");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Before class annotation");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("Before class annotation");
	}*/
	
	
	
}