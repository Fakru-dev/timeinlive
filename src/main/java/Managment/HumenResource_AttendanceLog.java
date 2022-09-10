package Managment; 

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import OverAll.DataUtils;

public class HumenResource_AttendanceLog {
	  
		@Test(dataProvider = "getData", dataProviderClass = DataUtils.class)
		public void TimeInLive(String user, String password) throws InterruptedException{
			System.out.println(user + "\n" + password);

			// for create blank html
			ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.php");
			// actual report
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(reporter);
			ExtentTest test = extent.createTest("TimeInLive");

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			driver.get("http://dev.gcab.in/login.php");
			test.pass("URL opened"); 
			test.pass(driver.getTitle());
	 
			driver.findElement(By.name("username")).sendKeys(user);
			test.pass("enter the Username");

			driver.findElement(By.name("password")).sendKeys(password);
			test.pass("enter the Password ");

			driver.findElement(By.xpath("//*[@class='btn btn-primary min-width']")).click();
		


		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);
 
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-eye orange']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@class='active-result'])[15]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);
		
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

		driver.quit();
		extent.flush();

	}
}
