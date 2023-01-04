package StepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import PageObjects.*;
import io.cucumber.java.en.*;


public class Steps {
	
	
	WebDriver driver = Hooks.driver;
	AmazonCreateAccountPage amazonCreateAccountPage;
	
	
	@Given("User navigates to create account page")
	public void user_navigates_to_create_account_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.amazon.in/");
	    AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		amazonHomePage.getSignInButton().click();
		
		AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driver);
		amazonCreateAccountPage = amazonSignInPage.getCreateAmazonAccount();
	}

	@When("User clicks on the continue button on create account page")
	public void user_clicks_on_the_continue_button_on_create_account_page() {
	    // Write code here that turns the phrase above into concrete actions
		amazonCreateAccountPage.getContinueButton().click();
	}

	@Then("Create Account heading is displayed on create account page")
	public void create_account_heading_is_displayed_on_create_account_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(amazonCreateAccountPage.getCreateAccountHeading().getText(), "Create Account");
	}

	@Then("Name error message is displayed")
	public void name_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(amazonCreateAccountPage.getNameValidationString().trim(), "Enter your name");
	}

	@Then("Mobile number error message is displayed")
	public void mobile_number_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(amazonCreateAccountPage.getNumberValidationString().trim(), "Enter your mobile number");
	}

	@Then("Password error message is displayed")
	public void password_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(amazonCreateAccountPage.getPasswordValidationString().trim(), "Enter your password");
	}
	
	/*
	 //Trial code of OpenSamplePage.feature testcase , uncomment if you want to run that feature, also remove @ignore from that feature file
	@Given("User launch the browser")
	public void user_launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	@When("User opens the URL {string}")
	public void user_opens_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}
	
	@Then("Page title should contain {string}")
	public void page_title_should_contain(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getTitle().contains(string));
		driver.quit();
	}
	*/
	
	
}
