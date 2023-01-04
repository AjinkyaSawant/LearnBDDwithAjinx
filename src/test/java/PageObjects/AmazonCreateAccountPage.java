package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCreateAccountPage {
	public WebDriver driver;

	public AmazonCreateAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//By createAccountHeadingBy = By.cssSelector(".a-spacing-small.moa_desktop_signup");
	
	public WebElement getCreateAccountHeading() {
		return driver.findElement(By.cssSelector(".a-spacing-small.moa_desktop_signup"));
	}
	
	public String getNameValidationString() {
		return driver.findElement(By.cssSelector("div[id='auth-customerName-missing-alert'] div[class='a-alert-content']")).getText();
	}
	
	public String getNumberValidationString() {
		return driver.findElement(By.cssSelector("div[id='auth-phoneNumber-missing-alert'] div[class='a-alert-content']")).getText();
	}
	
	public String getPasswordValidationString() {
		return driver.findElement(By.cssSelector("div[id='auth-password-missing-alert'] div[class='a-alert-content']")).getText();
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(By.cssSelector("#continue"));
	}
	
}
