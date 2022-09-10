package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Setup_Category {
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

		driver.quit();

	}
}
