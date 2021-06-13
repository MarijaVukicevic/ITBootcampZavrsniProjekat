package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class LogInPage {
			
	public static void inputUsername (WebDriver driver) {
		driver.findElement(By.xpath(Constants.TXT_USERNAME_XPATH)).sendKeys(Constants.USERNAME);
	}
	
	public static void inputPassword (WebDriver driver) {
		driver.findElement(By.xpath(Constants.TXT_PASSWORD_XPATH)).sendKeys(Constants.PASSWORD);
	}
	
	public static void loginBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.LOGIN_BTN_XPATH)).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void login(WebDriver driver) {
		driver.findElement(By.xpath(Constants.TXT_USERNAME_XPATH)).sendKeys(Constants.USERNAME);
		driver.findElement(By.xpath(Constants.TXT_PASSWORD_XPATH)).sendKeys(Constants.PASSWORD);
		driver.findElement(By.xpath(Constants.LOGIN_BTN_XPATH)).click();
	}

}
