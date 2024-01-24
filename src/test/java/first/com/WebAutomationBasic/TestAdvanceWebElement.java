package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup {
	@Test
	public void TestElement() throws InterruptedException {
	
		browser.get("https://www.ebl.com.bd/retail/EBL-Cards");
		
		//Locate direct child throw their parent.Here we want to locate h2.
		System.out.println(browser.findElement(By.xpath("//section/div/div/div/h2")).getText());  //parent/child
		System.out.println(browser.findElement(By.cssSelector("section>div>div>div>h2")).getText());  //parent>child
		
		//Locate element using Multiple Attribute
		System.out.println(browser.findElement(By.xpath("//a[@class='cta-call' and @href='tel:+8809612316230']")).getText()); // //tagname[@attribute='value' and @attribute='value']
		System.out.println(browser.findElement(By.cssSelector("a[class='cta-call'][href='tel:+8809612316230']")).getText());  // tagname[attribute='value'][@attribute='value']
		

}
}	
