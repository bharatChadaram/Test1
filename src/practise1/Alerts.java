package practise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys("bharat");
			driver.findElement(By.id("alertbtn")).click();
			
			Alert a = driver.switchTo().alert();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(5000);

			a.accept();
			
			
	}

}
