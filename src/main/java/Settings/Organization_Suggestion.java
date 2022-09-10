package Settings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organization_Suggestion {
	@Test
	public void InventoryManagment() throws InterruptedException, AWTException {

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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[40]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-bell blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("eid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='ABRSYS [123]'])[2]")).click();

		driver.findElement(By.id("customerid_chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='cozmo '])[2]")).click();

		driver.findElement(By.id("typeid___chosen")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Safety'])[2]")).click();

		driver.findElement(By.id("function")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.id("suggestion")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.id("benefit")).sendKeys("test");
		Thread.sleep(500);

		driver.findElement(By.xpath("(//*[@class=' ace-icon ace-icon fa fa-picture-o'])")).click();
		Thread.sleep(1000);
		String file = "C:\\Users\\suppo\\Downloads\\fakru.jpg.jpg";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//*[@class='ace-icon fa fa-times'])")).click();
		Thread.sleep(1000);
		
		//driver.quit();

	}
}
