package first.com.WebAutomationBasic;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftNHardAssertion extends DriverSetup{
	@Test
	public void testDiffassertion() {

		SoftAssert softassert = new SoftAssert();
		System.out.println("Print A");
		// Assert.assertEquals(1,2);
		softassert.assertEquals(1, 2);
		System.out.println("Print B");
		System.out.println("Print C");
		softassert.assertEquals(true, false);
		System.out.println("Print D");
		softassert.assertAll();

	}

}
