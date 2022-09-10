package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Administration_Services_Maintenance {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[34]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-eye pink'])[8]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='AlFareeda'])[2]")).click();

		driver.findElement(By.id("amcdesc")).sendKeys("Test");

		driver.findElement(By.id("amcstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[1]")).click();

		driver.findElement(By.id("amcexpirydate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[6]/td[1]")).click();

		WebElement ele54 = driver.findElement(By.id("billingcycle"));
		Select drop54 = new Select(ele54);
		drop54.selectByValue("2");

		WebElement ele543 = driver.findElement(By.id("preventivemaintenance"));
		Select drop543 = new Select(ele543);
		drop543.selectByValue("2");

		driver.findElement(By.id("amcpackage")).sendKeys("Test");
		driver.findElement(By.id("amcrenewal")).sendKeys("Test");
		driver.findElement(By.id("remarks")).sendKeys("Test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("installdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[4]/td[2]")).click();

		WebElement ele55 = driver.findElement(By.id("locationid"));
		Select drop55 = new Select(ele55);
		drop55.selectByValue("20");
		Thread.sleep(1000);

		WebElement ele56 = driver.findElement(By.id("sparesid"));
		Select drop56 = new Select(ele56);
		drop56.selectByValue("28|Air Bolt|3");
		Thread.sleep(1000);

		driver.findElement(By.id("btnSparesadd")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("amcdesc")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		
		driver.quit();

	}
} 
