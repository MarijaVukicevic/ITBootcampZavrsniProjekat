package objects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Constants;

public class HumanityHeader {
		
	public static void dashboard(WebDriver driver) {
		driver.findElement(By.xpath(Constants.DASH_XPATH)).click();		
	}
		
	public static void shiftPlan(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SHIFT_PLAN_XPATH)).click();
	}
	
	public static void timeClock(WebDriver driver) {
		driver.findElement(By.xpath(Constants.TIME_CLOCK_XPATH)).click();
	}
	
	public static void leave(WebDriver driver) {
		driver.findElement(By.xpath(Constants.LEAVE_XPATH)).click();
	}
	
	public static void training(WebDriver driver) {
		driver.findElement(By.xpath(Constants.TRAINING_XPATH)).click();
	}
	
	public static void staff(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void availability(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.AVAILABILITY_XPATH)).click();
	}
	
	
	public static void payroll(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.PAYROLL_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void reports(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.REPORTS_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

		
	}
	
}
