package first.com.WebAutomationBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup {
	@Test
	public void TestElement() {
		browser.get("https://www.ebl.com.bd/");
		List <WebElement> header1 = browser.findElements(By.tagName("h4"));
	    for(WebElement element:header1) {
	    	System.out.println(element.getText());
		
	}
}
}	
	
	
