package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Library of elements
	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.NAME, using = "login")
	WebElement SUBMIT_FIELD;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickOnSubmitButton() {

		SUBMIT_FIELD.click();

	}

}
