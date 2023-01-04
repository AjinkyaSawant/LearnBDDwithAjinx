package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonAbstractComponent {
	
	public WebDriver driver;

	public AmazonAbstractComponent(WebDriver driver) {
		this.driver = driver;
	}
	
	//Sign in button on the navigation panel which is common on all the pages 
	public WebElement getSignInButton() {
		return driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
	}
	
}
