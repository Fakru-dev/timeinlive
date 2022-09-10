package Reports_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicReports_AbsencePlannerTemplate {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Absence Planner Template']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("swDateField_cridate_FROMDATE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"criteria_criempname\"]/td[2]/span/span[1]/span")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_criempname-results\"]/li")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();

		driver.quit();

	} 
}
