package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HumanResource_Staff {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='5115 | FAKRUDEEN'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr/td[12]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("employeename")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("employeename")).sendKeys("FAKRU ABR");

		driver.findElement(By.xpath("//*[@id=\"personal\"]/div/div[1]/div[1]/div[2]/div/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personal\"]/div/div[1]/div[1]/div[2]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"cardno\"]")).sendKeys("45632");

		driver.findElement(By.xpath("//*[@id=\"phoneno\"]")).sendKeys("987456321");

		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("try");

		driver.findElement(By.xpath("//*[@id=\"rfidmac\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"rfidmac\"]")).sendKeys("365298743652");

		driver.findElement(By.xpath("//*[@id=\"dateofbirth\"]")).click();
		Thread.sleep(1000);

		WebElement ele15 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select drop15 = new Select(ele15);
		drop15.selectByValue("11");
		Thread.sleep(1000);

		WebElement ele115 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select drop115 = new Select(ele115);
		drop115.selectByValue("1980");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"placeofbirth\"]")).sendKeys("tamil nadu");

		driver.findElement(By.xpath("//*[@id=\"ethinic\"]")).sendKeys("4564");

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Male'])[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"remarks\"]")).sendKeys("automation testing");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@class='form-control input-mask-date hasDatepicker']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control input-mask-date hasDatepicker'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='form-control input-mask-date hasDatepicker'])[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='General'])[3]")).click();

		driver.findElement(By.id("designation")).sendKeys("Developer");

		driver.findElement(By.id("skill")).sendKeys("Developing");

		driver.findElement(By.id("phoneExtn")).sendKeys("987654321");

		driver.findElement(By.id("emailid")).sendKeys("fakrudeen@gmail.com");

		driver.findElement(By.id("macid")).sendKeys("968545");

		driver.findElement(By.name("prjagent")).click();

		driver.findElement(By.name("salagent")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='test [PTest]'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-single'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='ankidyne [ankidyne]'])[2]")).click();

		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-multi'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Butp'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[1]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[2]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[3]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgverify\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"imgrestrict\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[4]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[3]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgverify\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"imgrestrict\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[4]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"imgauto\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"mobileoptions\"]/div/div[4]/div[5]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"pageborder\"]/div/table/tbody/tr/td/div[2]/div/div/button[1]/a")).click();

		//driver.quit();

	}
}
