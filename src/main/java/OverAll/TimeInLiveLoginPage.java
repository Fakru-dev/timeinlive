package OverAll;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TimeInLiveLoginPage {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
 
	@Test(dataProvider = "getData", dataProviderClass = DataUtils.class)
	public void TimeInLive(String user, String password) throws InterruptedException {
		System.out.println(user + "\n" + password);

		// for create blank html
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.php");
		// actual report 
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test = extent.createTest("TimeInLive");
		test.assignAuthor("FAKRUDEEN");

		
		driver.get("http://dev.gcab.in/login.php");
		test.pass("URL opened");
		test.pass(driver.getTitle());

		driver.findElement(By.name("username")).sendKeys(user);
		test.pass("enter the Username");

		driver.findElement(By.name("password")).sendKeys(password);
		test.pass("enter the Password ");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-primary min-width']")).click();
		Thread.sleep(2000);

		extent.flush();

	}
}
