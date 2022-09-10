package Managment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HumenResource_Leave {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='Leave']")).click(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@class='active-result'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"typeid_chosen\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"typeid_chosen\"]/a/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"absencetype_chosen\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"absencetype_chosen\"]/a/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("leavefrom")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();
		
		driver.findElement(By.id("reason")).clear();
		driver.findElement(By.id("reason")).sendKeys("test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div[2]/form/div[5]/div/div/button[1]/a")).click();
		
		driver.get("http://dev.gcab.in/leaveview.php");
		Thread.sleep(3000);

		driver.quit();
	}
}
