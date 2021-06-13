package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Homepage;
import objects.LogInPage;
import objects.StaffPage;
import resources.Constants;
import objects.HumanityHeader;

public class TestAddStaffChangeName {
	
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
	
	@Test(priority = 1)
	public void testAddEmployee() {
		StaffPage.addEmployeesBtn(driver);
		StaffPage.inputFirstName(driver, "Randomir");
		StaffPage.inputLastName(driver, "Randomic");
		StaffPage.inputEmail(driver, "random01@mail.com");
		StaffPage.saveEmployeesBtn(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to(Constants.STAFF_URL);
		Assert.assertTrue(driver.getPageSource().contains("random01@mail.com"));
					
	}
	
	@Test(priority = 2)
	public void testChangeName() {
		StaffPage.selectAddedEmployee(driver);
		StaffPage.changeName(driver, "Rando M.");
		driver.navigate().to(Constants.STAFF_URL);
				
		Assert.assertTrue(driver.getPageSource().contains("Rando M. Randomic"));
			
	}
}
