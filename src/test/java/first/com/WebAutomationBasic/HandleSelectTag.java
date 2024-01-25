package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleSelectTag extends DriverSetup{
	
	@Test
	public void testDropdown() throws InterruptedException {

		//Select only one option throw Select class
		browser.get("https://www.ebl.com.bd/onlineapply");
		WebElement dropdown = browser.findElement(By.id("product_type"));
		// using Select class for select the option from dropdown. Here we locate a web element of selectTag. Throw this web element we can locate all option from dropdown
		Select select = new Select(dropdown); //In Select class we send webElement
		dropdown.click();
		Thread.sleep(3000);

		select.selectByIndex(3); // 3 number option in dropdown
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		select.selectByValue("Retail-Liability|EBL Current Account"); // Here we locate element throw their attribute value
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		select.selectByVisibleText("EBL Current Account");// Here we locate element throw their visible text
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		
		
		
		//Select multiple option at a time throw Select class
		browser.get("https://trytestingthis.netlify.app");
		WebElement dropdown2 = browser.findElement(By.id("owc"));
		Select select2 = new Select(dropdown2);
		select2.selectByIndex(1);
		Thread.sleep(3000);
		select2.selectByValue("option 2");
		Thread.sleep(3000);
		select2.selectByVisibleText("Option 3");
		Thread.sleep(3000);
		select2.deselectByValue("option 2");
		Thread.sleep(3000);
		select2.deselectAll();
		Thread.sleep(3000);
		
		
		
		//Select multiple option at a time throw Action class
		Actions actions = new Actions(browser);
		actions.keyDown(Keys.CONTROL).click(browser.findElement(By.cssSelector("select[id='owc'] option[value='option 1']"))).click(browser.findElement(By.cssSelector("select[id='owc'] option[value='option 3']"))).build().perform();
		Thread.sleep(3000);

	}

}
