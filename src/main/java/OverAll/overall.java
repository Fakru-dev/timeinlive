package OverAll;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class overall {
	@Parameters({ "user", "password" })
	@Test
	public void TimeInLive(String user, String password) throws InterruptedException, AWTException {
		System.out.println(user + "\n" + password);

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://dev.gcab.in/login.php");
		System.out.println("URL opened");
		System.out.println(driver.getTitle());

		driver.findElement(By.name("username")).sendKeys(user); 
		System.out.println("User name enter successfully");

		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Password enter successfully");

		driver.findElement(By.xpath("//*[@class='btn btn-primary min-width']")).click();
		String expected = "Smart Work Force Management";
		String actual = driver.getTitle();

		if (expected.equals(actual)) {
			System.out.println("Login successfully");
		} else {
			System.out.println("login failed");
		}

//HUMENRESOURCE_ATTENDANCELOG:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-eye orange']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);
		System.err.println("Attendaance Log Page Opened");

		driver.findElement(By.xpath("(//*[@class='active-result'])[15]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);
		System.out.println("Serch Option Worked");

		driver.findElement(By.xpath("(//*[@class='fa fa-pencil'])")).click();
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.id("shiftid"));
		Select drop = new Select(ele);
		drop.selectByValue("90");

		WebElement in = driver.findElement(By.id("locinid"));
		Select loc = new Select(in);
		loc.selectByValue("29");

		WebElement out = driver.findElement(By.id("locoutid"));
		Select loca = new Select(out);
		loca.selectByValue("29");

		driver.findElement(By.id("logindate")).click();

		driver.findElement(By.xpath("(//*[@class='ui-state-default'])[15]")).click();

		driver.findElement(By.id("logintime")).click();

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-hour']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-hour']")).sendKeys("09");

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-minute']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-minute']")).sendKeys("00");

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-second']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-second']")).sendKeys("00");

		driver.findElement(By.id("loginremarks")).clear();
		driver.findElement(By.id("loginremarks")).sendKeys("test");

		driver.findElement(By.id("logouttime")).click();

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-hour']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-hour']")).sendKeys("18");

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-minute']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-minute']")).sendKeys("00");

		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-second']")).clear();
		driver.findElement(By.xpath("//*[@class='bootstrap-timepicker-second']")).sendKeys("00");

		driver.findElement(By.id("logoutremarks")).clear();
		driver.findElement(By.id("logoutremarks")).sendKeys("test");

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(2000);
		System.out.println("Attendaance Log Edit Option Worked");

//HUMENRESOURCE_LEAVE:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='Leave']")).click();
		Thread.sleep(3000);
		System.err.println("Leave Page Opened");

		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='active-result'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);
		System.out.println("Serch Option Worked");

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"typeid_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"typeid_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"absencetype_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"absencetype_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("leavefrom")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();

		driver.findElement(By.id("reason")).clear();
		driver.findElement(By.id("reason")).sendKeys("test");
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div[2]/form/div[5]/div/div/button[1]/a"))
				.click();
		System.out.println("Leave Update Option Worked");

		driver.get("http://dev.gcab.in/leaveview.php");
		Thread.sleep(3000);

//HUMENRESOURCE_PERMISSION:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);
		System.err.println("Permission Page Opened");

		driver.findElement(By.xpath("(//*[@class='active-result'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);
		System.out.println("Serch Option Worked");

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("date")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();

		driver.findElement(By.id("starttime")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("11");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("endtime")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("12");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("reason")).clear();
		driver.findElement(By.id("reason")).sendKeys("test");
		Thread.sleep(1000);
		System.out.println("Permission Add Option Worked");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[8]/div/div/button[1]"))
				.click();

//HUMENRESOURCE_SHIFT_ASSIGN
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/nav/div/a[4]")).click();
		Thread.sleep(1000);
		System.err.println("Shift Assign Page Opened");

		driver.findElement(By.id("shifttitle")).sendKeys("TEST SHIFT");

		driver.findElement(By.xpath("//*[@id=\"shiftadd\"]/div[2]/div[1]/div/div/div[1]/div[1]/div")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"shiftadd\"]/div[2]/div[1]/div/div/div[1]/div[1]/div/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"repeatweek_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"repeatweek_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("shiftstartdate")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]/a/span")).click();

		driver.findElement(By.xpath("//*[@id=\"shiftadd\"]/div[3]/div/div/div[1]/div/button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"shiftadd\"]/div[3]/div/div/div[2]/div/button[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"shiftadd\"]/div[4]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid-header\"]/div/div/div[1]/div/input")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();

		driver.findElement(By.id("shifttitle")).clear();
		Thread.sleep(1000);

		driver.findElement(By.id("shifttitle")).sendKeys("TEST SHIFT");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"shiftid_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div[2]/table/tbody/tr/td/div/div/table/tbody/tr/td/div/div[2]/div/form/div[2]/div[1]/div/div/div[1]/div[1]/div/a/span"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"repeatweek_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"repeatweek_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("shiftstartdate")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]")).click();

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]/a/span")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[3]/div/div/div[1]/div/button[1]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[3]/div/div/div[2]/div/button[2]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By
				.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[4]/div/div/button[1]/a"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"grid-header\"]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[4]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[5]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[6]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[7]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[4]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[5]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[6]")).click();
		driver.findElement(By.xpath("(//*[@class='dropdown-item'])[7]")).click();
		Thread.sleep(2000);
		System.out.println("Shift Assing Updated");

//HUMENRESOURCE_MISSED_ATTENDANCE:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		System.err.println("Missed Attendance Page Opened");

//BASIC_REPORTS_TRANSACTION:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		System.err.println("Transaction Report Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_ReportStartDate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"criteria_crieid\"]/td[2]/span/span[1]/span")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crieid-results\"]/li[3]")).click();

		driver.findElement(By.name("criattendtype[]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"criteria_criLocation\"]/td[2]/span/span[1]/span")).sendKeys("t");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_criLocation-results\"]/li[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_crishiftname\"]/td[2]/input[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_crivendor\"]/td[2]/span/span[1]/span")).sendKeys("t");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crivendor-results\"]/li[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"criteria_critemp\"]/td[2]/input[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(2000);
		System.out.println("Transaction Report worked");

//BASIC_REPORTS_ABSENT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		System.err.println("Absent Report Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_crireportdate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_criempid-results\"]/li[4]")).click();

		driver.findElement(By.name("crishift[]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		System.out.println("Absent Report Page Worked");

//BASIC_REPORTS_ERROR:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		System.err.println("Error Report Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_cridate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"criteria_cridepartment\"]/td[2]/span/span[1]/span")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='select2-results__option']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		System.out.println("Error Report worked");

//BASIC_REPORTS_REGISTER:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Error Register Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_criregisterdate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		System.out.println("Register Report Worked");

//BASIC_REPORTS_LEAVE_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Leave Register Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='form-control swDateField hasDatepicker']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("p");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crileavetype-results\"]/li[1]")).click();

		driver.findElement(By.xpath("(//*[@class='select2-selection select2-selection--multiple'])[4]")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li[1]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		System.out.println("Leave Report Worked");

//BASIC_REPORTS_LOCATION_ROSTER:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Location Roster Report Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Location Roaster']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_criregisterdate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_crieid\"]/td[2]/span/span[1]/span")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crieid-results\"]/li[3]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		System.out.println("Location Roster Report Worked");

//BASIC_REPORTS_ABSENCE_PLANNER_TEMPLATE:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Absence Panner Template Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Absence Planner Template']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_cridate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_criempname\"]/td[2]/span/span[1]/span")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_criempname-results\"]/li")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(1000);
		System.out.println("Absence Panner Template Worked");

//ADVANCED_REPORT_DAILY_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Daily Report Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Daily Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("swDateField_ReportDate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crieid-results\"]/li[4]")).click();

		driver.findElement(By.name("crishift[]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(1000);
		System.out.println("Daily Report Worked");

//ADVANCED_REPORT_WEEKLY_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Weekly Report Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Weekly Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("swDateField_ReportDate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crieid-results\"]/li[4]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(5000);
		System.out.println("Daily Report Worked");

//ADVANCED_REPORT_MONTHLY_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Monthly Report Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Monthly Report']")).click();
		Thread.sleep(2000);

		Select block = new Select(driver.findElement(By.xpath("//*[@class='form-control swPrpDropSelectRegular']")));
		block.selectByValue("6");
		Thread.sleep(2000);

		Select block1 = new Select(
				driver.findElement(By.xpath("(//*[@class='form-control swPrpDropSelectRegular'])[2]")));
		block1.selectByValue("2022");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		System.out.println("Monthly Report Worked");

//ADVANCED_REPORT_ACRUAL_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Acrual Report Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Acrual Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("swDateField_crimonth_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li[1]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		System.out.println("Acrual Report Worked");

//ADVANCED_REPORT_CUMULATIVE_REPORT:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Cumulative Report Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Cumulative Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("swDateField_crimonth_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crieid-results\"]/li[4]")).click();

		driver.findElement(By.xpath("(//*[@class='select2-selection select2-selection--multiple'])[3]")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_criselect\"]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"criteria_criselect\"]/td[2]/input[1]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(2000);
		System.out.println("Cumulative Report Worked");

//ADVANCED_REPORT_LOCATION_SUMMARY:
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		System.err.println("Location Summary Page Opened");

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Location Summary']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"criteria_crideviceloc\"]/td[2]/span/span[1]/span")).sendKeys("s");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_crideviceloc-results\"]/li[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_cridevicetype\"]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"criteria_cridevicetype\"]/td[2]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"criteria_cristate\"]/td[2]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(1000);
		System.out.println("Location Summary Worked");

// PROJECT:
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='btn btn-white btn-xs']")).click();
		Thread.sleep(1000);

		WebElement ele44 = driver.findElement(By.id("compstat"));
		Select drop44 = new Select(ele44);
		drop44.selectByValue("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='testTT(1003)'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[5]/td[11]/a")).click();
		Thread.sleep(1000);

		WebElement ele3 = driver.findElement(By.id("compstat"));
		Select drop3 = new Select(ele3);
		drop3.selectByValue("3");

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='testTT(1003)'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div[1]/nav/div/a[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Choose Customer...']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='AlFareeda'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();

		driver.findElement(By.id("entityname")).clear();
		driver.findElement(By.id("entityname")).sendKeys("auto test");

		driver.findElement(By.id("entitydesc")).sendKeys("automation testing");

		driver.findElement(By.xpath("//*[text()='Choose Department...']")).click();
		driver.findElement(By.xpath("//*[text()='LKN-IFMS']"));

		driver.findElement(By.id("entityref")).clear();
		driver.findElement(By.id("entityref")).sendKeys("4569874");

		driver.findElement(By.id("entityloc")).clear();
		driver.findElement(By.id("entityloc")).sendKeys("try");

		driver.findElement(By.xpath("//*[text()='Choose Location...']")).click();
		driver.findElement(By.xpath("//*[text()='Branch-CHN']"));

		driver.findElement(By.id("startdate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]")).click();

		driver.findElement(By.id("enddate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.id("staffest")).clear();
		driver.findElement(By.id("staffest")).sendKeys("56");

		driver.findElement(By.id("entitycost")).clear();
		driver.findElement(By.id("entitycost")).sendKeys("120000");

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"stage\"]")).sendKeys("testing");

		driver.findElement(By.xpath("//*[@id=\"stagecnt\"]")).sendKeys("20");

		driver.findElement(By.id("mstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]")).click();

		driver.findElement(By.id("menddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"addstage\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"removeSelected\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[1]/div/div[1]/div/ul/li[3]/a"))
				.click();
		Thread.sleep(1000);

		WebElement ele15 = driver.findElement(By.id("productid"));
		Select drop15 = new Select(ele15);
		drop15.selectByValue("6");
		Thread.sleep(1000);

		driver.findElement(By.id("quantity")).sendKeys("5");

		WebElement ewle15 = driver.findElement(By.id("unit"));
		Select dwrop15 = new Select(ewle15);
		dwrop15.selectByValue("3 | Boxes");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"addprod\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid1\"]/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"prodremoveSelected\"]")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[2]/div/div/button[1]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/nav/div/a[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"updtask\"]")).click();
		Thread.sleep(1000);

		WebElement ele33 = driver.findElement(By.id("compstat"));
		Select drop33 = new Select(ele33);
		drop33.selectByValue("2");

		driver.findElement(By.xpath("//*[@id=\"eid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"eid_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("automation testing");

		driver.findElement(By.id("taskdesc")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"empid_chosen\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Hakim [2601]'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"departid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.id("taskstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.id("taskenddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]")).click();

		WebElement ele23 = driver.findElement(By.xpath("(//*[@class='form-control'])[4]"));
		Select drop23 = new Select(ele23);
		drop23.selectByValue("2");

		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("56");

		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("120000");

		WebElement ele231 = driver.findElement(By.xpath("(//*[@class='form-control'])[7]"));
		Select drop231 = new Select(ele231);
		drop231.selectByValue("2");

		driver.findElement(By.xpath("(//*[@class='form-control'])[8]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[8]")).sendKeys("50");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[1]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@name='group'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();

//AUTOMIZE-SCHEDULE-REPORT:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		System.err.println("Schdule Report Page Opened");

		driver.findElement(By.xpath("//*[@class='orange fa fa-pencil bigger-110']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div[2]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div/form/div/div/div[2]/div/div/div[2]/div/textarea"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div[2]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div/form/div/div/div[2]/div/div/div[2]/div/textarea"))
				.sendKeys("1234@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);
		System.out.println("Schdule Report Edit Option Worked");

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/nav/div/a[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[2]/div/input"))
				.sendKeys("Leave Report");

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[3]/div/input"))
				.sendKeys("123@gmail.com");

		Select property = new Select(driver.findElement(By.xpath("//*[@class='button']")));
		property.selectByValue("CSV");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"Schedule\"]/div/div/div[1]/div/div/input[3]")).click();
		Thread.sleep(1000);

		Select property1 = new Select(driver.findElement(By.xpath("(//*[@class='button'])[3]")));
		property1.selectByValue("1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"stime\"]")).sendKeys("10:00 AM");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[5]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(1000);

		Select property11 = new Select(driver.findElement(By.xpath("(//*[@class='form-control'])[2]	")));
		property11.selectByValue("35");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])[2]")).click();
		Thread.sleep(1000);
		System.out.println("Schdule Report Add Option Worked");

//AUTOMIZE-SHIFT_PLANNER:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		System.err.println("Shift Planner Page Opened");

		driver.findElement(By.xpath("//*[@class='fc-next-button fc-button fc-button-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='fc-next-button fc-button fc-button-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='fc-today-button fc-button fc-button-primary']")).click();

		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//*[@id=\"12\"]"));
		WebElement to = driver.findElement(By.xpath(
				"//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[1]/td/div"));
		builder.dragAndDrop(from, to).perform();
		Thread.sleep(1000);

		Actions builder1 = new Actions(driver);
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"57\"]"));
		WebElement to1 = driver.findElement(By.xpath(
				"//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[3]/td/div"));
		builder1.dragAndDrop(from1, to1).perform();
		Thread.sleep(1000);

		Actions builder2 = new Actions(driver);
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"59\"]"));
		WebElement to2 = driver.findElement(By.xpath(
				"//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[4]/td/div"));
		builder2.dragAndDrop(from2, to2).perform();

		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[1]")).click();
		Thread.sleep(1000);
		System.out.println("Shift Planner worked");
		Thread.sleep(1000);

// AUTOMIZE-TASK_PLANNER:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		System.err.println("Task Planner Page Opened");

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		System.out.println("Task Planner worked");
		Thread.sleep(2000);

//AUTOMIZE-SERVICES_PLANNER:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-calendar-plus-o orange']")).click();
		Thread.sleep(2000);
		System.err.println("Services Planner Page Opened");

		driver.findElement(By.xpath("//*[@class='chosen-single chosen-single-with-deselect']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		System.out.println("Services Planner worked");
		Thread.sleep(2000);

//AUTOMIZE-HUMAN RESOURCE-STAFF:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='5115 | FAKRUDEEN'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr/td[12]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("employeename")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("employeename")).sendKeys("FAKRU ABR");

		driver.findElement(By.xpath("//*[@id=\"personal\"]/div/div[1]/div[1]/div[2]/div/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personal\"]/div/div[1]/div[1]/div[2]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"cardno\"]")).sendKeys("45632");

		driver.findElement(By.xpath("//*[@id=\"phoneno\"]")).sendKeys("987456321");

		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("try");

		driver.findElement(By.xpath("//*[@id=\"rfidmac\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"rfidmac\"]")).sendKeys("365298743652");

		driver.findElement(By.xpath("//*[@id=\"dateofbirth\"]")).click();
		Thread.sleep(1000);

		WebElement ele115 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select drop115 = new Select(ele115);
		drop115.selectByValue("11");
		Thread.sleep(1000);

		WebElement ele015 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select drop015 = new Select(ele015);
		drop015.selectByValue("1980");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"placeofbirth\"]")).sendKeys("tamil nadu");

		driver.findElement(By.xpath("//*[@id=\"ethinic\"]")).sendKeys("4564");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Male'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"remarks\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@class='form-control input-mask-date hasDatepicker']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control input-mask-date hasDatepicker'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control input-mask-date hasDatepicker'])[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='General'])[3]")).click();

		driver.findElement(By.id("designation")).sendKeys("Developer");

		driver.findElement(By.id("skill")).sendKeys("Developing");

		driver.findElement(By.id("phoneExtn")).sendKeys("987654321");

		driver.findElement(By.id("emailid")).sendKeys("fakrudeen@gmail.com");

		driver.findElement(By.id("macid")).sendKeys("968545");

		driver.findElement(By.name("prjagent")).click();

		driver.findElement(By.name("salagent")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='ankidyne [ankidyne]'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[1]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[2]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[3]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgverify\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"imgrestrict\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[4]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[3]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgverify\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"imgrestrict\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[4]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgauto\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[5]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div[2]/div/div/button[1]/a"))
				.click();
		Thread.sleep(2000);

//AUTOMIZE-HUMAN RESOURCE-DEPORTMENT:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-group blue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departname")).sendKeys("Test Deportment");

		driver.findElement(By.id("area")).sendKeys("Test Area");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn moveall btn-white btn-bold btn-info']")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[6]/a[1]/img")).click();

		driver.findElement(By.id("departname")).sendKeys("Test Deportment");

		driver.findElement(By.id("area")).sendKeys("Test Area");

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();

		driver.findElement(By.xpath("//*[@class='btn moveall btn-white btn-bold btn-info']")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();
		Thread.sleep(2000);

//AUTOMIZE-HUMAN RESOURCE-SHIFTTIME:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-clock-o brown']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("shiftname")).sendKeys("Test Shift");

		driver.findElement(By.id("shiftcode")).sendKeys("TS");

		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();

		driver.findElement(By.id("shiftstarttime")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("09");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("shiftendtime")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("18");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("earlyhour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("10");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("latehour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("15");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("breakhour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("01");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("ShiftName")).clear();
		driver.findElement(By.id("ShiftName")).sendKeys("Test Shift");

		driver.findElement(By.id("shiftcode")).clear();
		driver.findElement(By.id("shiftcode")).sendKeys("TS");

		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();

		driver.findElement(By.id("ShiftStartTime")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("09");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("ShiftEndTime")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("18");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("earlyhour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("10");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("latehour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("15");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("breakhour")).click();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[1]/input")).sendKeys("01");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

//Administration_Services_ServicesProduct:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[34]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-qrcode blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr ->'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).sendKeys("5");

		driver.findElement(By.xpath("(//*[@class='form-control'])[4]")).sendKeys("3562");

		driver.findElement(By.id("sodate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.id("dodate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.id("locationid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("Test Area");

		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("Test");

		driver.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("12000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='text-primary menu-icon fa fa-clipboard-list']")).click();
		Thread.sleep(1000);

		WebElement ele4 = driver.findElement(By.id("productid"));
		Select drop4 = new Select(ele4);
		drop4.selectByValue("38|Water Meter|30");

		WebElement ele1 = driver.findElement(By.id("stkassignid"));
		Select drop1 = new Select(ele1);
		drop1.selectByValue("19|30");

		driver.findElement(By.xpath("(//*[@class='form-control'])[11]")).sendKeys("458658");
		driver.findElement(By.xpath("(//*[@class='form-control'])[13]")).sendKeys("45698563");
		driver.findElement(By.xpath("(//*[@class='form-control'])[15]")).sendKeys("236589");
		driver.findElement(By.xpath("(//*[@class='form-control'])[17]")).sendKeys("4587962");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"defassign\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"assign\"]/div[2]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"assign\"]/div[2]/input[1]")).click();

		WebElement ele2 = driver.findElement(By.id("eid"));
		Select drop2 = new Select(ele2);
		drop2.selectByValue("2472");

		driver.findElement(By.xpath("//*[@id=\"escalate\"]")).click();

		WebElement ele34 = driver.findElement(By.id("priority"));
		Select drop34 = new Select(ele34);
		drop34.selectByValue("2");

		driver.findElement(By.xpath("//*[@id=\"prevschedule\"]")).click();

		driver.findElement(By.id("prevactivity")).sendKeys("test");

		WebElement ele41 = driver.findElement(By.id("prevperiod"));
		Select drop41 = new Select(ele41);
		drop41.selectByValue("4");

		driver.findElement(By.id("prevfreq")).sendKeys("5");

		driver.findElement(By.id("prevlead")).sendKeys("9");

		driver.findElement(By.id("prevestimate")).sendKeys("5");

		driver.findElement(By.id("prevautoclose")).sendKeys("7");

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele5 = driver.findElement(By.id("deviceid"));
		Select drop5 = new Select(ele5);
		drop5.selectByValue("105");

		driver.findElement(By.id("minlimit")).sendKeys("7");

		driver.findElement(By.id("maxlimit")).sendKeys("20");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("sonum")).clear();
		driver.findElement(By.id("sonum")).sendKeys("1");

		driver.findElement(By.xpath("//*[@class='text-primary menu-icon fa fa-clipboard-list']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("val-\"23\"")).clear();
		driver.findElement(By.id("val-\"23\"")).sendKeys("82");

		driver.findElement(By.id("val-\"24\"")).clear();
		driver.findElement(By.id("val-\"24\"")).sendKeys("69");

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele52 = driver.findElement(By.id("eid"));
		Select drop52 = new Select(ele52);
		drop52.selectByValue("2472");

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele51 = driver.findElement(By.id("deviceid"));
		Select drop51 = new Select(ele51);
		drop51.selectByValue("108");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		Thread.sleep(1000);

//Administration_Services_Maintenance:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[34]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-eye pink'])[8]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='AlFareeda'])[2]")).click();

		driver.findElement(By.id("amcdesc")).sendKeys("Test");

		driver.findElement(By.id("amcstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[1]")).click();

		driver.findElement(By.id("amcexpirydate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[6]/td[1]")).click();

		WebElement ele54 = driver.findElement(By.id("billingcycle"));
		Select drop54 = new Select(ele54);
		drop54.selectByValue("2");

		WebElement ele543 = driver.findElement(By.id("preventivemaintenance"));
		Select drop543 = new Select(ele543);
		drop543.selectByValue("2");

		driver.findElement(By.id("amcpackage")).sendKeys("Test");
		driver.findElement(By.id("amcrenewal")).sendKeys("Test");
		driver.findElement(By.id("remarks")).sendKeys("Test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("installdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[4]/td[2]")).click();

		WebElement ele55 = driver.findElement(By.id("locationid"));
		Select drop55 = new Select(ele55);
		drop55.selectByValue("20");
		Thread.sleep(1000);

		WebElement ele56 = driver.findElement(By.id("sparesid"));
		Select drop56 = new Select(ele56);
		drop56.selectByValue("28|Air Bolt|3");
		Thread.sleep(1000);

		driver.findElement(By.id("btnSparesadd")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("amcdesc")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		Thread.sleep(2000);

//Administration_Asset_Product:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("productref")).sendKeys("12462354");
		driver.findElement(By.id("productname")).sendKeys("Test");
		driver.findElement(By.id("model")).sendKeys("Test Model");
		driver.findElement(By.id("dimension")).sendKeys("Test");
		driver.findElement(By.id("color")).sendKeys("Red");
		driver.findElement(By.id("weight")).sendKeys("5 Kg");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		WebElement ele26 = driver.findElement(By.id("assignid"));
		Select drop26 = new Select(ele26);
		drop26.selectByValue("61");

		driver.findElement(By.id("locquantity")).sendKeys("5");

		WebElement ele27 = driver.findElement(By.id("locunitid"));
		Select drop27 = new Select(ele27);
		drop27.selectByValue("3|Boxes");

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary btn-block'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele28 = driver.findElement(By.id("assignid"));
		Select drop28 = new Select(ele28);
		drop28.selectByValue("78");

		driver.findElement(By.id("locquantity")).sendKeys("5");

		WebElement ele29 = driver.findElement(By.id("locunitid"));
		Select drop29 = new Select(ele29);
		drop29.selectByValue("3|Boxes");

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary btn-block'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"show_location\"]/tr/td[1]/input")).click();

		driver.findElement(By.id("locremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele30 = driver.findElement(By.id("vendorid"));
		Select drop30 = new Select(ele30);
		drop30.selectByValue("980");

		driver.findElement(By.id("vndcost")).sendKeys("500");

		driver.findElement(By.id("addsup")).click();
		Thread.sleep(1000);

		WebElement ele32 = driver.findElement(By.id("vendorid"));
		Select drop32 = new Select(ele32);
		drop32.selectByValue("983");

		driver.findElement(By.id("vndcost")).clear();
		driver.findElement(By.id("vndcost")).sendKeys("500");

		driver.findElement(By.xpath("//*[@id=\"show_supplier\"]/tr/td[1]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("supremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele341 = driver.findElement(By.id("sparesid"));
		Select drop341 = new Select(ele341);
		drop341.selectByValue("18");

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("200");

		WebElement ele35 = driver.findElement(By.id("unitid"));
		Select drop35 = new Select(ele35);
		drop35.selectByValue("4|Litres");
		Thread.sleep(1000);

		driver.findElement(By.id("addprod")).click();
		Thread.sleep(1000);

		WebElement ele36 = driver.findElement(By.id("sparesid"));
		Select drop36 = new Select(ele36);
		drop36.selectByValue("21");

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("200");

		WebElement ele37 = driver.findElement(By.id("unitid"));
		Select drop37 = new Select(ele37);
		drop37.selectByValue("2|Kilogram");
		Thread.sleep(1000);

		driver.findElement(By.id("addprod")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"show_product\"]/tr/td[1]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prodremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("serviceplan")).sendKeys("test");

		driver.findElement(By.id("servdesc")).sendKeys("test");

		WebElement ele38 = driver.findElement(By.id("frequency"));
		Select drop38 = new Select(ele38);
		drop38.selectByValue("2");

		driver.findElement(By.id("frequnits")).sendKeys("99");
		driver.findElement(By.id("leaddays")).sendKeys("26");
		driver.findElement(By.id("estdue")).sendKeys("10");

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("productname")).clear();
		driver.findElement(By.id("productname")).sendKeys("AC");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("locquantity")).clear();
		driver.findElement(By.id("locquantity")).sendKeys("58");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("vndcost")).clear();
		driver.findElement(By.id("vndcost")).sendKeys("600");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("9");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("serviceplan")).clear();
		driver.findElement(By.id("serviceplan")).sendKeys("Test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();

//Administration_Asset_ProductClassify:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-tag orange']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prodclassref")).sendKeys("22");
		driver.findElement(By.id("prodclassdesc")).sendKeys("Automation Testing");
		driver.findElement(By.id("prodclassdesc")).sendKeys("Test");
		driver.findElement(By.id("unit")).sendKeys("serial code");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("modle number");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("mac ");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"unitlist\"]/option[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("mac");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"unitlist\"]/option[1]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-warning'])")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[5]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prodclassdesc")).clear();
		driver.findElement(By.id("prodclassdesc")).sendKeys("Automation Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div[2]/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

//Administration_Asset_Sparce:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-wrench blue'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Mobiles'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])")).sendKeys("Mobile");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Ducketmesh'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("Test");
		driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).sendKeys("2");
		driver.findElement(By.xpath("(//*[@class='form-control'])[4]")).sendKeys("5");
		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("OPPO");
		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("Test");
		driver.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("20000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[5]/center/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("laptop");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[5]/center/div/button[1]/a")).click();
		Thread.sleep(1000);

//Administration_Asset_SparceClassify:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-tag orange'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("sparesclassref")).sendKeys("22");
		driver.findElement(By.id("sparesclassdesc")).sendKeys("Automation Testing");
		driver.findElement(By.id("sparesclasstype")).sendKeys("Test");
		driver.findElement(By.id("unit")).sendKeys("serial code");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("modle number");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("lap");
		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-primary']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"unitlist\"]/option[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("unit")).clear();
		driver.findElement(By.id("unit")).sendKeys("lap");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"unitlist\"]/option[1]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-warning'])")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[5]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("sparesclassdesc")).clear();
		driver.findElement(By.id("sparesclassdesc")).sendKeys("Automation Testing");
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div/button[1]/a")).click();
		Thread.sleep(1000);

//Administration_Asset_knownDefects:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-bug red'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='TestGrid'])[2]")).click();

		driver.findElement(By.id("issuecode")).sendKeys("Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[2]/div[3]/div/div/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr/td[3]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("issuecode")).clear();
		driver.findElement(By.id("issuecode")).sendKeys("Automation Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[2]/div[3]/div/div/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

//Administration_Asset_category:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-map orange'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='manager - PTest [1]'])[2]")).click();

		driver.findElement(By.id("level")).sendKeys("1");

		driver.findElement(By.id("tasktitle")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-multi']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.id("teamdesc")).sendKeys("Automation Testing");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"teamadd\"]/div/div[2]/div[4]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Test Project [test try->test try]'])[2]")).click();

		WebElement in2 = driver.findElement(By.id("stageid"));
		Select loc2 = new Select(in2);
		loc2.selectByValue("96|2");

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("test");

		driver.findElement(By.id("taskdesc")).clear();
		driver.findElement(By.id("taskdesc")).sendKeys("Automation Testing");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='testTT [1003]'])[2]")).click();

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Bareeth Home'])[2]")).click();

		WebElement in1 = driver.findElement(By.xpath("(//*[@class='form-control'])[4]"));
		Select loc1 = new Select(in1);
		loc1.selectByValue("2");

		driver.findElement(By.id("staffest")).clear();
		driver.findElement(By.id("staffest")).sendKeys("53");

		driver.findElement(By.id("taskcost")).clear();
		driver.findElement(By.id("taskcost")).sendKeys("6000");

		WebElement in11 = driver.findElement(By.xpath("(//*[@class='form-control'])[7]"));
		Select loc11 = new Select(in11);
		loc11.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.id("taskprogress")).clear();
		driver.findElement(By.id("taskprogress")).sendKeys("50");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[3]/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"updtask\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("remark")).sendKeys("Automation Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("test");
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[3]/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

//Administration_Asset_SensorPlanner:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-calendar-plus-o orange'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("servmondesc")).sendKeys("Temperature threshold limit");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Branch-CHN'])[2]")).click();

		driver.findElement(By.id("deviceid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Conference Room'])[2]")).click();

		driver.findElement(By.id("repeatweek_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Monday'])[2]")).click();

		driver.findElement(By.id("minlimit")).sendKeys("10.0000");
		driver.findElement(By.id("maxlimit")).sendKeys("50.0000");

		driver.findElement(By.id("startdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]")).click();

		driver.findElement(By.id("enddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.id("starttime")).click();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-hour'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-hour'])")).sendKeys("09");
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-minute'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-minute'])")).sendKeys("30");
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-second'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-second'])")).sendKeys("00");

		driver.findElement(By.id("endtime")).click();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-hour'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-hour'])")).sendKeys("11");
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-minute'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-minute'])")).sendKeys("30");
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-second'])")).clear();
		driver.findElement(By.xpath("(//*[@class='bootstrap-timepicker-second'])")).sendKeys("00");

		driver.findElement(By.xpath("//*[@id=\"servmonedit\"]/div[4]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='LOC1'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"servmonedit\"]/div[4]/div/button[1]/a")).click();
		Thread.sleep(1000);

//Administration_Telephone_Callrates:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[36]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-credit-card green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prefixcode")).sendKeys("10");

		driver.findElement(By.id("countryid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='LATVIA => 371'])[2]")).click();

		driver.findElement(By.id("vendor")).sendKeys("Etisalat");

		driver.findElement(By.id("cost")).sendKeys("0.20000");
		Thread.sleep(1000);

		driver.findElement(By.id("assigndt")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.id("expiredt")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prefixcode")).clear();
		driver.findElement(By.id("prefixcode")).sendKeys("60");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);

//Administration_Telephone_Groups:
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[36]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-users blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("groupcode")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.id("groupname")).sendKeys("ABR");

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn removeall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[4]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("groupname")).clear();
		driver.findElement(By.id("groupname")).sendKeys("Automation Testing");

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);

//Settings_User:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("username")).sendKeys("testing@mecom.com");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("eid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='5115 | FAKRUDEEN'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Supervisor'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.id("locationid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Branch-TRY'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("module[HR]")).click();
		driver.findElement(By.name("module[payroll]")).click();
		driver.findElement(By.name("module[callrecord]")).click();
		driver.findElement(By.name("module[service]")).click();
		driver.findElement(By.name("module[track]")).click();
		driver.findElement(By.name("module[purchase]")).click();
		driver.findElement(By.name("module[HRbgverify]")).click();
		driver.findElement(By.name("module[pabx]")).click();
		driver.findElement(By.name("module[callcenter]")).click();
		driver.findElement(By.name("module[project]")).click();
		driver.findElement(By.name("module[sales]")).click();
		driver.findElement(By.name("module[collection]")).click();
		driver.findElement(By.name("module[visitor]")).click();
		driver.findElement(By.name("module[servicemeter]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("module[HR]")).click();
		driver.findElement(By.name("module[payroll]")).click();
		driver.findElement(By.name("module[callrecord]")).click();
		driver.findElement(By.name("module[service]")).click();
		driver.findElement(By.name("module[track]")).click();
		driver.findElement(By.name("module[purchase]")).click();
		driver.findElement(By.name("module[HRbgverify]")).click();
		driver.findElement(By.name("module[pabx]")).click();
		driver.findElement(By.name("module[callcenter]")).click();
		driver.findElement(By.name("module[project]")).click();
		driver.findElement(By.name("module[sales]")).click();
		driver.findElement(By.name("module[collection]")).click();
		driver.findElement(By.name("module[visitor]")).click();
		driver.findElement(By.name("module[servicemeter]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("module[HR]")).click();
		driver.findElement(By.name("module[HRbgverify]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='ace-icon fa fa-times']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='test'])[2]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

//Settings_Setup_Role:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-user-times blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("rolename")).sendKeys("Testing");
		Thread.sleep(1000);

		WebElement eleo = driver.findElement(By.id("moduleid"));
		Select dropo = new Select(eleo);
		dropo.selectByValue("1");
		Thread.sleep(1000);

		WebElement ele19 = driver.findElement(By.id("itemid"));
		Select drop19 = new Select(ele19);
		drop19.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		WebElement ele21 = driver.findElement(By.id("moduleid"));
		Select drop21 = new Select(ele21);
		drop21.selectByValue("7");
		Thread.sleep(1000);

		WebElement ele11 = driver.findElement(By.id("itemid"));
		Select drop11 = new Select(ele11);
		drop11.selectByValue("25");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		WebElement ele39 = driver.findElement(By.id("moduleid"));
		Select drop39 = new Select(ele39);
		drop39.selectByValue("6");
		Thread.sleep(1000);

		WebElement ele12 = driver.findElement(By.id("itemid"));
		Select drop12 = new Select(ele12);
		drop12.selectByValue("46");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(500);

		driver.findElement(By.id("removeSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("save")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[4]/a[1]/img")).click();
		Thread.sleep(1000);

		WebElement ele31 = driver.findElement(By.id("moduleid"));
		Select drop31 = new Select(ele31);
		drop31.selectByValue("6");
		Thread.sleep(1000);

		WebElement ele112 = driver.findElement(By.id("itemid"));
		Select drop112 = new Select(ele112);
		drop112.selectByValue("46");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("save")).click();
		Thread.sleep(1000);

//Setup_AbsenceType:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-share-alt brown']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("description")).sendKeys("Week Off");

		driver.findElement(By.id("code")).sendKeys("WO");

		driver.findElement(By.xpath("//*[@id=\"annual\"]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[5]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("leavedays")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("leavedays")).sendKeys("2");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

//Setup_Holiday:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-soccer-ball-o brown']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("reason")).sendKeys("Test Holiday");

		driver.findElement(By.id("hfrom")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.id("hto")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.id("departid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]	")).click();

		driver.findElement(By.id("locationid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("reason")).clear();
		driver.findElement(By.id("reason")).sendKeys("Holiday");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div/div[2]/form/div[2]/div/button[1]"))
				.click();
		Thread.sleep(1000);

//Setup_Currency:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-dollar blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		WebElement ele113 = driver.findElement(By.xpath("//*[@class='form-control']"));
		Select drop113 = new Select(ele113);
		drop113.selectByValue("1");
		Thread.sleep(1000);

		WebElement ele116 = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		Select drop116 = new Select(ele116);
		drop116.selectByValue("BD");
		Thread.sleep(1000);

		driver.findElement(By.id("curname")).sendKeys("test");

		driver.findElement(By.id("curbase")).click();
		Thread.sleep(500);

		driver.findElement(By.id("curbconverrate")).sendKeys("200000");
		Thread.sleep(500);

		driver.findElement(By.id("curdefcurrency")).click();
		Thread.sleep(500);

		driver.findElement(By.id("curautoupdate")).click();
		Thread.sleep(500);

		WebElement ele117 = driver.findElement(By.name("curdecimalpla"));
		Select drop117 = new Select(ele117);
		drop117.selectByValue("3");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[4]/a[1]/img")).click();
		Thread.sleep(1000);

		WebElement ele111 = driver.findElement(By.xpath("(//*[@class='form-control'])"));
		Select drop111 = new Select(ele111);
		drop111.selectByValue("0");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

//Setup_Category:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-plus blue'])[5]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("categtitle")).sendKeys("test");
		driver.findElement(By.id("categref")).sendKeys("12546");
		driver.findElement(By.id("categdesc")).sendKeys("Automation Testing");
		driver.findElement(By.id("categtype")).sendKeys("test");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[5]/div/input[1]"))
				.click();
		Thread.sleep(500);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[5]/div/input[2]"))
				.click();
		Thread.sleep(500);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[5]/div/input[3]"))
				.click();
		Thread.sleep(500);

		driver.findElement(By
				.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[6]/div/div/button[1]/a"))
				.click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[6]/a[1]/img")).click();
		Thread.sleep(500);

		driver.findElement(By.id("categref")).clear();
		driver.findElement(By.id("categref")).sendKeys("98658");
		Thread.sleep(500);

		driver.findElement(By
				.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[6]/div/div/button[1]/a"))
				.click();
		Thread.sleep(500);

//Setup_Customer:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-university orange']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Redmi CEO - Redmi CEO'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("contactid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Abdullah [ Ph:1123213; Mob :032123]'])[3]")).click();

		WebElement ele114 = driver.findElement(By.id("actvtytype"));
		Select drop114 = new Select(ele114);
		drop114.selectByValue("2");
		Thread.sleep(1000);

		driver.findElement(By.id("orgname")).clear();
		driver.findElement(By.id("orgname")).sendKeys("ABR");
		Thread.sleep(500);

		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("ABR");
		Thread.sleep(500);

		driver.findElement(By.id("mobile")).clear();
		driver.findElement(By.id("mobile")).sendKeys("9685741236");
		Thread.sleep(500);

		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("0456987");
		Thread.sleep(500);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("123@gmail.com");
		Thread.sleep(500);

		driver.findElement(By.id("web")).clear();
		driver.findElement(By.id("web")).sendKeys("test.com");
		Thread.sleep(500);

		driver.findElement(By.id("location")).clear();
		driver.findElement(By.id("location")).sendKeys("13.0826802;80.2707184");
		Thread.sleep(500);
		driver.findElement(By.id("getlatlng")).click();
		Thread.sleep(500);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("trichy");
		Thread.sleep(500);

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click();
		Thread.sleep(500);

		driver.findElement(By.id("login")).sendKeys("test@abrsys.com");
		Thread.sleep(500);

		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='bahadur - bahadur'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

//Measurement_Devices:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[39]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-tablet green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("devicename")).sendKeys("Test Devices");
		Thread.sleep(500);

		driver.findElement(By.id("deviceref")).sendKeys("123");
		Thread.sleep(500);

		WebElement ele110 = driver.findElement(By.id("controlid"));
		Select drop110 = new Select(ele110);
		drop110.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.id("devicelocation")).sendKeys("trichy");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@id=\"location\"]/div[2]/div[1]/a/div/div")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[text()='Chita'])[2]")).click();

		driver.findElement(By.id("locationid_chosen")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[text()='Branch-TRY'])[2]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-cog'])")).click();
		Thread.sleep(500);

		WebElement ele118 = driver.findElement(By.name("devicetype"));
		Select drop118 = new Select(ele118);
		drop118.selectByValue("RFID");
		Thread.sleep(1000);

		driver.findElement(By.id("devicemac")).sendKeys("1649684");
		Thread.sleep(500);

		driver.findElement(By.id("loginstate")).sendKeys("Test");
		Thread.sleep(500);

		driver.findElement(By.id("entry")).click();
		Thread.sleep(500);

		driver.findElement(By.id("access")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("deviceref")).clear();
		driver.findElement(By.id("deviceref")).sendKeys("1236");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);
//one page missing:
//Organization_Location:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-street-view green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("assignloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("branchloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("servloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("assigndesc")).sendKeys("Test Area");
		Thread.sleep(500);

		driver.findElement(By.id("location")).sendKeys("10.81134171924505, 78.69640666873326");
		Thread.sleep(500);

		driver.findElement(By.id("getlatlng")).click();
		Thread.sleep(500);

		driver.findElement(By.id("city")).sendKeys("Trichy");
		Thread.sleep(500);

		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		Thread.sleep(500);

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click();

		driver.findElement(By.id("assignradius")).clear();
		driver.findElement(By.id("assignradius")).sendKeys("100");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("assigndesc")).clear();
		driver.findElement(By.id("assigndesc")).sendKeys("Testing Area");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

//Organization_Deportment:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-group blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departname")).sendKeys("Test Deportment");
		Thread.sleep(500);

		driver.findElement(By.id("area")).sendKeys("Test Area");
		Thread.sleep(500);

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[6]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departname")).clear();
		driver.findElement(By.id("departname")).sendKeys("Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

//Organization_TeamHierarchy:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-sitemap'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("parentempid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='manager - PTest [1]'])[2]")).click();

		driver.findElement(By.id("level")).sendKeys("5");
		Thread.sleep(500);

		driver.findElement(By.id("tasktitle")).sendKeys("Test");
		Thread.sleep(500);

		driver.findElement(By.id("teamdesc")).sendKeys("Automation Testing");
		Thread.sleep(500);

		driver.findElement(By.id("departid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='All'])[2]")).click();
		Thread.sleep(500);

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"teamadd\"]/div/div[2]/div[3]/div/div/div[1]/div/button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

//Organization_Contact:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-user orange'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("customerid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='tesla'])[2]")).click();

		driver.findElement(By.id("contactname")).sendKeys("Test");
		Thread.sleep(500);
		driver.findElement(By.id("phone")).sendKeys("968574123");
		Thread.sleep(500);
		driver.findElement(By.id("mobile")).sendKeys("9865741236");
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("123@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("location")).sendKeys("Test Area");
		Thread.sleep(500);
		driver.findElement(By.id("city")).sendKeys("trichy");
		Thread.sleep(500);

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='AM - Armenia (+374)'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("contactname")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("contactname")).sendKeys("Test");

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

//Organization_Broadcast:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-bell blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("eid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='1003  testTT'])[2]")).click();

		driver.findElement(By.id("bctitle")).sendKeys("test");

		driver.findElement(By.id("bcdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.id("bctime")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("09");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("30");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).sendKeys("10");

		driver.findElement(By.id("message")).sendKeys("testing");

		driver.findElement(By.xpath("(//*[@class=' ace-icon ace-icon fa fa-picture-o'])")).click();
		Thread.sleep(1000);
		String file = "C:\\Users\\suppo\\Downloads\\fakru.jpg.jpg";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("bctitle")).clear();
		driver.findElement(By.id("bctitle")).sendKeys("test");

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();

//Organization_Suggestion:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-bell blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("eid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='ABRSYS [123]'])[2]")).click();

		driver.findElement(By.id("customerid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='cozmo '])[2]")).click();

		driver.findElement(By.id("typeid___chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Safety'])[2]")).click();

		driver.findElement(By.id("function")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.id("suggestion")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.id("benefit")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class=' ace-icon ace-icon fa fa-picture-o'])")).click();
		Thread.sleep(1000);
		String files = "C:\\Users\\suppo\\Downloads\\fakru.jpg.jpg";
		StringSelection selections = new StringSelection(files);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selections, null);

		Robot robots = new Robot();
		robots.keyPress(KeyEvent.VK_CONTROL);
		robots.keyPress(KeyEvent.VK_V);
		robots.keyRelease(KeyEvent.VK_V);
		robots.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robots.keyPress(KeyEvent.VK_ENTER);
		robots.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

//BulkUpload_Staffs:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-users blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='ace-file-container']")).click();
		Thread.sleep(1000);
		String file1 = "C:\\Users\\suppo\\Downloads\\staffimport";
		StringSelection selection1 = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-primary']")).click();
		Thread.sleep(1000);

//BulkUpload_Customers:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-user-plus blue']")).click();
		Thread.sleep(1000);
		/*
		 * driver.findElement(By.name("excelmodel")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//*[@class='ace-file-container']")).click();
		 * Thread.sleep(1000); String file1 =
		 * "C:\\Users\\suppo\\Downloads\\staffimport"; StringSelection selection1 = new
		 * StringSelection(file1);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,
		 * null);
		 * 
		 * Robot robot1 = new Robot(); robot1.keyPress(KeyEvent.VK_CONTROL);
		 * robot1.keyPress(KeyEvent.VK_V); robot1.keyRelease(KeyEvent.VK_V);
		 * robot1.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(1000);
		 * robot1.keyPress(KeyEvent.VK_ENTER); robot1.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//*[@class='btn btn-md btn-primary']")).click();
		 * Thread.sleep(1000);
		 */

//BulkUpload_Contacts.java:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-user blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		Thread.sleep(1000);
		String file11 = "C:\\Users\\suppo\\Downloads\\contactimport";
		StringSelection selection11 = new StringSelection(file11);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection11, null);

		Robot robot11 = new Robot();
		robot11.keyPress(KeyEvent.VK_CONTROL);
		robot11.keyPress(KeyEvent.VK_V);
		robot11.keyRelease(KeyEvent.VK_V);
		robot11.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot11.keyPress(KeyEvent.VK_ENTER);
		robot11.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.name("Add")).click();
		Thread.sleep(1000);

//BulkUpload_Shifts:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-calendar blue'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		Thread.sleep(1000);
		String file12 = "C:\\Users\\suppo\\Downloads\\shiftimport";
		StringSelection selection12 = new StringSelection(file12);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection12, null);

		Robot robot12 = new Robot();
		robot12.keyPress(KeyEvent.VK_CONTROL);
		robot12.keyPress(KeyEvent.VK_V);
		robot12.keyRelease(KeyEvent.VK_V);
		robot12.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot12.keyPress(KeyEvent.VK_ENTER);
		robot12.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.name("Add")).click();
		Thread.sleep(1000);

//BulkUpload_absence:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-calendar blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		 * Thread.sleep(1000); String file1 =
		 * "C:\\Users\\suppo\\Downloads\\shiftimport"; StringSelection selection1 = new
		 * StringSelection(file1);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,
		 * null);
		 * 
		 * Robot robot1 = new Robot(); robot1.keyPress(KeyEvent.VK_CONTROL);
		 * robot1.keyPress(KeyEvent.VK_V); robot1.keyRelease(KeyEvent.VK_V);
		 * robot1.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(1000);
		 * robot1.keyPress(KeyEvent.VK_ENTER); robot1.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.name("Add")).click(); Thread.sleep(1000);
		 */

//BulkUpload_Tasks:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-server blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		Thread.sleep(1000);
		String file13 = "C:\\Users\\suppo\\Downloads\\taskimport";
		StringSelection selection13 = new StringSelection(file13);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection13, null);

		Robot robot13 = new Robot();
		robot13.keyPress(KeyEvent.VK_CONTROL);
		robot13.keyPress(KeyEvent.VK_V);
		robot13.keyRelease(KeyEvent.VK_V);
		robot13.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot13.keyPress(KeyEvent.VK_ENTER);
		robot13.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.name("Add")).click();
		Thread.sleep(1000);

//BulkUpload_Spares:
		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog'])")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-tags blue'])")).click();
		Thread.sleep(1000);

		/*
		 * driver.findElement(By.name("excelmodel")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		 * Thread.sleep(1000); String file1 = "C:\\Users\\suppo\\Downloads\\taskimport";
		 * StringSelection selection1 = new StringSelection(file1);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,
		 * null);
		 * 
		 * Robot robot1 = new Robot(); robot1.keyPress(KeyEvent.VK_CONTROL);
		 * robot1.keyPress(KeyEvent.VK_V); robot1.keyRelease(KeyEvent.VK_V);
		 * robot1.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(1000);
		 * robot1.keyPress(KeyEvent.VK_ENTER); robot1.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.name("Add")).click(); Thread.sleep(1000);
		 */

		driver.findElement(By.xpath("//*[text()='Welcome,']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li/ul/li[2]/a")).click();
		Thread.sleep(5000);

		driver.quit();
	}
}
