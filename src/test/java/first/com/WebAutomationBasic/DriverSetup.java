package first.com.WebAutomationBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
public WebDriver browser;
	
	@BeforeSuite
	public void openAbrowser() {
		browser = new EdgeDriver();
		browser.manage().window().maximize();
	}
	
	@AfterSuite
	public void quitBrowser() {
		browser.quit();
	}

}
