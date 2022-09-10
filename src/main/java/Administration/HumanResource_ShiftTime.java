package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HumanResource_ShiftTime {
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

		driver.quit();

	}
}
