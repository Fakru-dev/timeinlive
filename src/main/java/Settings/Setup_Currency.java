package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Setup_Currency {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-dollar blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		WebElement ele113 = driver.findElement(By.xpath("//*[@class='form-control']"));
		Select drop113 = new Select(ele113);
		drop113.selectByValue("1");
		Thread.sleep(1000);

		WebElement ele112 = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		Select drop112 = new Select(ele112);
		drop112.selectByValue("BD");
		Thread.sleep(1000);

		driver.findElement(By.id("curname")).sendKeys("test");

		driver.findElement(By.id("curbase")).click();
		Thread.sleep(500);

		driver.findElement(By.id("curbconverrate")).sendKeys("200000");
		Thread.sleep(500);

		driver.findElement(By.id("curdefcurrency")).click();
		Thread.sleep(500);

		driver.findElement(By.id("curautoupdate")).click();
		Thread.sleep(500);

		WebElement ele117 = driver.findElement(By.name("curdecimalpla"));
		Select drop117 = new Select(ele117);
		drop117.selectByValue("3");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[4]/a[1]/img")).click();
		Thread.sleep(1000);

		WebElement ele111 = driver.findElement(By.xpath("(//*[@class='form-control'])"));
		Select drop111 = new Select(ele111);
		drop111.selectByValue("0");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}
