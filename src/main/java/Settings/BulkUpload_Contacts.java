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

public class BulkUpload_Contacts {
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

		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[41]")).click();
		Thread.sleep(1000);
		driver.getTitle();

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-user blue'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("excelmodel")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/center/table/tbody/tr[1]/td[3]")).click();
		Thread.sleep(1000);
		String file1 = "C:\\Users\\suppo\\Downloads\\contactimport";
		StringSelection selection1 = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.name("Add")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}
