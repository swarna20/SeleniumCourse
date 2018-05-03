package utils;

import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporter {

	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void startReport() {
		report = new ExtentReports("./reports/results.html", false);
	}

	//@BeforeMethod
	public void startTest(String testCase, String testDesc) {
		test = report.startTest(testCase, testDesc);
	}

	public abstract long takeSnap();

	public void reportStep(String desc, String status) {
		long snapnumber = takeSnap();
		desc = desc + test.addScreenCapture("./reports/images/" + snapnumber + ".jpeg");
		if (status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc);
		} else if (status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, desc);
		}

	}

	@AfterMethod
	public void stopTest() {
		report.endTest(test);
	}

	@AfterSuite
	public void closeReport() {
		report.flush();
	}

}
