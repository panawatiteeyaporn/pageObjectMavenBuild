package com.bdd.pageObjectMavenBuild;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.BlogPage;
import pageObject.ExplorePage;
import pageObject.FeaturesPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateToLoginPageSteps {

	WebDriver driver;
	
	HomePage onHomePage;
	LoginPage onLoginPage;
	BlogPage onBlogPage;
	ExplorePage onExplorePage;
	FeaturesPage onFeaturesPage;
	
	
	String Home_URL = "https://github.com/";
	String Login_URL = "https://github.com/login";
	String Blog_URL = "https://github.com/blog";
	String Explore_URL = "https://github.com/explore";
	String Features_URL = "https://github.com/features";

	@Before
	public void testSetUp() {
		driver = new FirefoxDriver();
		onHomePage = new HomePage(driver);
		onHomePage.openThePage();
	}

	@After
	public void testShutDown() {
		driver.quit();
	}

	@Given("^I am at the HomePage$")
	public void i_am_at_the_HomePage() {
		onHomePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(Home_URL, onHomePage.getUrl());
	}

	@When("^I click on the Login button$")
	public void i_click_on_the_Login_button() {
		onLoginPage = onHomePage.clickLoginButton();
	}

	@Then("^I will be at the Login page$")
	public void i_will_be_at_the_Login_page() {
		Assert.assertEquals(Login_URL, onLoginPage.getUrl());
	}

	@When("^I click on the Blog button$")
	public void i_click_on_the_Blog_button() {
		onBlogPage = onHomePage.clickBlogButton();
	}

	@Then("^I will be at the Blog page$")
	public void i_will_be_at_the_Blog_page() {
		Assert.assertEquals(Blog_URL, onBlogPage.getUrl());
	}

	@When("^I click on the Explore button$")
	public void i_click_on_the_Explore_button() {
		onExplorePage = onHomePage.clickExploreButton();
	}

	@Then("^I will be at the Explore page$")
	public void i_will_be_at_the_Explore_page() {
		Assert.assertEquals(Explore_URL, onExplorePage.getUrl());
	}

	@When("^I click on the Infor button$")
	public void i_click_on_the_Infor_button() {
		onFeaturesPage = onHomePage.clickFesturesButton();
	}

	@Then("^I will be at the Infor page$")
	public void i_will_be_at_the_Infor_page() {
		Assert.assertEquals(Features_URL, onFeaturesPage.getUrl());
	}

}
