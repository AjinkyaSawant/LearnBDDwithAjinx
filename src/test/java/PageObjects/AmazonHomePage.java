package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends AmazonAbstractComponent {
	
	public WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/*   //This web component is commented out as I am inheriting this from the AmazonAbstractComponent class
	
	By signInBy = By.cssSelector("#nav-link-accountList-nav-line-1");
	
	public WebElement getSignInButton() {
		return driver.findElement(signInBy);
	}
	*/
}
