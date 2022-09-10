package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organization_Location {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-street-view green'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("assignloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("branchloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("servloc")).click();
		Thread.sleep(500);

		driver.findElement(By.id("assigndesc")).sendKeys("Test Area");
		Thread.sleep(500);

		driver.findElement(By.id("location")).sendKeys("10.81134171924505, 78.69640666873326");
		Thread.sleep(500);

		driver.findElement(By.id("getlatlng")).click();
		Thread.sleep(500);

		driver.findElement(By.id("city")).sendKeys("Trichy");
		Thread.sleep(500);

		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		Thread.sleep(500);

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click(); 

		driver.findElement(By.id("assignradius")).clear();
		driver.findElement(By.id("assignradius")).sendKeys("100");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[7]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("assigndesc")).clear();
		driver.findElement(By.id("assigndesc")).sendKeys("Testing Area");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='btn btn-md'])")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}