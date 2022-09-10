package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organization_TeamHierarchy {
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

		driver.quit();

	}
}
