package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automize_Services_Planner {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-calendar-plus-o orange']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='chosen-single chosen-single-with-deselect']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
}
}
