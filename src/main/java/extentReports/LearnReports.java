package extentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class LearnReports {

	public static void main(String[] args) {

		ExtentReports report = new ExtentReports("./reports/results.html", false);
		ExtentTest test = report.startTest("CreateLead", "Create Lead in test leaf");
		test.log(LogStatus.PASS, "User name entered"+test.addScreenCapture("../snaps/snap11.jpg"));
		test.log(LogStatus.PASS, "Password Entered"+test.addScreenCapture("../snaps/snap110.jpg"));
		test.assignAuthor("Swarna");
		test.assignCategory("Smoke");
		report.endTest(test);
		report.flush();
		
	}

}
