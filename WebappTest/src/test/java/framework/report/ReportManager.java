package framework.report;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;

public class ReportManager {
	
	private static String reportLocation = "target/extent-reports/";
	private static ExtentReports extentReports;
	private static boolean reportStarted = false;
	
	private static ExtentReports getInstance() {
		if (extentReports == null) {
			System.out.println("Inside extent report");
			extentReports = new ExtentReports(getReportPath(), true);
			extentReports.addSystemInfo("Test", "Test");
			extentReports.addSystemInfo("Report", "Whatsapp");
		}
		return extentReports;
			
	}

	private static String getReportPath() {
		new File(reportLocation).mkdir();
		return reportLocation + "index.html";
	}
	
	public static ExtentTest start(Scenario scenario) {
		ExtentTest test = null;
		if (!reportStarted) {
			reportStarted = true;
			test = getInstance().startTest(scenario.getName());
		}
		return test;
			
		}
	public static void stop(ExtentTest test) {
		if (test !=null) getInstance().endTest(test);
		getInstance().flush();
		if (reportStarted)
			reportStarted = false;
	
	}
}
