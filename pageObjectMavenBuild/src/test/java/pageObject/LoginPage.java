package pageObject;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}
}
