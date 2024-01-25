package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup {
	@Test
	public void testInteractionOfWebElement() throws InterruptedException {
		browser.get("https://www.ebl.com.bd/onlineapply");
		
		WebElement firstNameInputBox = browser.findElement(By.xpath("//input[@placeholder='Full Name ']"));
		firstNameInputBox.sendKeys("Sajid Rahman"); // write in a text field
		
		browser.findElement(By.xpath("//select[@name='form_branch']")).click();// locate element with direct click without using any variable
		Thread.sleep(3000);
		
		firstNameInputBox.clear(); // clear the text field
		Thread.sleep(3000);
		
		// get the value of a attribute of which we want from the locator we select
		String value= browser.findElement(By.xpath("//select[@name='form_branch']")).getAttribute("aria-label");
		System.out.println(value);
		
		// get the cssProperty of a element like color,font-size,line-length,background etc
		String cssvalue= browser.findElement(By.xpath("//select[@name='form_branch']")).getCssValue("color");
		System.out.println(cssvalue);
		
		// Find the visible text of a element using getText method
		String elementtext= browser.findElement(By.xpath("//select[@name='form_branch']")).getText();
		System.out.println(elementtext);
		
		// find that element is displayed or not. If displayed then return true.
		Boolean displayed= browser.findElement(By.xpath("//select[@name='form_branch']")).isDisplayed();
		System.out.println(displayed);
		
		// find that element is enable or not. If enable then return true.Otherwise return false
		displayed= browser.findElement(By.xpath("//select[@name='form_branch']")).isEnabled();
		System.out.println(displayed);
		
		//find out element is selected or not before click and after click.If selected then return true.Otherwise return false
		//Here we need to scroll to that element
		displayed= browser.findElement(By.xpath("//input[@name='form_authorise']")).isSelected();
		System.out.println("Before click: " +displayed);
		browser.findElement(By.xpath("//input[@name='form_authorise']")).click();
		displayed= browser.findElement(By.xpath("//input[@name='form_authorise']")).isSelected();
		System.out.println("After click: " +displayed);
		
		
		
	}

}
