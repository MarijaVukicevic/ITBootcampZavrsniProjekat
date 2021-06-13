package objects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class Homepage {
	
	
	public static void closePopUp(WebDriver driver) {
		driver.findElement(By.xpath(Constants.CLOSE_POPUP_XPATH)).click();
	}

	public static void aboutUsScreenShot(WebDriver driver) {
		driver.findElement(By.xpath(Constants.ABOUT_US_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement aboutUs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.CLICK_ABOUT_US_XPATH)));
		aboutUs.click();

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("C:/Users/Marija/Desktop/screenshot/aboutus.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void clickLogIn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#navbarSupportedContent > div > a:nth-child(3)  ")));
		login.click();
						
	}
	
	

}
