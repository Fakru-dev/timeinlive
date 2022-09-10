package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organization_Deportment {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-group blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departname")).sendKeys("Test Deportment");
		Thread.sleep(500);

		driver.findElement(By.id("area")).sendKeys("Test Area");
		Thread.sleep(500);

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[6]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("departname")).clear();
		driver.findElement(By.id("departname")).sendKeys("Testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}
