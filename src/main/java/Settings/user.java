package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class user {
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

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='test'])[2]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}