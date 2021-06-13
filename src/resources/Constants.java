package resources;

import org.openqa.selenium.By;

public class Constants {
	
	public static final String HOMEPAGE_URL = "https://www.humanity.com/";
	public static final String ABOUT_US_URL = "https://www.humanity.com/about";
	
	public static final String CLOSE_POPUP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String CLICK_ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a";
	
	public static final String TXT_USERNAME_XPATH = "//*[@id=\"email\"]";
	public static final String TXT_PASSWORD_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static final String USERNAME = "nekimejl@mail.com";
	public static final String PASSWORD = "passXword";
	
	public static final String DASH_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFT_PLAN_XPATH = "//*[@id=\"sn_schedule\"]/span";
	public static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span/p";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span"; 
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	public static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTS_XPATH ="//*[@id=\"sn_reports\"]/span";
	
	public static final String DASH_URL = "https://marijavukicevic1.humanity.com/app/dashboard/";
	public static final String TIME_CLOCK_URL = "https://marijavukicevic1.humanity.com/app/timeclock/";
	public static final String LEAVE_URL = "https://marijavukicevic1.humanity.com/app/requests/vacation/";
	public static final String TRAINING_URL = "https://marijavukicevic1.humanity.com/app/training/";
	public static final String STAFF_URL = "https://marijavukicevic1.humanity.com/app/staff/list/load/true/";
	public static final String PAYROLL_URL = "https://marijavukicevic1.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORTS_URL = "https://marijavukicevic1.humanity.com/app/reports/dashboard/";
	public static final String AVAILABILITY_URL = "https://marijavukicevic1.humanity.com/fe/availability/";
	public static final String EDIT_DETAILS_URL = "https://marijavukicevic1.humanity.com/app/staff/edit/6369385/";
	public static final String SETTINGS_URL = "https://marijavukicevic1.humanity.com/app/admin/settings/";
	
	public static final String ADD_EMPL_BTN_XPATH = "//*[@id=\"act_primary\"]";
	public static final String TXT_FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	public static final String TXT_LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String TXT_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String SAVE_EMPL_BTN_XPATH = "//*[@id=\"_as_save_multiple\"]";
	
	public static final String ADDED_EMPLOYEE_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/a";
	public static final String ADDED_EMPLOYEE_EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String ADDED_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	public static final String SAVE_CHANGES_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	
	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]";
	public static final String LANG_SETTINGS_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_SETTINGS_XPATH = "//*[@id=\"act_primary\"]";
	public static final By SETTINGS_LANG = By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select");
	
	public static final By SETTINGS_NOTIF_EMAIL = By.id("pref_pref_email");
	public static final By SETTINGS_NOTIF_SMS = By.id("pref_pref_sms");
	public static final By SETTINGS_NOTIF_PUSH = By.id("pref_pref_mobile_push");
	
	public static final String NOTIF_EMAIL_ID = "pref_pref_email";
	public static final String NOTIF_SMS_ID = "pref_pref_sms";
	public static final String NOTIF_PUSH_ID = "pref_pref_mobile_push";
	
	public static final String USER_SETTINGS_XPATH = "//*[@id=\"userm\"]/div/a[2]";
	public static final String TXT_NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
	public static final String NEW_NICKNAME = "Masa";
	
	
	
	

}
