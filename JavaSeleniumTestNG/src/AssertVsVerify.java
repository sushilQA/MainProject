import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	@Test
	public void assertionTest() {

		// Assertion Passing
		Assert.assertTrue(1 + 2 == 3);
		System.out.println("Passing 1");
		System.out.println("Assertion Passed and execution of code countinue");

		// Assertion failing
		Assert.fail("Failing second assertion");
		System.out.println("Failing 2");
		System.out.println("Assertion Failed and execution of code Exit");

	}

	@Test(enabled = false)
	public void verifyORsoftAssertionTest() {

		// Creating softAssert object
		SoftAssert softAssert = new SoftAssert();

		// Assertion failing
		softAssert.fail("softAssert Failing first assertion");
		System.out.println("softAssert Failing 1");
		System.out.println("softAssert Assertion Failed and execution of code countinue");

		// Assertion failing
		softAssert.fail("softAssert Failing second assertion");
		System.out.println("softAssert Failing 2");
		System.out.println("softAssert Assertion Failed and execution of code countinue");
		// Collates the assertion results and marks test as pass or fail
		softAssert.assertAll();
	}

	@Test(enabled = false)
	public void softAssertionTest1() {
		SoftAssert softAssert = new SoftAssert();

		// Assertion failing
		softAssert.fail();
		System.out.println("Failing");
		// Assertion passing
		softAssert.assertEquals(1, 1);
		System.out.println("Passing");
		// Collates test results and marks them pass or fail
		//softAssert.assertAll();
	}

	@Test(enabled = false)
	public void hardAssertion() {
		try {
			SoftAssert softAssert = new SoftAssert();

			softAssert.assertTrue(2 > 1);
			System.out.println("Assertion passed in Test 1");
			
			softAssert.assertFalse(1 < 2);
			System.out.println("Assertion passed in Test 2");
			
			softAssert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Passed in Test 3");
			//softAssert.assertAll();
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}

	}

}
