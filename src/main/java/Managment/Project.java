package Managment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Project {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='btn btn-white btn-xs']")).click();
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.id("compstat"));
		Select drop = new Select(ele);
		drop.selectByValue("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[text()='testTT(1003)'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[5]/td[11]/a")).click();
		Thread.sleep(1000);

		WebElement ele3 = driver.findElement(By.id("compstat"));
		Select drop3 = new Select(ele3);
		drop3.selectByValue("3");

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='testTT(1003)'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div[1]/nav/div/a[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Choose Customer...']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='AlFareeda'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[9]/a[1]/img")).click();

		driver.findElement(By.id("entityname")).clear();
		driver.findElement(By.id("entityname")).sendKeys("auto test");

		driver.findElement(By.id("entitydesc")).sendKeys("automation testing");

		driver.findElement(By.xpath("//*[text()='Choose Department...']")).click();
		driver.findElement(By.xpath("//*[text()='LKN-IFMS']"));

		driver.findElement(By.id("entityref")).clear();
		driver.findElement(By.id("entityref")).sendKeys("4569874");

		driver.findElement(By.id("entityloc")).clear();
		driver.findElement(By.id("entityloc")).sendKeys("try");

		driver.findElement(By.xpath("//*[text()='Choose Location...']")).click();
		driver.findElement(By.xpath("//*[text()='Branch-CHN']"));

		driver.findElement(By.id("startdate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]")).click();

		driver.findElement(By.id("enddate")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.id("staffest")).clear();
		driver.findElement(By.id("staffest")).sendKeys("56");

		driver.findElement(By.id("entitycost")).clear();
		driver.findElement(By.id("entitycost")).sendKeys("120000");

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"stage\"]")).sendKeys("testing");

		driver.findElement(By.xpath("//*[@id=\"stagecnt\"]")).sendKeys("20");

		driver.findElement(By.id("mstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]")).click();

		driver.findElement(By.id("menddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"addstage\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"removeSelected\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[1]/div/div[1]/div/ul/li[3]/a"))
				.click();
		Thread.sleep(1000);

		WebElement ele15 = driver.findElement(By.id("productid"));
		Select drop15 = new Select(ele15);
		drop15.selectByValue("6");
		Thread.sleep(1000);

		driver.findElement(By.id("quantity")).sendKeys("5");

		WebElement ewle15 = driver.findElement(By.id("unit"));
		Select dwrop15 = new Select(ewle15);
		dwrop15.selectByValue("3 | Boxes");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"addprod\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid1\"]/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"prodremoveSelected\"]")).click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/div[2]/form/div/div[2]/div/div/button[1]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/nav/div/a[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-primary btn-sm'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"updtask\"]")).click();
		Thread.sleep(1000);

		WebElement ele33 = driver.findElement(By.id("compstat"));
		Select drop33 = new Select(ele33);
		drop33.selectByValue("2");

		driver.findElement(By.xpath("//*[@id=\"eid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"eid_chosen\"]/a/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("plandate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"remark\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"assign-form\"]/div/div/div[3]/div/div/button[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[11]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("tasktitle")).clear();
		driver.findElement(By.id("tasktitle")).sendKeys("automation testing");

		driver.findElement(By.id("taskdesc")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"empid_chosen\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Hakim [2601]'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"departid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='General'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"assignid_chosen\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='abr test'])[2]")).click();

		driver.findElement(By.id("taskstartdate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.id("taskenddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]")).click();

		WebElement ele23 = driver.findElement(By.xpath("(//*[@class='form-control'])[4]"));
		Select drop23 = new Select(ele23);
		drop23.selectByValue("2");

		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("56");

		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("120000");

		WebElement ele231 = driver.findElement(By.xpath("(//*[@class='form-control'])[7]"));
		Select drop231 = new Select(ele231); 
		drop231.selectByValue("2");

		driver.findElement(By.xpath("(//*[@class='form-control'])[8]")).clear();
		driver.findElement(By.xpath("(//*[@class='form-control'])[8]")).sendKeys("50");

		driver.findElement(
				By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div/form/div/div[3]/div[1]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@name='group'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"group\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn moveall btn-white btn-bold btn-info'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='btn btn-md btn-success'])")).click();
		
		driver.quit();

	}
}