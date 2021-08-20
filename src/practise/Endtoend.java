package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='VTZ'])[2]")).click();
		Thread.sleep(5000);
//driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		List<WebElement> count = driver.findElements(By.xpath("//td[@data-event='click']"));
		for(int i=0; i<count.size(); i++)
		{
			String number= driver.findElements(By.xpath("//td[@data-event='click']")).get(i).getText();
			if(number.equalsIgnoreCase("30"))
			{
				driver.findElements(By.xpath("//td[@data-event='click']")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		List<WebElement> count1 = driver.findElements(By.xpath("//td[@data-event='click']"));
		for(int i=0; i<count1.size();i++)
		{
			String text = driver.findElements(By.xpath("//td[@data-event='click']")).get(i).getText();
			if(text.equalsIgnoreCase("2"))
			{
				driver.findElements(By.xpath("//td[@data-event='click']")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select s = new Select(dd);
		s.selectByIndex(5);
		WebElement dd2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select s1 = new Select(dd2);
		s1.selectByVisibleText("3");
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s2 = new Select(dropdown);
		s2.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
