package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIFrameElement extends DriverSetup {
	
	
	@Test
	public void testIFrameItems() throws InterruptedException {
		
		browser.get("https://www.ebl.com.bd/onlineapply");
		
		//scroll to the element using javaScript
		JavascriptExecutor js = (JavascriptExecutor) browser;
		WebElement hoverButton = browser.findElement(By.xpath("//input[@name='form_authorise']"));
		js.executeScript("arguments[0].scrollIntoView();", hoverButton);
		Thread.sleep(3000);
		
		//browser.switchTo().frame(0); //using index number for switching to frame
		//browser.switchTo().frame(""); //using id attribute value for switching to frame. but not working here
		//browser.switchTo().frame("a-uffoc7buw8eb"); //using name attribute value for switching to frame. but not working here
		WebElement frame = browser.findElement(By.xpath("//iframe[contains(@title,'reCAPTCHA')]")); //using web element for switching to frame
		browser.switchTo().frame(frame);
		
		browser.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();// click a element in the frame
		Thread.sleep(5000);
		
		browser.switchTo().defaultContent(); // back to main page
		//check element in main page
		System.out.println(browser.findElement(By.xpath("//div[contains(@class,'pl-50')]//div[contains(@class,'col-sm-12')]//div[contains(@class,'form-group mb-10')]//label[1]")).getText());
		
		
		//browser.switchTo().frame(3);
		//browser.switchTo().frame(2);
		//browser.switchTo().parentFrame(); //back to previous page
		//browser.switchTo().defaultContent();
		
		//for nested frame
		//1
		//2 1
		//3 1 2[1 2] 3
	}

}
