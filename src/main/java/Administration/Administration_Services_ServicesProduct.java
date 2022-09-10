package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Administration_Services_ServicesProduct {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-qrcode blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr ->'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).sendKeys("5");

		driver.findElement(By.xpath("(//*[@class='form-control'])[4]")).sendKeys("3562");

		driver.findElement(By.id("sodate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.id("dodate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.id("locationid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("Test Area");

		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("Test");

		driver.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("12000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='text-primary menu-icon fa fa-clipboard-list']")).click();
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.id("productid"));
		Select drop = new Select(ele);
		drop.selectByValue("38|Water Meter|30");

		WebElement ele1 = driver.findElement(By.id("stkassignid"));
		Select drop1 = new Select(ele1);
		drop1.selectByValue("19|30");

		driver.findElement(By.xpath("(//*[@class='form-control'])[11]")).sendKeys("458658");
		driver.findElement(By.xpath("(//*[@class='form-control'])[13]")).sendKeys("45698563");
		driver.findElement(By.xpath("(//*[@class='form-control'])[15]")).sendKeys("236589");
		driver.findElement(By.xpath("(//*[@class='form-control'])[17]")).sendKeys("4587962");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"defassign\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"assign\"]/div[2]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"assign\"]/div[2]/input[1]")).click();

		WebElement ele2 = driver.findElement(By.id("eid"));
		Select drop2 = new Select(ele2);
		drop2.selectByValue("2472");

		driver.findElement(By.xpath("//*[@id=\"escalate\"]")).click();

		WebElement ele3 = driver.findElement(By.id("priority"));
		Select drop3 = new Select(ele3);
		drop3.selectByValue("2");

		driver.findElement(By.xpath("//*[@id=\"prevschedule\"]")).click();

		driver.findElement(By.id("prevactivity")).sendKeys("test");

		WebElement ele4 = driver.findElement(By.id("prevperiod"));
		Select drop4 = new Select(ele4);
		drop4.selectByValue("4");

		driver.findElement(By.id("prevfreq")).sendKeys("5");

		driver.findElement(By.id("prevlead")).sendKeys("9");

		driver.findElement(By.id("prevestimate")).sendKeys("5");

		driver.findElement(By.id("prevautoclose")).sendKeys("7");

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele5 = driver.findElement(By.id("deviceid"));
		Select drop5 = new Select(ele5);
		drop5.selectByValue("105");

		driver.findElement(By.id("minlimit")).sendKeys("7");

		driver.findElement(By.id("maxlimit")).sendKeys("20");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("sonum")).clear();
		driver.findElement(By.id("sonum")).sendKeys("1");

		driver.findElement(By.xpath("//*[@class='text-primary menu-icon fa fa-clipboard-list']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("val-\"23\"")).clear();
		driver.findElement(By.id("val-\"23\"")).sendKeys("82");

		driver.findElement(By.id("val-\"24\"")).clear();
		driver.findElement(By.id("val-\"24\"")).sendKeys("69"); 

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele52 = driver.findElement(By.id("eid"));
		Select drop52 = new Select(ele52);
		drop52.selectByValue("2472");

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele51 = driver.findElement(By.id("deviceid"));
		Select drop51 = new Select(ele51);
		drop51.selectByValue("108");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/nav/div/a[2]")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}
