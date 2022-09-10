package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Administration_Asset_category {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-map orange'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='test - testTT [1003]'])[2]")).click();

		driver.findElement(By.id("level")).sendKeys("1");

		driver.findElement(By.id("tasktitle")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-multi']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.id("teamdesc")).sendKeys("Automation Testing");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])[2]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"teamadd\"]/div/div[2]/div[4]/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Test Project [test try->test try]'])[2]")).click();

		WebElement in = driver.findElement(By.id("stageid"));
		Select loc = new Select(in);
		loc.selectByValue("96|2");

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("test");

		driver.findElement(By.id("taskdesc")).clear();
		driver.findElement(By.id("taskdesc")).sendKeys("Automation Testing");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='testTT [1003]'])[2]")).click();

		driver.findElement(By.id("assignid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Bareeth Home'])[2]")).click(); 

		WebElement in1 = driver.findElement(By.xpath("(//*[@class='form-control'])[4]"));
		Select loc1 = new Select(in1);
		loc1.selectByValue("2");

		driver.findElement(By.id("staffest")).clear();
		driver.findElement(By.id("staffest")).sendKeys("53");

		driver.findElement(By.id("taskcost")).clear();
		driver.findElement(By.id("taskcost")).sendKeys("6000");

		WebElement in11 = driver.findElement(By.xpath("(//*[@class='form-control'])[7]"));
		Select loc11 = new Select(in11);
		loc11.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.id("taskprogress")).clear();
		driver.findElement(By.id("taskprogress")).sendKeys("50");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[3]/div/button[1]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"updtask\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("remark")).sendKeys("Automation Testing");
		Thread.sleep(1000); 

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("test");
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[3]/div/button[1]/a"))
				.click();
		Thread.sleep(1000);
		
		driver.quit();

	}
}
