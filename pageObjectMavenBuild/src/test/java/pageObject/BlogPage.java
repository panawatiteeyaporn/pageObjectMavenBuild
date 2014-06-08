package pageObject;

import org.openqa.selenium.WebDriver;

public class BlogPage extends AbstractPage {

	public BlogPage (WebDriver driver) {
		super(driver);
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
}
