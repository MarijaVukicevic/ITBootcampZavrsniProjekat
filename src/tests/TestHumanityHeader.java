package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Homepage;
import objects.HumanityHeader;
import objects.LogInPage;
import resources.Constants;

public class TestHumanityHeader {

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
		LogInPage.inputUsername(driver);
		LogInPage.inputPassword(driver);
		LogInPage.loginBtn(driver);
	}

	@Test(priority = 1)
	public void testDashboard() {
		HumanityHeader.dashboard(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.DASH_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 2)
	public void testShiftPlan() {
		HumanityHeader.shiftPlan(driver);
		Assert.assertTrue(driver.getPageSource().contains("Schedule Overview"));
	}

	@Test(priority = 3)
	public void testTimeClock() {
		HumanityHeader.timeClock(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.TIME_CLOCK_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 4)
	public void testLeave() {
		HumanityHeader.leave(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.LEAVE_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 5)
	public void testTraining() {
		HumanityHeader.training(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.TRAINING_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 6)
	public void testStaff() {
		HumanityHeader.staff(driver);
		
		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.STAFF_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 7)
	public void testPayroll() {
		HumanityHeader.payroll(driver);
		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.PAYROLL_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();

	}

	@Test(priority = 8)
	public void testReports() {
		HumanityHeader.reports(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.REPORTS_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

	@Test(priority = 9)
	public void testAvailability() {
		HumanityHeader.availability(driver);

		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.AVAILABILITY_URL;

		sa.assertEquals(currentUrl, expectedUrl);

		sa.assertAll();
	}

}
