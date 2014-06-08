package pageObject;

import org.openqa.selenium.WebDriver;

public class FeaturesPage extends AbstractPage {

	public FeaturesPage (WebDriver driver) {
		super(driver);
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
}
