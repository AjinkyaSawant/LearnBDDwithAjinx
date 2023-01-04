package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSignInPage {
	
	public WebDriver driver;

	public AmazonSignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By createAmazonBy = By.cssSelector("#createAccountSubmit");
	
	public AmazonCreateAccountPage getCreateAmazonAccount() {
		 driver.findElement(createAmazonBy).click();
		 return new AmazonCreateAccountPage(driver);
	}
	
}
