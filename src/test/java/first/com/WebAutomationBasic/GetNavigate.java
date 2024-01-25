package first.com.WebAutomationBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class GetNavigate extends DriverSetup{
	
	@Test
	public void testgetNav() throws InterruptedException {
		
		browser.get("https://www.ebl.com.bd/onlineapply");
        System.out.println(browser.getTitle());
        Thread.sleep(2000);
        
        //run a site using navigate
        browser.navigate().to ("https://www.ebl.com.bd/treasury/government-securities-investment-window");
        System.out.println(browser.getTitle());
        Thread.sleep(2000);
        
        //back to the previous site
        browser.navigate().back();
        System.out.println(browser.getTitle());
        Thread.sleep(2000);
        
        //again go to the forward site
        browser.navigate().forward();
        System.out.println(browser.getTitle());
        Thread.sleep(2000);
        
        //refresh the page
        browser.navigate().refresh();
        Thread.sleep(2000);
	}
	
	
	@Test
	 public void testBrowserWindow() throws InterruptedException {
	        
		    browser.get("https://www.ebl.com.bd/retail/retail-loan");
	        System.out.println(browser.getTitle());
	        Thread.sleep(1000);
	       
	        //open site in new tab
	        browser.switchTo().newWindow(WindowType.TAB);
	        browser.navigate().to ("https://www.ebl.com.bd/retail/EBL-Cards");
	        System.out.println(browser.getTitle());
	        Thread.sleep(1000);
	        // open site in new window
	        browser.switchTo().newWindow(WindowType.WINDOW);
	        browser.navigate().to("https://www.ebl.com.bd/retail-ecommerce/ebl-skypay");
	        System.out.println(browser.getTitle());
	        Thread.sleep(1000);
	        
	        browser.manage().window().minimize();
	        Thread.sleep(3000);
	        browser.manage().window().maximize();
	        Thread.sleep(3000);
	        browser.manage().window().fullscreen();
	        Thread.sleep(3000);
	        
	        System.out.println(browser.getCurrentUrl());
	        
	        browser.close();
	        browser.quit();
	    }
	
	
	@Test
    public void testBrowserWindowHandle() throws InterruptedException {
		
		browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        
		System.out.println(browser.getTitle());
        System.out.println(browser.getWindowHandle());
        Thread.sleep(1000);
        
        browser.findElement(By.id("openwindow")).click();
        Thread.sleep(1000);
        System.out.println(browser.getTitle()); //Driver still in first site
        
        browser.findElement(By.id("opentab")).click();
        Thread.sleep(1000);
        System.out.println(browser.getTitle()); //Driver still in first site

        List<String> browserWindowHandles = new ArrayList<>(browser.getWindowHandles()); //type casting in set to list and get all tab's hash number
        System.out.println(browserWindowHandles.get(0));
        System.out.println(browserWindowHandles.get(1));
        System.out.println(browserWindowHandles.get(2));
        
        browser.switchTo().window(browserWindowHandles.get(1)); //Driving is moving to second browser
        System.out.println(browser.getTitle()); //Driver is in second site
        
        browser.switchTo().window(browserWindowHandles.get(0)); //Driving is moving to first browser
        System.out.println(browser.getTitle()); //Driver is in first site
        
        browser.switchTo().window(browserWindowHandles.get(2)); //Driving is moving to third browser
        System.out.println(browser.getTitle()); //Driver is in third site
	}

}
