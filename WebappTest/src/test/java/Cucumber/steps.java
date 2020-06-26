package Cucumber;

import org.jsoup.Connection;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;
import java.util.ArrayList;

import static Cucumber.Hooks.report;
import static com.relevantcodes.extentreports.LogStatus.PASS;
import static com.relevantcodes.extentreports.LogStatus.FAIL;

public class steps extends BaseUtil {
	private WebDriver driver;
	private BaseUtil baseUtil;
	ArrayList<String> tabs = new ArrayList();

	public steps(BaseUtil baseUtil) {
		this.baseUtil = baseUtil;
	}

	@Given("^Login screen of whatsapp web application is displayed$")
	public void login_screen_of_whatsapp_web_application_is_displayed() throws InterruptedException {
		baseUtil.driver.get("https://web.whatsapp.com/");
		if (baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'WhatsApp Web')]")).isDisplayed()) {
			report.log(PASS, "Verify whatsapp web app page", " Whatsapp web page displayed");
		} else {
			report.log(FAIL, "Verify whatsapp web app page", " Whatsapp web page is not displayed");
		}

		Thread.sleep(4000);
	}

	@When("^User opens whatsapp web application in a new tab$")
	public void user_opens_whatsapp_web_application_in_a_new_tab() throws InterruptedException, AWTException {
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		((JavascriptExecutor) baseUtil.driver).executeScript("window.open()");
		tabs = new ArrayList<String>(baseUtil.driver.getWindowHandles());
		baseUtil.driver.switchTo().window(tabs.get(1)); // switches to new tab
		baseUtil.driver.get("https://web.whatsapp.com/");

		// driver.get("https://web.whatsapp.com/");

	}

	@And("^Switches back to previous tab$")
	public void switches_back_to_previous_tab() throws InterruptedException {
		baseUtil.driver.switchTo().window(tabs.get(0)); // switch back to main screen
	}

	@Then("^A popup with the message 'Whatsapp is open in another window. Click \"([^\"]*)\" to use WhatsApp in this window' should be displayed with 'CLOSE' & 'USE HERE' options$")
	public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_should_be_displayed_with_close_use_here_options(
			String strArg1) throws Throwable {
		if (baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]"))
				.isDisplayed()) {
			report.log(PASS, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page displayed");
		} else {
			report.log(FAIL, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page is not displayed");
		}
		//baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		// driver.close();
	}
	
	
	
	@Given("^A popup with the message Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE & USE HERE is displayed$")
    public void a_popup_with_the_message_whatsapp_is_open_in_another_window_click_use_here_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed() throws Throwable {
		if (baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]"))
				.isDisplayed()) {
			report.log(PASS, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page displayed");
		} else {
			report.log(FAIL, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page is not displayed");
		}
		//baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		System.out.println("Inside second step");
		//baseUtil.driver.get("https://web.whatsapp.com/");
    }
	

	@When("^User clicks on USE HERE option$")
	public void user_clicks_on_use_here_option() throws Throwable {
		baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		Thread.sleep(4000);
		report.log(PASS, "Verify The pop up closed suceessfully", "Pop up closed successfully");

	}

	@Then("^Login page of whatsapp should get loaded$")
	public void login_page_of_whatsapp_should_get_loaded() throws Throwable {
		if (baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'WhatsApp Web')]")).isDisplayed()) {
			report.log(PASS, "Verify whatsapp web app page", " Whatsapp web page displayed");
		} else {
			report.log(FAIL, "Verify whatsapp web app page", " Whatsapp web page is not displayed");
		}
}
	
	
	@And("^In the previous tab popup with message  Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE & USE HERE should be displayed$")
    public void in_the_previous_tab_popup_with_message_whatsapp_is_open_in_another_window_click_use_here_to_use_whatsapp_in_this_window_and_options_close_use_here_should_be_displayed() throws Throwable {
		baseUtil.driver.switchTo().window(tabs.get(1));
		if (baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]"))
				.isDisplayed()) {
			report.log(PASS, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page displayed");
		} else {
			report.log(FAIL, "Verify whatsapp web app page is displayed in another window",
					" Whatsapp web page is not displayed");
		}
		//baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Use Here')]")).click();
		System.out.println("Inside second step");
		//baseUtil.driver.get("https://web.whatsapp.com/");
        
    }


    @When("^User clicks on CLOSE option$")
    public void user_clicks_on_close_option() throws Throwable {
    	baseUtil.driver.findElement(By.xpath("//*[contains(text(), 'Close')]")).click();
		Thread.sleep(4000);
		report.log(PASS, "Verify The pop up closed suceessfully", "Pop up closed successfully");
    }
}




