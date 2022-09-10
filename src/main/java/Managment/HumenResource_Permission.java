package Managment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class HumenResource_Permission {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='chosen-single chosen-default']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='active-result'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("date")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();

		driver.findElement(By.id("starttime")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("11");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("endtime")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[1]/input")).sendKeys("12");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[3]/input")).sendKeys("00");

		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[2]/td[5]/input")).sendKeys("00");

		driver.findElement(By.id("reason")).clear();
		driver.findElement(By.id("reason")).sendKeys("test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/div/form/div[8]/div/div/button[1]")).click();

		driver.quit();

	}
}
