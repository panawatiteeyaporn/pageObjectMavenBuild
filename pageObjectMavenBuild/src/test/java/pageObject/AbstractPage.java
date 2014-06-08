package pageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public HomePage openThePage() {
		driver.get("https://github.com/");
		return new HomePage(driver);
	}
}
