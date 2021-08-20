package progrmas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEndFlightSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='VTZ']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		Thread.sleep(5000);
//driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[7]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select s = new Select(dd);
		s.selectByIndex(2);
		
		WebElement cur = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select ss = new Select(cur);
		ss.selectByIndex(3);
		
//driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		
	}

}
