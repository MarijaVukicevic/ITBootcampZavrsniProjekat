package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.HumanityHeader;
import objects.LogInPage;
import resources.Constants;
import objects.Homepage;

public class TestAboutUsLogin {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void openHomePage() {
		driver.get(Constants.HOMEPAGE_URL);
		driver.manage().window().maximize();
		
	}

	@Test (priority = 1)
	public void testAboutUs() {
		Homepage.closePopUp(driver);
		Homepage.aboutUsScreenShot(driver);
		
		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.ABOUT_US_URL;
		
		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}
	
	@Test (priority = 2)
	public void testLogIn() {
		Homepage.clickLogIn(driver);
		LogInPage.inputUsername(driver);
		LogInPage.inputPassword(driver);
		LogInPage.loginBtn(driver);
		
		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.DASH_URL;
		
		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}
}
