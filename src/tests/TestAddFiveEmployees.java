package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import objects.StaffPage;
import resources.Constants;

public class TestAddFiveEmployees {

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
		HumanityHeader.staff(driver);
	}
	
		
	@Test
	public void addNewEmployees() {
		StaffPage.addFiveEmployees(driver);
		driver.navigate().to(Constants.STAFF_URL);
		Assert.assertTrue(driver.getPageSource().contains("simas@mail.com"));
		Assert.assertTrue(driver.getPageSource().contains("teateic@mail.com"));
		Assert.assertTrue(driver.getPageSource().contains("una777@mail.com"));
		Assert.assertTrue(driver.getPageSource().contains("veljav@mail.com"));
		Assert.assertTrue(driver.getPageSource().contains("zokizoric11@mail.com"));
	}
	

}
