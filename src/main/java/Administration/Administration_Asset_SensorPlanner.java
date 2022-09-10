package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Administration_Asset_SensorPlanner {
	@Test
	public void InventoryManagment() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://dev.gcab.in/login.php");
		System.out.println("URL opened");
		System.out.println(driver.getTitle());
 
		driver.findElement(By.name("username")).sendKeys("Enter The Email ID here");
		System.out.println("User name enter successfully");

		driver.findElement(By.name("password")).sendKeys("Enter The Password Here");
		System.out.println("Password enter successfully");

		driver.findElement(By.xpath("//*[@class='btn btn-primary min-width']")).click();
		String expected = "Smart Work Force Management";
		String actual = driver.getTitle();

		if (expected.equals(actual)) {
			System.out.println("Login successfully");
		} else {
			System.out.println("login failed");
		}

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

		driver.quit();

	}
}
