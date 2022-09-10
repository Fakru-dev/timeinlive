package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class Automize_schedule_report
   {@Test
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

	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/ul/li[1]/a")).click();
	Thread.sleep(2000);
  
	driver.findElement(By.xpath("//*[@class='orange fa fa-pencil bigger-110']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div/form/div/div/div[2]/div/div/div[2]/div/textarea")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div/form/div/div/div[2]/div/div/div[2]/div/textarea")).sendKeys("1234@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='btn btn-md btn-success']")).click();  
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/nav/div/a[4]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[2]/div/input")).sendKeys("Leave Report");

	driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[3]/div/input")).sendKeys("123@gmail.com");

	Select property = new Select(driver.findElement(By.xpath("//*[@class='button']")));
	property.selectByValue("CSV");
	Thread.sleep(1000); 
 
	driver.findElement(By.xpath("//*[@id=\"Schedule\"]/div/div/div[1]/div/div/input[3]")).click();
	Thread.sleep(1000);

	Select property1 = new Select(driver.findElement(By.xpath("(//*[@class='button'])[3]"))); 
	property1.selectByValue("1");
	Thread.sleep(2000);

    driver.findElement(By.xpath("//*[@id=\"stime\"]")).sendKeys("10:00 AM");

    driver.findElement(By.xpath("//*[@id=\"pageborder\"]/table/tbody/tr/td/div/div/div/div/form/div[5]/div/ul/li[2]/a")).click();
	Thread.sleep(1000);

	Select property11 = new Select(driver.findElement(By.xpath("(//*[@class='form-control'])[2]	")));
	property11.selectByValue("35");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@class='btn btn-sm btn-success']")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-success'])[2]")).click();
	
	driver.quit(); 


}
}
