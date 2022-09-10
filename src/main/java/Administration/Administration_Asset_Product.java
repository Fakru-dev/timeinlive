package Administration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Administration_Asset_Product {

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

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[text()='Add'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("productref")).sendKeys("12462354");
		driver.findElement(By.id("productname")).sendKeys("Test");
		driver.findElement(By.id("model")).sendKeys("Test Model");
		driver.findElement(By.id("dimension")).sendKeys("Test");
		driver.findElement(By.id("color")).sendKeys("Red");
		driver.findElement(By.id("weight")).sendKeys("5 Kg");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		WebElement ele26 = driver.findElement(By.id("assignid"));
		Select drop26 = new Select(ele26);
		drop26.selectByValue("61");

		driver.findElement(By.id("locquantity")).sendKeys("5");

		WebElement ele27 = driver.findElement(By.id("locunitid"));
		Select drop27 = new Select(ele27);
		drop27.selectByValue("3|Boxes");

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary btn-block'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele28 = driver.findElement(By.id("assignid"));
		Select drop28 = new Select(ele28);
		drop28.selectByValue("78");

		driver.findElement(By.id("locquantity")).sendKeys("5");

		WebElement ele29 = driver.findElement(By.id("locunitid"));
		Select drop29 = new Select(ele29);
		drop29.selectByValue("3|Boxes");

		driver.findElement(By.xpath("(//*[@class='btn btn-sm btn-primary btn-block'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"show_location\"]/tr/td[1]/input")).click();

		driver.findElement(By.id("locremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		WebElement ele30 = driver.findElement(By.id("vendorid"));
		Select drop30 = new Select(ele30);
		drop30.selectByValue("980");
		
		driver.findElement(By.id("vndcost")).sendKeys("500");
		
		driver.findElement(By.id("addsup")).click(); 
		Thread.sleep(1000);

		WebElement ele32 = driver.findElement(By.id("vendorid"));
		Select drop32 = new Select(ele32);
		drop32.selectByValue("983");

		driver.findElement(By.id("vndcost")).clear();
		driver.findElement(By.id("vndcost")).sendKeys("500");

		driver.findElement(By.xpath("//*[@id=\"show_supplier\"]/tr/td[1]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("supremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		WebElement ele34 = driver.findElement(By.id("sparesid"));
		Select drop34 = new Select(ele34);
		drop34.selectByValue("18");
		
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("200");

		WebElement ele35 = driver.findElement(By.id("unitid"));
		Select drop35 = new Select(ele35);
		drop35.selectByValue("4|Litres");
		Thread.sleep(1000);

		driver.findElement(By.id("addprod")).click();
		Thread.sleep(1000);

		WebElement ele36 = driver.findElement(By.id("sparesid"));
		Select drop36 = new Select(ele36);
		drop36.selectByValue("21");

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("200");

		WebElement ele37 = driver.findElement(By.id("unitid"));
		Select drop37 = new Select(ele37);
		drop37.selectByValue("2|Kilogram");
		Thread.sleep(1000);

		driver.findElement(By.id("addprod")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"show_product\"]/tr/td[1]/input")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("prodremoveSelected")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("serviceplan")).sendKeys("test");

		driver.findElement(By.id("servdesc")).sendKeys("test");

		WebElement ele38 = driver.findElement(By.id("frequency"));
		Select drop38 = new Select(ele38);
		drop38.selectByValue("2");

		driver.findElement(By.id("frequnits")).sendKeys("99");
		driver.findElement(By.id("leaddays")).sendKeys("26");
		driver.findElement(By.id("estdue")).sendKeys("10");

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"grid\"]/tbody/tr[1]/td[10]/a[1]/img")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("productname")).clear();
		driver.findElement(By.id("productname")).sendKeys("AC");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("locquantity")).clear();
		driver.findElement(By.id("locquantity")).sendKeys("58");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("vndcost")).clear();
		driver.findElement(By.id("vndcost")).sendKeys("600");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("9");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@class='text-primary menu-icon fa fa-clipboard-list'])[4]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("serviceplan")).clear();
		driver.findElement(By.id("serviceplan")).sendKeys("Test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='btn btn-md']")).click();

		driver.quit(); 
	}
}
