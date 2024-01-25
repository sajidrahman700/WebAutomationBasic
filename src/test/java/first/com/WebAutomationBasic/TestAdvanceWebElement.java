package first.com.WebAutomationBasic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAdvanceWebElement extends DriverSetup {
	@Test
	public void TestElement() throws InterruptedException {
	
		browser.get("https://www.ebl.com.bd/retail/EBL-Cards");
		
		//Locate direct child throw their parent.Here we want to locate h2 tag.
		System.out.println(browser.findElement(By.xpath("//section/div/div/div/h2")).getText());  //parent/child
		System.out.println(browser.findElement(By.cssSelector("section>div>div>div>h2")).getText());  //parent>child
		
		//tagname with// is a xPath
		System.out.println(browser.findElement(By.xpath("//h2")).getText());
		// only tagname is a cssSelector
		System.out.println(browser.findElement(By.cssSelector("h2")).getText());
		
		//Locate element using Multiple Attribute
		System.out.println(browser.findElement(By.xpath("//a[@class='cta-call' and @href='tel:+8809612316230']")).getText()); // //tagname[@attribute='value' and @attribute='value']
		System.out.println(browser.findElement(By.cssSelector("a[class='cta-call'][href='tel:+8809612316230']")).getText());  // tagname[attribute='value'][@attribute='value']
		
		//Locate element for dynamic attribute with substring. we can use half value of attribute. but here we have to use value from the first. we can remove the last part of the value.
		System.out.println(browser.findElement(By.xpath("//a[starts-with(@href, \"https://dgzip.ebl\")]")).getText()); //  //tagname[start-with(@attribute,\"substring\")]
		System.out.println(browser.findElement(By.cssSelector("a[href^= \"https://dgzip.ebl\"]")).getText()); //  tagname[attribute^ = \"substring\"]
		
		//Locate element for dynamic attribute with substring. we can use half value of attribute. Here we can use value from everywhere(first,middle,last). we can't remove the value from the middle.
		System.out.println(browser.findElement(By.xpath("//a[contains(@href, \"ps://dgzip.ebl\")]")).getText()); //  //tagname[contains(@attribute,\"substring\")]
		System.out.println(browser.findElement(By.cssSelector("a[href*= \"ps://dgzip.ebl\"]")).getText()); //  tagname[attribute* = \"substring\"]
		
		
		
		browser.get("https://www.ebl.com.bd/treasury/government-securities-investment-window");
		
		//Locate element in a table throw their parent using xPath
		System.out.println(browser.findElement(By.xpath("//tr/th[1]")).getText());
		System.out.println(browser.findElement(By.xpath("//tr/th[2]")).getText());
		System.out.println(browser.findElement(By.xpath("//tr/th[4]")).getText());
		System.out.println(browser.findElement(By.xpath("//tr/th[last()]")).getText());
		
		//Locate element in a table throw their parent using cssSelector
		System.out.println(browser.findElement(By.cssSelector("tr>th:first-child")).getText());
		System.out.println(browser.findElement(By.cssSelector("tr>th:nth-child(2)")).getText());
		System.out.println(browser.findElement(By.cssSelector("tr>th:nth-child(4)")).getText());
		System.out.println(browser.findElement(By.cssSelector("tr>th:last-child")).getText());
		
		//Locate a element using visible text with Text method.When we didn't know any attribute.Text method is only for xPath.Not available in cssSelector.
		System.out.println(browser.findElement(By.xpath("//td[text()='Rafi Uddin Ahmed']")).getText()); // Using Text method "//tagname[text()='visible text']"
		System.out.println(browser.findElement(By.xpath("//td[contains(text(),'fi Uddin')]")).getText()); // Using multiple method like Contains method and Text method. "//tagname[contains(text(),'substring of visible text')]"
		
		//Locate a element after that find their siblings in a table
		System.out.println(browser.findElement(By.xpath("//td[contains(text(),'01978-350350')]/preceding-sibling::td")).getText()); //shows previous all siblings
		System.out.println(browser.findElement(By.xpath("//td[contains(text(),'01978-350350')]/following-sibling::td")).getText()); //shows next all siblings
		System.out.println(browser.findElement(By.xpath("//td[contains(text(),'01978-350350')] /preceding-sibling::td[2]")).getText()); // shows a individual previous sibling what we select with indexing
		System.out.println(browser.findElement(By.xpath("//td[contains(text(),'01978-350350')] /following-sibling::td[last()]")).getText()); // shows a individual next sibling what we select with indexing
		
		//tagname[normalize-space()= 'Text'] its works like Contains method
		

}
}	
