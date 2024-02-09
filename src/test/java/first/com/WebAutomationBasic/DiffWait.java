package first.com.WebAutomationBasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DiffWait extends DriverSetup {
	
	@Test
	public void testDifferentwait() throws InterruptedException {
		
		//Dynamic wait; it works when an exception occurs in Driver and return No such element exception if can't find element in wait time
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		//Dynamic wait; it works to satisfy any condition and return timeout exception 
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
		
		browser.get("https://qavbox.github.io/demo/alerts/");
		WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='delayalert']")));
		alertButton.click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); // alertIsPresent method helps to switch to the alert and return that alert. no need to switch browser
		//Alert alert = browser.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000); //Static wait; Its a wait of Java for stop the execution
		
	}
	

}
