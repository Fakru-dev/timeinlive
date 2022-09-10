package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Administration_Asset_Sparce {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-wrench blue'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Mobiles'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])")).sendKeys("Mobile");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Ducketmesh'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("Test");
		driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).sendKeys("2");
		driver.findElement(By.xpath("(//*[@class='form-control'])[4]")).sendKeys("5");
		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("OPPO");
		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("Test");
		driver.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("20000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[5]/center/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[8]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("laptop");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[5]/center/div/button[1]/a")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}
}