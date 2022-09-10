package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automize_ShiftPlanner {
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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='fc-next-button fc-button fc-button-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='fc-next-button fc-button fc-button-primary']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='fc-today-button fc-button fc-button-primary']")).click();
		
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//*[@id=\"12\"]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[1]/td/div")); 
		builder.dragAndDrop(from, to).perform();
		Thread.sleep(1000);

		Actions builder1 = new Actions(driver);
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"57\"]"));
		WebElement to1 = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[3]/td/div")); 
		builder1.dragAndDrop(from1, to1).perform();
		Thread.sleep(1000);

		Actions builder2 = new Actions(driver);
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"59\"]"));
		WebElement to2 = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td[3]/div/div/div/div[1]/div/table/tbody/tr[4]/td/div")); 
		builder2.dragAndDrop(from2, to2).perform();
		
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/div/button[1]")).click();
		Thread.sleep(1000);

		driver.quit();

	}
}
