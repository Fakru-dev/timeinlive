package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Administration_Asset_SparceClassify {
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

		driver.quit();
	}
}
