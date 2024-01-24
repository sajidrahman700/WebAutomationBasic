package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup {
	@Test
	public void TestElement() throws InterruptedException {
		browser.get("https://www.ebl.com.bd/onlineapply");
		WebElement branch = browser.findElement(By.xpath("//select[@name='form_branch']"));
	    branch.click();
		Thread.sleep(5000);
		
		WebElement terms = browser.findElement(By.cssSelector("input[class='required']"));
	    terms.click();
		Thread.sleep(5000);
	}

}
