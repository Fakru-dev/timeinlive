package Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Setup_Role {
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

		driver.findElement(By.xpath("(//*[@class='menu-icon fa fa-user-times blue'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("rolename")).sendKeys("Testing");
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.id("moduleid"));
		Select drop = new Select(ele);
		drop.selectByValue("1");
		Thread.sleep(1000);

		WebElement ele1 = driver.findElement(By.id("itemid"));
		Select drop1 = new Select(ele1);
		drop1.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		WebElement ele2 = driver.findElement(By.id("moduleid"));
		Select drop2 = new Select(ele2);
		drop2.selectByValue("7");
		Thread.sleep(1000);

		WebElement ele11 = driver.findElement(By.id("itemid"));
		Select drop11 = new Select(ele11);
		drop11.selectByValue("25");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		WebElement ele3 = driver.findElement(By.id("moduleid"));
		Select drop3 = new Select(ele3);
		drop3.selectByValue("6");
		Thread.sleep(1000);

		WebElement ele12 = driver.findElement(By.id("itemid"));
		Select drop12 = new Select(ele12);
		drop12.selectByValue("46");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(500);

		driver.findElement(By.id("removeSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("save")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[4]/a[1]/img")).click();
		Thread.sleep(1000);

		WebElement ele31 = driver.findElement(By.id("moduleid"));
		Select drop31 = new Select(ele31);
		drop31.selectByValue("6");
		Thread.sleep(1000);

		WebElement ele112 = driver.findElement(By.id("itemid"));
		Select drop112 = new Select(ele112);
		drop112.selectByValue("46");
		Thread.sleep(1000);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("edit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("delete")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("view")).click();
		Thread.sleep(500);

		driver.findElement(By.id("add")).click();
		Thread.sleep(500);

		driver.findElement(By.id("addmod")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("save")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}
}
