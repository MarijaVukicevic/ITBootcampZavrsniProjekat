package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.Constants;

public class SettingsPage {
		
	public static void openSettings(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SETTINGS_XPATH)).click();
	}
	
	public static void changeLanguage(WebDriver driver, String lang) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.LANG_SETTINGS_XPATH)).sendKeys(lang);
		
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void disableEmailNotif(WebDriver driver) {
		if(driver.findElement(Constants.SETTINGS_NOTIF_EMAIL).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIF_EMAIL).click();
		}
	}
		
	public static void disableSMSNotif(WebDriver driver) {
			if(driver.findElement(Constants.SETTINGS_NOTIF_SMS).isSelected()) {
				driver.findElement(Constants.SETTINGS_NOTIF_SMS).click();
			}
	}
	
	public static void disablePushNotif(WebDriver driver) {
		if(driver.findElement(Constants.SETTINGS_NOTIF_PUSH).isSelected()) {
			driver.findElement(Constants.SETTINGS_NOTIF_PUSH).click();
		}
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS_XPATH)).click();
	}

}
