package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Setup_AbsenceType {
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

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-share-alt brown']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("description")).sendKeys("Week Off");

		driver.findElement(By.id("code")).sendKeys("WO");

		driver.findElement(By.xpath("//*[@id=\"annual\"]")).click();

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[5]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("leavedays")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("leavedays")).sendKeys("2");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}
}
