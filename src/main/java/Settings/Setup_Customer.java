package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Setup_Customer {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[38]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='menu-icon fa fa-university orange']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Redmi CEO - Redmi CEO'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("contactid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Raja [ Ph:102; Mob :0559166448]'])[2]")).click();

		WebElement ele111 = driver.findElement(By.id("actvtytype"));
		Select drop111 = new Select(ele111);
		drop111.selectByValue("2");
		Thread.sleep(1000);

		driver.findElement(By.id("orgname")).clear();
		driver.findElement(By.id("orgname")).sendKeys("ABR");
		Thread.sleep(500);

		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("ABR");
		Thread.sleep(500);

		driver.findElement(By.id("mobile")).clear();
		driver.findElement(By.id("mobile")).sendKeys("9685741236");
		Thread.sleep(500);

		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("0456987");
		Thread.sleep(500);
 
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("123@gmail.com");
		Thread.sleep(500);

		driver.findElement(By.id("web")).clear();
		driver.findElement(By.id("web")).sendKeys("test.com");
		Thread.sleep(500);

		driver.findElement(By.id("location")).clear();
		driver.findElement(By.id("location")).sendKeys("13.0826802;80.2707184");
		Thread.sleep(500);
		driver.findElement(By.id("getlatlng")).click();
		Thread.sleep(500);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("trichy");
		Thread.sleep(500);

		driver.findElement(By.id("country_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='INDIA'])[2]")).click();
		Thread.sleep(500);

		driver.findElement(By.id("login")).sendKeys("test@abrsys.com");
		Thread.sleep(500);

		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='bahadur - bahadur'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);
		
		driver.quit();

	} 
}
