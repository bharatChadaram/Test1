package practise1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[6]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[6]")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select s = new Select(adult);
		s.selectByIndex(5);
		WebElement child = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select s1 = new Select(child);
		s1.selectByIndex(2);
		
		WebElement currency = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select s2 = new Select(currency);
		s2.selectByIndex(5);
		
		

	}

}
