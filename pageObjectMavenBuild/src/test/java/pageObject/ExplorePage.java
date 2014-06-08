package pageObject;

import org.openqa.selenium.WebDriver;

public class ExplorePage extends AbstractPage {

	public ExplorePage (WebDriver driver) {
		super(driver);
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
}
