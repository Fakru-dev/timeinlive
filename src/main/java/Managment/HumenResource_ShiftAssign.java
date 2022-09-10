package Managment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HumenResource_ShiftAssign {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/nav/div/a[4]")).click();
		Thread.sleep(1000);

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

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")).click();

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
		Thread.sleep(1000);
	}
}
