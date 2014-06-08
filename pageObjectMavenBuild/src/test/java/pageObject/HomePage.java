package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
	
	@FindBy(css = "a[class='button signin']")
	WebElement loginButton;
	
	@FindBy(css = ".blog>a")
	WebElement blogButton;
	
	@FindBy(css = ".explore>a")
	WebElement exploreButton;
	
	@FindBy(css = ".features>a")
	WebElement featuresButton;
	
	public HomePage (WebDriver driver) {
		super(driver);
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public LoginPage clickLoginButton() {
		loginButton.click();
		return new LoginPage(driver);
	}
	
	public BlogPage clickBlogButton() {
		blogButton.click();
		return new BlogPage(driver);
	}
	
	public ExplorePage clickExploreButton() {
		exploreButton.click();
		return new ExplorePage(driver);
	}
	
	public FeaturesPage clickFesturesButton() {
		featuresButton.click();
		return new FeaturesPage(driver);
	}

}
