package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Administration_Telephone_Callrates {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[36]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-credit-card green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prefixcode")).sendKeys("10");

		driver.findElement(By.id("countryid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='LATVIA => 371'])[2]")).click();

		driver.findElement(By.id("vendor")).sendKeys("Etisalat");

		driver.findElement(By.id("cost")).sendKeys("0.20000");
		Thread.sleep(1000);

		driver.findElement(By.id("assigndt")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.id("expiredt")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[4]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prefixcode")).clear();
		driver.findElement(By.id("prefixcode")).sendKeys("60");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-info btn-fill'])")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}
}
