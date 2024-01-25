package first.com.WebAutomationBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup {
	@Test
	public void TestElement() throws InterruptedException {
		browser.get("https://www.ebl.com.bd/");
		
		//Locate Multiple element using TagName
		List <WebElement> header1 = browser.findElements(By.tagName("h4"));
	    for(WebElement element:header1) {
	    	System.out.println(element.getText());
	         }
	    
	    //Locate single element using TagName
		WebElement header2 = browser.findElement(By.tagName("h3"));
	    System.out.println(header2.getText());
	    
	    //close advertisement using cssSelector
	    WebElement close = browser.findElement(By.cssSelector("button[id='close']"));
	    close.click();
		Thread.sleep(3000);
		
		
		browser.get("https://www.ebl.com.bd/onlineapply");
		
		//Locate element using Name Attribute and write something on text field
		WebElement email = browser.findElement(By.name("form_name"));
		email.sendKeys("Sajid Rahman");
		Thread.sleep(3000);
		
		//Locate element using Id Attribute and write something on text field
		WebElement search = browser.findElement(By.id("form_indentity_number"));
		search.sendKeys("123456789");
		Thread.sleep(3000);
		//Id Attribute value with # would be a cssSelector
		//WebElement search = browser.findElement(By.cssSelector("#form_indentity_number"));
		
		
		//Locate element using ClassName Attribute and write something on text field
		WebElement password = browser.findElement(By.className("email"));
		password.sendKeys("Sajid@gamil.com");
		Thread.sleep(3000);
		//className Attribute value with . would be a cssSelector
		//WebElement password = browser.findElement(By.cssSelector(".email"));
		
		
		//Locate element using partiallinktext print full text of the LinkText
		WebElement follow = browser.findElement(By.partialLinkText("Disclosures"));
		System.out.println(follow.getText());
		Thread.sleep(1000);
		
		//Locate element using xPath and click that element
		WebElement branch = browser.findElement(By.xpath("//select[@name='form_branch']"));
	    branch.click();
		Thread.sleep(3000);
		//without using tagname for xPath
		//WebElement branch = browser.findElement(By.xpath("//*[@name='form_branch']"));
		
		
		//Locate element using cssSelector and click that element
		//here we need to scrolldown to that element otherwise it will show failure
		WebElement terms = browser.findElement(By.cssSelector("input[class='required']"));
	    terms.click();
		Thread.sleep(3000);
		
		//Locate element using LinkText and click that element to go that link
		WebElement career = browser.findElement(By.linkText("Career"));
	    career.click();
		Thread.sleep(3000);
}
}	
	
	
