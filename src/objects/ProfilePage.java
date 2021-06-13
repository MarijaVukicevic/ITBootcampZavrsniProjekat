package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class ProfilePage {
	
	public static void changeNick(WebDriver driver) {
		driver.findElement(By.id("wrap_us_menu")).click();
		driver.findElement(By.xpath(Constants.USER_SETTINGS_XPATH)).click();
		driver.findElement(By.xpath(Constants.TXT_NICKNAME_XPATH)).sendKeys(Constants.NEW_NICKNAME);
	}
	
	public static void selectGender(WebDriver driver) {
		driver.findElement(By.id("gender")).sendKeys("Female");
		
		
	}
	
	public static void changeWage(WebDriver driver) {
		driver.findElement(By.id("wage")).clear();
		driver.findElement(By.id("wage")).sendKeys("25");
	}
	
	public static void saveUpdates(WebDriver driver) {
	driver.findElement(By.name("update")).click();
	}

}
