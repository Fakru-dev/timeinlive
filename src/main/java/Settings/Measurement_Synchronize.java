package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Measurement_Synchronize {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-cog green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-choices']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mdeviceid_chosen\"]/ul/li[1]"));

		driver.findElement(By.id("departid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"departid_chosen\"]/ul/li[1]/span"));
		
		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]/ul/li[1]/span"));
		
		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().accept();
		Thread.sleep(1000);

}
}
