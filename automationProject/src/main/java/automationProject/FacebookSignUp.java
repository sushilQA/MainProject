package automationProject;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public void browserDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../automationProject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		facebokSignUpFields(driver);
	}

	public void facebokSignUpFields(WebDriver driver) throws InterruptedException {

		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(30000);
		System.out.println("code is after Create New Account");
		driver.findElement(By.id("u_0_1")).sendKeys("SUSHIL");
		System.out.println("code is after first name");
		driver.findElement(By.id("u_0_3")).sendKeys("AGRAWAL");
		System.out.println("code is after last name");

	}
}
