package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScrollWebPage extends DriverSetup {
	
	@Test
	public void testscroll() throws InterruptedException {

		browser.get("https://www.ebl.com.bd/onlineapply");
		JavascriptExecutor js = (JavascriptExecutor) browser; // casting our Driver into javascriptExecutor

		js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); //scroll to footer
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);"); //scroll to top
		Thread.sleep(3000);

		WebElement submit = browser.findElement(By.xpath("//button[@id='AW-343307378']"));
		js.executeScript("arguments[0].scrollIntoView();", submit); // scroll to this element
		Thread.sleep(3000);

	}
	

}
