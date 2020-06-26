package Cucumber;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static framework.report.ReportManager.start;
import static framework.report.ReportManager.stop;


public class Hooks extends BaseUtil {

	private WebDriver driver;
	private BaseUtil baseUtil;

	private static boolean extentReportManagerStart = false;
	public static ExtentTest report;
	//public WebDriver driver;

	public Hooks(BaseUtil baseUtil){
		this.baseUtil = baseUtil;
	}

	@Before
	public void before(Scenario scenario) {
		//initialiseDriver();

		System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
		baseUtil.driver = new ChromeDriver();
		baseUtil.driver.manage().window().maximize();
	System.out.println("inside Before");
	if (!extentReportManagerStart) {
		report = start(scenario);
		extentReportManagerStart = true;
		}
	}

	@After
	public void after() {
		if (extentReportManagerStart) {
			extentReportManagerStart = false;
			stop(report);
		}
		}
		
	}

