package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Homepage;
import objects.LogInPage;
import objects.SettingsPage;
import resources.Constants;

public class TestSettingsLangNotif {
	
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
		SettingsPage.openSettings(driver);
	}
	
	@Test(priority = 1)
	public void testChangeLang() {
		SettingsPage.changeLanguage(driver, "Croatian (machine)");
		SoftAssert sa = new SoftAssert();
		Select select = new Select(driver.findElement(Constants.SETTINGS_LANG));
		sa.assertEquals(select.getFirstSelectedOption().getText(), "Croatian (machine)");

		sa.assertAll();
	}
	
	@Test(priority = 2)
	public void testdisableNotif() {
		SettingsPage.disableEmailNotif(driver);
		SettingsPage.disableSMSNotif(driver);
		SettingsPage.disablePushNotif(driver);
		
		Assert.assertFalse(driver.findElement(By.id(Constants.NOTIF_EMAIL_ID)).isSelected());
		Assert.assertFalse(driver.findElement(By.id(Constants.NOTIF_SMS_ID)).isSelected());
		Assert.assertFalse(driver.findElement(By.id(Constants.NOTIF_PUSH_ID)).isSelected());
		
		
	}

}
