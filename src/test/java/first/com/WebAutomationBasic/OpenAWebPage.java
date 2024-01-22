package first.com.WebAutomationBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup {
	@Test
	public void openAPage() {
		//WebDriver browser = new ChromeDriver();
		browser.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
		Assert.assertEquals(browser.getTitle(), "Maven Repository: org.testng » testng » 7.8.0");
		//browser.close();
		

	}
	@Test
	public void openGoogle() {
		browser.get("https://Google.com/");
		Assert.assertEquals(browser.getTitle(), "Google");
	}

}
