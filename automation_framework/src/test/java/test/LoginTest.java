package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.startBrowser();
		// Calling LoginPage Class or Activate
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("tchfiosdemo@gmail.com");
		loginPage.enterPassword("abc123");
		loginPage.clickOnSubmitButton();
		// loginPage.login("","");
		// loginPage.SUBMIT_FIELD.click();
	}

}
