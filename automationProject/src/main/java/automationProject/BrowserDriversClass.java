package automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriversClass {

	public void openChromeDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "../automationProject/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nopaperforms.com/");
		driver.manage().window().maximize();
		WebElement loginButton = driver.findElement(By.xpath("//*[@class='npfico-icons8-lock']"));
		loginButton.click();
		driver.navigate().to("https://login.nopaperforms.io/");
		WebElement loginPage = driver.findElement(By.xpath("//a[@class='pull-right']"));
		String text = loginPage.getText();
		if (text.equalsIgnoreCase("Forgot Your Password?")) {
			System.out.println("You are land on Login Page");
		} else
			System.out.println("You are land on wrong " + text + " page");
	}
}
