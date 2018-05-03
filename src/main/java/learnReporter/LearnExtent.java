package learnReporter;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtent {
	@Test
	public void learnExtent() {		
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		report.loadConfig(new File("./extent_config.xml"));
		ExtentTest test = report.startTest("TC001_CreateLead", "Create a new Lead in LeafTaps");
		test.assignCategory("smoke");
		test.assignAuthor("RAM");
		test.log(LogStatus.PASS, "DemoSalesManager is entered successFully"
				+test.addScreenCapture("./../snaps/116098090.jpg"));
		test.log(LogStatus.PASS, "crmsfa is entered successFully "
				+test.addScreenCapture("./../snaps/116098090.jpg"));
		test.log(LogStatus.FAIL, "Login button could not be clicked"
		+test.addScreenCapture("./../snaps/116098090.jpg"));
		report.endTest(test);
		report.flush();
		
	}
	

}