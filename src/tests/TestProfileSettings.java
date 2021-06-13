package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Homepage;
import objects.LogInPage;
import objects.ProfilePage;
import resources.Constants;

public class TestProfileSettings {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void logIn() {
		driver.get(Constants.HOMEPAGE_URL);
		Homepage.closePopUp(driver);
		driver.manage().window().maximize();
		Homepage.clickLogIn(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LogInPage.login(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test
	public void testEditProfile() {
		ProfilePage.changeNick(driver);
		ProfilePage.selectGender(driver);
		ProfilePage.changeWage(driver);
		ProfilePage.saveUpdates(driver);
	}
}
