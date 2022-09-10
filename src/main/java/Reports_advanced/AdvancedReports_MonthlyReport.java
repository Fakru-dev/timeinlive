package Reports_advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdvancedReports_MonthlyReport {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='  Monthly Report']")).click();
		Thread.sleep(2000);

		Select block = new Select(driver.findElement(By.xpath("//*[@class='form-control swPrpDropSelectRegular']")));
		block.selectByValue("6");
		Thread.sleep(2000);

		Select block1 = new Select(driver.findElement(By.xpath("(//*[@class='form-control swPrpDropSelectRegular'])[2]")));
		block1.selectByValue("2022");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-select2_dropdown_cridepartment-results\"]/li[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-success prepareAjaxExecute swHTMLGoBox']")).click();
		Thread.sleep(3000);
		
		driver.quit();

}
}
