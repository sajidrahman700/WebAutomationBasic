package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestHoverAction extends DriverSetup{
	
	@Test
	public void testHover() throws InterruptedException {
		browser.navigate().to("https://www.ebl.com.bd/onlineapply");
		Actions actions = new Actions(browser); //In action class we send Driver
		
		// For hover on a element we use clickAndhold method
		actions.clickAndHold(browser.findElement(By.xpath("//img[@alt='Currency Exchange Rate']"))).build().perform();
		Thread.sleep(3000);
		
		actions.click(browser.findElement(By.xpath("//div[@class='forexmore']"))).build().perform();
		Thread.sleep(5000);
		
		browser.navigate().back();
		Thread.sleep(5000);
		
		
		
		
		//write some word in a text field then copy that word and paste to the another text field
		actions.sendKeys(browser.findElement(By.xpath("//input[@placeholder='Full Name ']")), "Sajid Rahman").build().perform();// write word
		Thread.sleep(2000);
		// select all word
		actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();// copy the word
        //Here we didn't use action class sendKeys. we use normal sendKeys
        browser.findElement(By.xpath("//input[@id='form_indentity_number']")).sendKeys(Keys.CONTROL, "v"); //paste the word. 
        Thread.sleep(5000);
        
	}
	

}
