package org.testing.TestScripts;

import java.io.IOException;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.TestSteps.GmailActivities;
import org.testing.utilities.ExcelDataRead;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class TC1 extends BaseClass {

	GmailActivities activities = new GmailActivities();
    @Test
	public void tc1Method() throws InterruptedException, IOException, BiffException {
		Login login = new Login(properties, driver);
		Logout logout = new Logout(properties, driver);
        Home home = new Home(properties, driver);
		login.signIn(ExcelDataRead.readACell(3, 2),ExcelDataRead.readACell(3, 3));
		home.trendingClick(driver, properties);
		logout.signOut(driver);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TC1 Executed Successfully");
	}

}
