package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	//for test scenario setup and tearDown
	
	@Before
    public void beforeScenario(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }	
	
	@After
    public void afterScenario(){
       driver.quit();
    }

}
