package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Measurement_Devices {
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

		WebElement ele115 = driver.findElement(By.id("controlid"));
		Select drop115 = new Select(ele115);
		drop115.selectByValue("1");
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

		WebElement ele116 = driver.findElement(By.name("devicetype"));
		Select drop116 = new Select(ele116);
		drop116.selectByValue("RFID");
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
		driver.quit();

	}
}