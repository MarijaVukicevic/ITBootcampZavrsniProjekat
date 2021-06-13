package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Constants;

public class StaffPage {	

	public static void addEmployeesBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement addEmp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ADD_EMPL_BTN_XPATH)));
		addEmp.click();
	}

	public static void inputFirstName(WebDriver driver, String firstName) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement fName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.TXT_FIRSTNAME_XPATH)));
		fName.sendKeys(firstName);
	}

	public static void inputLastName(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl1")).sendKeys(lastName);
	}

	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.id("_ase1")).sendKeys(email);
	}

	public static void saveEmployeesBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SAVE_EMPL_BTN_XPATH)).click();
	}

	public static void selectAddedEmployee(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.ADDED_EMPLOYEE_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void changeName(WebDriver driver, String firstName) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.ADDED_EMPLOYEE_EDIT_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.ADDED_EMPLOYEE_NAME_XPATH)).clear();
		driver.findElement(By.xpath(Constants.ADDED_EMPLOYEE_NAME_XPATH)).sendKeys(firstName);
		driver.findElement(By.xpath(Constants.SAVE_CHANGES_XPATH)).click();
	}

	
	
   public static void addFiveEmployees(WebDriver driver) {
		
		File f = new File("EmployeesList.xls");
		try {
			InputStream is = new FileInputStream(f);
			HSSFWorkbook wb = new HSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row;
			for (int i = 0; i < 5; i++) {
				row = sheet.getRow(i);
				String fname = row.getCell(0).toString();
				String lname = row.getCell(1).toString();
				String email = row.getCell(2).toString();
				WebDriverWait wait = new WebDriverWait(driver, 5);
				WebElement addEmp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ADD_EMPL_BTN_XPATH)));
				addEmp.click();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				driver.findElement(By.xpath(Constants.TXT_FIRSTNAME_XPATH)).sendKeys(fname);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(Constants.TXT_LASTNAME_XPATH)).sendKeys(lname);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(Constants.TXT_EMAIL_XPATH)).sendKeys(email);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(Constants.SAVE_EMPL_BTN_XPATH)).click();

				wb.close();
				driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
			}
		} 
		catch (IOException e) {
  		  e.printStackTrace();
		}
	}
	
	public static void checkAddedEmployee1(WebDriver driver) {
		//driver.findElement(By.xpath(Humanity.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Sima Simic")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkAddedEmployee2(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Tea Teic")).click();
	}
	
	public static void checkAddedEmployee3(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Una Unic")).click();
	}
	
	public static void checkAddedEmployee4(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Veljko Veljkovic")).click();
	}
	
	public static void checkAddedEmployee5(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Zoran Zoric")).click();
	}
}
